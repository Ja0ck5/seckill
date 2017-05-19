package org.seckill.service;

import java.util.List;

import org.seckill.dto.Exposer;
import org.seckill.dto.SeckillExecution;
import org.seckill.entity.Seckill;
import org.seckill.exception.RepeatKillException;
import org.seckill.exception.SeckillClosedException;
import org.seckill.exception.SeckillException;

/**
 * 站在使用者的角度设计接口
 * <li>方法定义的粒度</li>
 * 
 * @author Ja0ck5
 *
 */
public interface SeckillService {

	List<Seckill> getSeckillList();

	Seckill getById(long seckillId);

	/**
	 * 秒杀开启时，否则输出系统时间和秒杀时间 输出秒杀接口地址
	 * 
	 * @param seckillId
	 */
	Exposer exportSeckillUrl(long seckillId);

	/**
	 * 执行秒杀
	 * 
	 * @param seckillId
	 * @param userPhone
	 * @param md5
	 */
	SeckillExecution executeSeckill(long seckillId, long userPhone, String md5)
			throws SeckillException, RepeatKillException, SeckillClosedException;
}
