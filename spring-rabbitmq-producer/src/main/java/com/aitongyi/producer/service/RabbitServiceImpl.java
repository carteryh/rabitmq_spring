/**
 * TODO
 * 
 */
package com.aitongyi.producer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author hushuang
 *
 */
@Service("rabbitService")
public class RabbitServiceImpl {
	private static Logger log = LoggerFactory.getLogger(RabbitServiceImpl.class);
	@Autowired
	private RabbitTemplate rabbitTemplate;

	/**
	 * 发送消息
	 * @param msg 消息内容
	 * @param routingKey 路由关键字
	 * void
	 */
	public void setMessage(String msg, String routingKey) {
		rabbitTemplate.convertAndSend(routingKey, msg);
		log.info("rabbitmq--发送消息完成: routingKey[{}]-msg[{}]", routingKey, msg);
	}
}
