/**
 * TODO
 * 
 */
package com.aitongyi.producer.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aitongyi.producer.service.RabbitServiceImpl;

/**
 * @author hushuang
 * 
 */
@Controller
@RequestMapping("/rabbit")
public class RabbitController {
	private static Logger log = LoggerFactory.getLogger(RabbitController.class);

	@Autowired
	private RabbitServiceImpl rabbitService;

	@RequestMapping(value = "/setMessage", method = RequestMethod.POST)
	@ResponseBody
	public String setMessage(String msg, String type) {
		log.info("rabbitmq--收到待发送消息: type[{}]-msg[{}]", type, msg);
		rabbitService.setMessage(msg, type);
		return "{\"success\":1}";
	}
}
