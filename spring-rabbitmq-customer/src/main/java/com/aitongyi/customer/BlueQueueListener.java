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
public class BlueQueueListener{
	private static Logger log = LoggerFactory.getLogger(BlueQueueListener.class);
	/**
	 * 处理消息
	 * @param message
	 * void
	 */
	public void onMessage(String message) {
		log.info("BlueQueueListener Receved:"  + message);
	}
}
