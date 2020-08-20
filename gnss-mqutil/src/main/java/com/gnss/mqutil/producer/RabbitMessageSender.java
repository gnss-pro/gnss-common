package com.gnss.mqutil.producer;

import com.alibaba.fastjson.JSON;
import com.gnss.core.constants.MessageSendResultEnum;
import com.gnss.core.constants.TerminalStatusEnum;
import com.gnss.core.constants.UploadDataTypeEnum;
import com.gnss.core.model.config.ServerStatus;
import com.gnss.core.proto.AttachmentInfoProto;
import com.gnss.core.proto.CommandProto;
import com.gnss.core.proto.Jt808LogProto;
import com.gnss.core.proto.LocationProto;
import com.gnss.core.proto.MediaFileProto;
import com.gnss.core.proto.RpcProto;
import com.gnss.core.proto.TerminalProto;
import com.gnss.core.proto.TerminalStatusProto;
import com.gnss.core.proto.TerminalUploadDataProto;
import com.gnss.mqutil.constants.MqConstant;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpMessageReturnedException;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitMessagingTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;

import java.util.UUID;

/**
 * <p>Description: RabbitMQ消息发送</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2018/4/13
 */
@Slf4j
public class RabbitMessageSender {

    private final RabbitTemplate rabbitTemplate;

    private final RabbitTemplate jsonRabbitTemplate;

    public RabbitMessageSender(RabbitTemplate rabbitTemplate, RabbitTemplate jsonRabbitTemplate) {
        RabbitMessagingTemplate rabbitMessagingTemplate = new RabbitMessagingTemplate();
        rabbitMessagingTemplate.setRabbitTemplate(rabbitTemplate);
        this.rabbitTemplate = rabbitTemplate;
        this.jsonRabbitTemplate = jsonRabbitTemplate;
    }

    /**
     * 通知上线
     *
     * @param terminalInfo 终端信息
     */
    public void noticeOnline(TerminalProto terminalInfo) {
        sendTerminalStatus(terminalInfo.getNodeName(), terminalInfo, null, TerminalStatusEnum.ONLINE, null);
    }

    /**
     * 通知服务器启动
     *
     * @param nodeName
     * @param serverStatus
     */
    public void noticeServerStartup(String nodeName, ServerStatus serverStatus) {
        sendServerStatus(nodeName, TerminalStatusEnum.SERVER_STARTUP, serverStatus);
    }

    /**
     * 通知服务器关闭
     *
     * @param nodeName
     * @param serverStatus
     */
    public void noticeServerShutdown(String nodeName, ServerStatus serverStatus) {
        sendServerStatus(nodeName, TerminalStatusEnum.SERVER_SHUTDOWN, serverStatus);
    }

    /**
     * 发送服务器信息
     *
     * @param nodeName
     * @param status
     * @param serverStatus
     */
    private void sendServerStatus(String nodeName, TerminalStatusEnum status, ServerStatus serverStatus) {
        TerminalStatusProto terminalStatusProto = new TerminalStatusProto();
        terminalStatusProto.setNodeName(nodeName);
        terminalStatusProto.setTerminalStatus(status);
        terminalStatusProto.setServerStatus(JSON.toJSONString(serverStatus));
        String routingKey = String.format("%s.%s.terminal.status", status.name(), nodeName);
        rabbitTemplate.convertAndSend(MqConstant.TERMINAL_STATUS_EXCHANGE, routingKey, terminalStatusProto);
    }

    /**
     * 通知离线
     *
     * @param terminalInfo 终端信息
     */
    public void noticeOffline(TerminalProto terminalInfo) {
        sendTerminalStatus(terminalInfo.getNodeName(), terminalInfo, null, TerminalStatusEnum.OFFLINE, null);
    }

    /**
     * 发送位置(以JT808位置为主)
     *
     * @param terminalInfo 终端信息
     * @param msgFlowId    消息流水号
     * @param location     位置信息
     * @return
     * @throws Exception
     */
    public TerminalStatusProto sendLocation(TerminalProto terminalInfo, Integer msgFlowId, LocationProto location) throws Exception {
        return sendTerminalStatus(terminalInfo.getNodeName(), terminalInfo, msgFlowId, TerminalStatusEnum.LOCATION, location);
    }

    /**
     * 发送补报位置信息
     *
     * @param terminalInfo 终端信息
     * @param msgFlowId    消息流水号
     * @param location     位置信息
     * @return
     * @throws Exception
     */
    public TerminalStatusProto sendHistoryLocation(TerminalProto terminalInfo, Integer msgFlowId, LocationProto location) throws Exception {
        return sendTerminalStatus(terminalInfo.getNodeName(), terminalInfo, msgFlowId, TerminalStatusEnum.HISTORY_LOCATION, location);
    }

    /**
     * 发送终端状态
     *
     * @param nodeName           节点名称
     * @param terminalInfo       终端信息
     * @param msgFlowId          消息流水号
     * @param terminalStatusEnum 终端状态类型
     * @param location           位置
     */
    private TerminalStatusProto sendTerminalStatus(String nodeName, TerminalProto terminalInfo, Integer msgFlowId, TerminalStatusEnum terminalStatusEnum, LocationProto location) {
        TerminalStatusProto terminalStatusProto = new TerminalStatusProto();
        terminalStatusProto.setNodeName(nodeName);
        terminalStatusProto.setTerminalInfo(terminalInfo);
        terminalStatusProto.setTerminalStatus(terminalStatusEnum);
        terminalStatusProto.setMsgFlowId(msgFlowId);
        terminalStatusProto.setLocation(location);
        String routingKey = String.format("%s.%s.terminal.status", terminalInfo.getTerminalStrId(), nodeName);
        rabbitTemplate.convertAndSend(MqConstant.TERMINAL_STATUS_EXCHANGE, routingKey, terminalStatusProto);
        return terminalStatusProto;
    }

    /**
     * 发送多媒体文件
     *
     * @param mediaFileProto 多媒体文件
     * @throws Exception 异常
     */
    public void sendMediaFile(MediaFileProto mediaFileProto) throws Exception {
        String nodeName = mediaFileProto.getTerminalInfo().getNodeName();
        String routingKey = String.format("%s.%s.media.file", mediaFileProto.getTerminalInfo().getTerminalStrId(), nodeName);
        rabbitTemplate.convertAndSend(MqConstant.MEDIA_FILE_EXCHANGE, routingKey, mediaFileProto);
    }

    /**
     * 发送下行指令
     *
     * @param commandProto 指令信息
     * @throws Exception 异常
     */
    public void sendDownCommand(CommandProto commandProto) throws Exception {
        String nodeName = commandProto.getToNode();
        String routingKey = String.format("%s.%s.down.command", commandProto.getTerminalInfo().getTerminalStrId(), nodeName);
        rabbitTemplate.convertAndSend(MqConstant.DOWN_COMMAND_EXCHANGE, routingKey, commandProto);
    }

    /**
     * 发送JSON下行指令
     *
     * @param commandProto 指令信息
     * @throws Exception 异常
     */
    public void sendJsonDownCommand(CommandProto commandProto) throws Exception {
        String nodeName = commandProto.getToNode();
        String routingKey = String.format("%s.%s.down.command", commandProto.getTerminalInfo().getTerminalStrId(), nodeName);
        jsonRabbitTemplate.convertAndSend(MqConstant.DOWN_COMMAND_EXCHANGE, routingKey, commandProto);
    }

    /**
     * 发送上行指令
     *
     * @param commandProto 指令信息
     * @throws Exception 异常
     */
    public void sendUpCommand(CommandProto commandProto) throws Exception {
        String nodeName = commandProto.getFromNode();
        String routingKey = String.format("%s.%s.up.command", commandProto.getTerminalInfo().getTerminalStrId(), nodeName);
        rabbitTemplate.convertAndSend(MqConstant.UP_COMMAND_EXCHANGE, routingKey, commandProto);
    }

    /**
     * 发送JSON上行指令
     *
     * @param commandProto 指令信息
     * @throws Exception 异常
     */
    public void sendJsonUpCommand(CommandProto commandProto) throws Exception {
        String nodeName = commandProto.getFromNode();
        String routingKey = String.format("%s.%s.up.command", commandProto.getTerminalInfo().getTerminalStrId(), nodeName);
        jsonRabbitTemplate.convertAndSend(MqConstant.UP_COMMAND_EXCHANGE, routingKey, commandProto);
    }

    /**
     * 发送Web RPC请求
     *
     * @param rpcProto RPC信息
     * @return RPC结果
     */
    public RpcProto sendWebRpc(RpcProto rpcProto) throws Exception {
        return sendRpc(MqConstant.WEB_RPC_ROUTING_KEY, rpcProto);
    }

    /**
     * 发送JT808 RPC请求
     *
     * @param rpcProto RPC信息
     * @return RPC结果
     */
    public RpcProto sendJt808Rpc(RpcProto rpcProto) throws Exception {
        return sendRpc(MqConstant.JT808_RPC_ROUTING_KEY, rpcProto);
    }

    /**
     * 发送JT809 RPC请求
     *
     * @param rpcProto RPC信息
     * @return RPC结果
     */
    public RpcProto sendJt809Rpc(RpcProto rpcProto) {
        return sendRpc(MqConstant.JT809_RPC_ROUTING_KEY, rpcProto);
    }

    /**
     * 发送文件服务器RPC请求
     *
     * @param rpcProto RPC信息
     * @return RPC结果
     */
    public RpcProto sendFileServerRpc(RpcProto rpcProto) {
        return sendRpc(MqConstant.FILE_SERVER_RPC_ROUTING_KEY, rpcProto);
    }

    /**
     * 发送终端上传数据给web
     *
     * @param terminalInfo   终端信息
     * @param uploadDataType 上传数据类型
     * @param uploadData     上传数据
     * @throws Exception
     */
    public void sendUploadData2Web(TerminalProto terminalInfo, UploadDataTypeEnum uploadDataType, Object uploadData) throws Exception {
        String uploadDataJson = uploadData == null ? null : JSON.toJSONString(uploadData);
        TerminalUploadDataProto uploadDataProto = new TerminalUploadDataProto(terminalInfo, uploadDataType, uploadDataJson);
        String routingKey = String.format("%s.web.upload.data", uploadDataProto.getTerminalInfo().getTerminalStrId());
        rabbitTemplate.convertAndSend(MqConstant.WEB_UPLOAD_DATA_EXCHANGE, routingKey, uploadDataProto);
    }

    /**
     * 发送终端上传数据给JT809
     *
     * @param terminalInfo   终端信息
     * @param uploadDataType 上传数据类型
     * @param uploadData     上传数据
     * @throws Exception
     */
    public void sendUploadData2Jt809(TerminalProto terminalInfo, UploadDataTypeEnum uploadDataType, Object uploadData) throws Exception {
        String uploadDataJson = JSON.toJSONString(uploadData);
        TerminalUploadDataProto uploadDataProto = new TerminalUploadDataProto(terminalInfo, uploadDataType, uploadDataJson);
        String routingKey = String.format("%s.jt809.upload.data", uploadDataProto.getTerminalInfo().getTerminalStrId());
        rabbitTemplate.convertAndSend(MqConstant.JT809_UPLOAD_DATA_EXCHANGE, routingKey, uploadDataProto);
    }

    /**
     * 发送JT808日志
     *
     * @param jt808LogProto
     */
    public void sendJt808Log(Jt808LogProto jt808LogProto) {
        String routingKey = String.format("%s.jt808.log", jt808LogProto.getPhoneNumber());
        rabbitTemplate.convertAndSend(MqConstant.JT808_LOG_EXCHANGE, routingKey, jt808LogProto);
    }

    /**
     * 发送附件信息
     *
     * @param attachmentInfo
     */
    public void sendAttachmentInfo(AttachmentInfoProto attachmentInfo) {
        String routingKey = String.format("%s.attachment", attachmentInfo.getTerminalInfo().getTerminalStrId());
        rabbitTemplate.convertAndSend(MqConstant.ATTACHMENT_EXCHANGE, routingKey, attachmentInfo);
    }

    /**
     * 发送RPC请求
     *
     * @param routingKey
     * @param rpcProto
     * @return
     */
    private RpcProto sendRpc(String routingKey, RpcProto rpcProto) {
        RpcProto response = null;
        try {
            CorrelationData correlationId = new CorrelationData(UUID.randomUUID().toString());
            response = (RpcProto) rabbitTemplate.convertSendAndReceive(MqConstant.RPC_EXCHANGE, routingKey, rpcProto, correlationId);
        } catch (AmqpMessageReturnedException returnException) {
            rpcProto.setRpcResult(MessageSendResultEnum.NO_ROUTE);
            rpcProto.setErrorMsg(returnException.getMessage());
            response = rpcProto;
        } catch (Exception e) {
            rpcProto.setRpcResult(MessageSendResultEnum.EXCEPTION);
            rpcProto.setErrorMsg(e.getMessage());
            response = rpcProto;
        }
        return response;
    }
}