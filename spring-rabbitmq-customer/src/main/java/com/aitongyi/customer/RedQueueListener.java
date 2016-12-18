/**
 * TODO
 * 
 */
package com.aitongyi.customer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author hushuang
 *
 */
public class RedQueueListener{
	private static Logger log = LoggerFactory.getLogger(RedQueueListener.class);
	/**
	 * 处理消息
	 * @param message
	 * void
	 */
	public void onMessage(String message) {
		log.info("RedQueueListener Receved:"  + message);
	}
}
