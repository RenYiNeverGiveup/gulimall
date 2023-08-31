package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author renyi
 * @email renyi537@163.com
 * @date 2023-08-31 21:55:23
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
