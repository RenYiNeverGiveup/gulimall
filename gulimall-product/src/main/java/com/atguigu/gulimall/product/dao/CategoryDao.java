package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author renyi
 * @email renyi537@163.com
 * @date 2023-08-31 21:22:52
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
