package org.seckill.dao;

import static org.junit.Assert.*;

import org.junit.Test;
import org.seckill.entity.SuccessKilled;
import org.springframework.beans.factory.annotation.Autowired;

public class SuccessKilledDaoTest extends SpringBaseTest{

	@Autowired
	private SuccessKilledDao successKilledDao;
	
	@Test
	public void testInsertSuccessKilled() {
		//first 1
		//second 0
		/**
		 * 1，联合主键
		 * 2，insert ignore into ...
		 */
		int insertSuccessKilled = successKilledDao.insertSuccessKilled(1001, 13566668888L);
		System.out.println(insertSuccessKilled);
	}

	@Test
	public void testQueryByIdWithSeckill() {
		SuccessKilled queryByIdWithSeckill = successKilledDao.queryByIdWithSeckill(1000,13566668888L);
		System.out.println(queryByIdWithSeckill);
		System.out.println(queryByIdWithSeckill.getSeckill());
	}

}
