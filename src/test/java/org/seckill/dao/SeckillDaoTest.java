package org.seckill.dao;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.seckill.entity.Seckill;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 配置 junit 和 spring 的整合,junit 启动时 加载 spirngIOC 容器
 * 
 * @author Ja0ck5
 *
 */
public class SeckillDaoTest extends SpringBaseTest {

	@Autowired
	private SeckillDao seckillDao;

	@Test
	public void testQueryById() {
		long id = 1000;
		Seckill seckill = seckillDao.queryById(id);
		System.out.println(seckill.getName());
		System.out.println(seckill);
	}

	@Test
	public void testQueryAll() {
		List<Seckill> all = seckillDao.queryAll(0, 100);
		System.out.println(all);
	}

	@Test
	public void testReduceNumber() {
		int reduceNumber = seckillDao.reduceNumber(1000, new Date());
		System.out.println(reduceNumber);
	}

}
