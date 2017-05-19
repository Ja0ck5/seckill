package org.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.SuccessKilled;

public interface SuccessKilledDao {

	/**
	 * 插入購買明細。可過濾重複
	 * 
	 * @param seckillId
	 * @param userPhone
	 * @return 插入的結果數量
	 */
	int insertSuccessKilled(@Param("seckillId") long seckillId, @Param("userPhone") long userPhone);

	/**
	 * 根據id查詢successKilled 并攜帶秒殺產品對象實體
	 * 
	 * @param seckillId
	 * @param userPhone
	 * @return
	 */
	SuccessKilled queryByIdWithSeckill(@Param("seckillId") long seckillId, @Param("userPhone") long userPhone);

}
