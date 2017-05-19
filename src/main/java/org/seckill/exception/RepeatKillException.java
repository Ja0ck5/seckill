/**
 * 
 */
package org.seckill.exception;

/**
 * 重复秒杀异常
 * @author Ja0ck5
 *
 */
public class RepeatKillException extends SeckillException{


	public RepeatKillException(String message, Throwable cause) {
		super(message, cause);
	}

	public RepeatKillException(String message) {
		super(message);
	}

	

}
