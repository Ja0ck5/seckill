-- 数据库初始化脚本

-- 创建数据库

create database seckill;

-- use

use seckill;

-- 创建秒杀库存表

create table seckill(
	`seckill_id` bigint NOT NULL  AUTO_INCREMENT COMMENT '商品库存ID',
	`name` varchar(120) NOT NULL COMMENT '商品名称',
	`number` int NOT NULL 	COMMENT '库存数量',
	`start_time` timestamp NOT NULL COMMENT '秒杀开始时间',
	`end_time` timestamp NOT NULL COMMENT '秒杀结束时间',
	`create_time` timestamp NOT NULL default CURRENT_TIMESTAMP COMMENT '创建时间',
	PRIMARY KEY (seckill_id),
	key idx_start_time(start_time),
	key idx_end_time(end_time),
	key idx_create_time(create_time)

)ENGINE = InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='秒杀库存表';

-- 初始化数据

insert into seckill(name,number,start_time,end_time)
values
('4000元秒杀iphone6',100,'2017-03-01 00:00:00','2017-03-02 00:00:00'),
('3000元秒杀iphone5',200,'2017-03-01 00:00:00','2017-03-02 00:00:00'),
('2000元秒杀iphone4',300,'2017-03-01 00:00:00','2017-03-02 00:00:00'),
('1000元秒杀iphone3',400,'2017-03-01 00:00:00','2017-03-02 00:00:00'),
('4000元秒杀小米1',100,'2017-03-01 00:00:00','2017-03-02 00:00:00'),
('3000元秒杀小米2',200,'2017-03-01 00:00:00','2017-03-02 00:00:00'),
('2000元秒杀小米3',300,'2017-03-01 00:00:00','2017-03-02 00:00:00'),
('100元秒杀小米4',400,'2017-03-01 00:00:00','2017-03-02 00:00:00');



-- 秒杀成功明细表
-- 用户登录认证相关信息

create table success_killed(
	`seckill_id` bigint NOT NULL  COMMENT '秒杀商品ID',
	`user_phone` bigint NOT NULL  COMMENT '用户手机号',
	`state` tinyint NOT NULL  default -1 COMMENT '状态标识:-1:无效,0:成功,1:已付款,2:已发货',
	`create_time` timestamp NOT NULL default CURRENT_TIMESTAMP COMMENT '创建时间',
	
	PRIMARY KEY(seckill_id,user_phone), /*使用联合主键*/
	key idx_create_time(create_time)
)ENGINE = InnoDB DEFAULT CHARSET=utf8 COMMENT='秒杀成功明细表';


