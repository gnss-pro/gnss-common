package com.gnss.mqutil.event;

import com.gnss.core.annotations.DownCommand;
import com.gnss.core.constants.CommonConstant;
import com.gnss.core.constants.ProtocolEnum;
import com.gnss.core.model.DownCommandInfo;
import com.gnss.core.service.IDownCommandMessage;
import lombok.extern.slf4j.Slf4j;
import org.reflections.Reflections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>Description: 注册下行指令</p>
 *
 * @author Pendy
 * @version 1.0.1
 * @date 2018-9-14
 */
@Slf4j
public class DownCommandRegister {

    /**
     * 扫描注解的包前缀
     */
    private final String scanPrefix;

    /**
     * 下行指令映射
     */
    private final Map<Class, DownCommandInfo> classMap = new HashMap<>();

    public DownCommandRegister(String scanPrefix) {
        this.scanPrefix = scanPrefix;
        Reflections reflections = new Reflections(scanPrefix);
        reflections.getTypesAnnotatedWith(DownCommand.class).stream()
                .filter(IDownCommandMessage.class::isAssignableFrom)
                .forEach(this::registerDownCommand);
    }

    /**
     * 注册下行指令
     *
     * @param clazz
     */
    private void registerDownCommand(Class<?> clazz) {
        //获取注解的信息
        DownCommand annotation = clazz.getAnnotation(DownCommand.class);
        ProtocolEnum protocol = annotation.protocol();
        int messageId = annotation.messageId();
        String strMessageId = messageId == CommonConstant.DEFAULT_MESSAGE_ID ? annotation.strMessageId() : String.format("%04x", messageId).toUpperCase();
        int respMessageId = annotation.respMessageId();
        String strRespMessageId = respMessageId == CommonConstant.DEFAULT_MESSAGE_ID ? annotation.strRespMessageId() : String.format("%04x", respMessageId).toUpperCase();
        String desc = annotation.desc();

        DownCommandInfo downCommandInfo = new DownCommandInfo();
        downCommandInfo.setDownCommandId(strMessageId);
        downCommandInfo.setRespCommandId(strRespMessageId);
        downCommandInfo.setDesc(desc);
        downCommandInfo.setCommandParamClass(clazz);
        classMap.put(clazz, downCommandInfo);
        log.info("注册下行指令,协议类型:{},指令类型:{},指令描述:{},响应指令:{},指令参数:{}", protocol, strMessageId, desc, strRespMessageId, clazz.getName());
    }

    /**
     * 根据类查询下行指令信息
     *
     * @param clazz
     * @return
     */
    public DownCommandInfo getDownCommandInfo(Class clazz) {
        return classMap.get(clazz);
    }

    /**
     * 获取支持的下行指令列表
     *
     * @return
     */
    public List<DownCommandInfo> getSupportedDownCommand() {
        List<DownCommandInfo> allDownCommandInfo = new ArrayList<>(classMap.values());
        Collections.sort(allDownCommandInfo, Comparator.comparing(DownCommandInfo::getDownCommandId));
        return allDownCommandInfo;
    }
}