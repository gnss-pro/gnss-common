package com.gnss.mqutil.configuration;

import com.gnss.core.service.RedisService;
import com.gnss.core.utils.CommonUtil;
import com.gnss.mqutil.constants.MqConstant;
import com.gnss.mqutil.converter.ProtobufMessageConverter;
import com.gnss.mqutil.producer.RabbitMessageSender;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AcknowledgeMode;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.Objects;

/**
 * <p>Description: 基础bean配置</p>
 * <p>Company: www.gps-pro.cn</p>
 *
 * @author huangguangbin
 * @version 1.0.1
 * @date 2018-12-30
 */
@Slf4j
public class BaseConfiguration {

    @Value("${gnss.middleware-ip}")
    private String host;

    @Value(("${gnss.message.converter}"))
    private String msgConverter;

    /**
     * Redis模板
     *
     * @param connectionFactory 连接工厂
     * @return
     */
    @Bean
    public StringRedisTemplate redisTemplate(RedisConnectionFactory connectionFactory) {
        StringRedisTemplate stringRedisTemplate = new StringRedisTemplate(connectionFactory);
        return stringRedisTemplate;
    }

    /**
     * Redis服务
     *
     * @param redisTemplate Redis模板
     * @return
     */
    @Bean
    public RedisService redisService(StringRedisTemplate redisTemplate) {
        return new RedisService(redisTemplate);
    }

    /**
     * 配置接收消息的MessageConverter
     *
     * @param connectionFactory 连接工厂
     * @return
     */
    @Bean
    public SimpleRabbitListenerContainerFactory rabbitListenerContainerFactory(ConnectionFactory connectionFactory) {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        SimpleRabbitListenerContainerFactory factory = new SimpleRabbitListenerContainerFactory();
        factory.setConnectionFactory(connectionFactory);
        factory.setConcurrentConsumers(availableProcessors);
        factory.setMaxConcurrentConsumers(Math.max(20, availableProcessors * 2));
        factory.setDefaultRequeueRejected(false);
        factory.setErrorHandler(throwable -> {
            log.error("RabbitMQ消息异常", throwable);
        });
        if (Objects.equals("json", msgConverter)) {
            factory.setMessageConverter(new Jackson2JsonMessageConverter());
        } else if (Objects.equals("proto", msgConverter)) {
            factory.setMessageConverter(new ProtobufMessageConverter());
        }
        factory.setAcknowledgeMode(AcknowledgeMode.AUTO);
        return factory;
    }

    /**
     * 配置接收JSON消息的MessageConverter
     *
     * @param connectionFactory 连接工厂
     * @return
     */
    @Bean
    public SimpleRabbitListenerContainerFactory rabbitJsonListenerContainerFactory(ConnectionFactory connectionFactory) {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        SimpleRabbitListenerContainerFactory factory = new SimpleRabbitListenerContainerFactory();
        factory.setConnectionFactory(connectionFactory);
        factory.setConcurrentConsumers(availableProcessors);
        factory.setMaxConcurrentConsumers(Math.max(10, availableProcessors * 2));
        factory.setDefaultRequeueRejected(false);
        factory.setErrorHandler(throwable -> {
            log.error("RabbitMQ JSON消息异常", throwable);
        });
        factory.setMessageConverter(new Jackson2JsonMessageConverter());
        factory.setAcknowledgeMode(AcknowledgeMode.AUTO);
        return factory;
    }

    @Bean
    public RabbitTemplate rabbitTemplate(ConnectionFactory connectionFactory) {
        return new RabbitTemplate(connectionFactory);
    }

    @Bean
    public RabbitTemplate jsonRabbitTemplate(ConnectionFactory connectionFactory) {
        return new RabbitTemplate(connectionFactory);
    }

    /**
     * 消息发送
     *
     * @param rabbitTemplate Rabbit模板
     * @return
     */
    @Bean
    public RabbitMessageSender rabbitMessageSender(@Qualifier(value = "rabbitTemplate") RabbitTemplate rabbitTemplate, @Qualifier(value = "jsonRabbitTemplate") RabbitTemplate jsonRabbitTemplate) {
        CommonUtil.printCopyright();
        if (Objects.equals("json", msgConverter)) {
            rabbitTemplate.setMessageConverter(new Jackson2JsonMessageConverter());
        } else if (Objects.equals("proto", msgConverter)) {
            rabbitTemplate.setMessageConverter(new ProtobufMessageConverter());
        }
        rabbitTemplate.setUsePublisherConnection(true);
        rabbitTemplate.setMandatory(true);

        jsonRabbitTemplate.setMessageConverter(new Jackson2JsonMessageConverter());
        jsonRabbitTemplate.setUsePublisherConnection(true);
        jsonRabbitTemplate.setMandatory(true);
        return new RabbitMessageSender(rabbitTemplate, jsonRabbitTemplate);
    }

    /**
     * 终端实时状态交换机
     *
     * @return
     */
    @Bean
    public TopicExchange terminalStatusExchange() {
        return new TopicExchange(MqConstant.TERMINAL_STATUS_EXCHANGE);
    }

    /**
     * 多媒体文件交换机
     *
     * @return
     */
    @Bean
    public TopicExchange mediaFileExchange() {
        return new TopicExchange(MqConstant.MEDIA_FILE_EXCHANGE);
    }

    /**
     * 主动安全报警附件交换机
     *
     * @return
     */
    @Bean
    public TopicExchange attachmentExchange() {
        return new TopicExchange(MqConstant.ATTACHMENT_EXCHANGE);
    }

    /**
     * 上行指令交换机
     *
     * @return
     */
    @Bean
    public TopicExchange upCommandExchange() {
        return new TopicExchange(MqConstant.UP_COMMAND_EXCHANGE);
    }

    /**
     * 下行指令交换机
     *
     * @return
     */
    @Bean
    public TopicExchange downCommandExchange() {
        return new TopicExchange(MqConstant.DOWN_COMMAND_EXCHANGE);
    }

    /**
     * 上传数据交换机,供web订阅
     *
     * @return
     */
    @Bean
    public TopicExchange webUploadDataExchange() {
        return new TopicExchange(MqConstant.WEB_UPLOAD_DATA_EXCHANGE);
    }

    /**
     * 上传数据交换机,供JT809订阅
     *
     * @return
     */
    @Bean
    public TopicExchange jt809UploadDataExchange() {
        return new TopicExchange(MqConstant.JT809_UPLOAD_DATA_EXCHANGE);
    }

    /**
     * JT808日志交换机
     *
     * @return
     */
    @Bean
    public TopicExchange jt808LogExchange() {
        return new TopicExchange(MqConstant.JT808_LOG_EXCHANGE);
    }

    /**
     * JT809日志交换机
     *
     * @return
     */
    @Bean
    public TopicExchange jt809LogExchange() {
        return new TopicExchange(MqConstant.JT809_LOG_EXCHANGE);
    }

    /**
     * RPC交换机
     *
     * @return
     */
    @Bean
    public TopicExchange rpcExchange() {
        return new TopicExchange(MqConstant.RPC_EXCHANGE);
    }
}