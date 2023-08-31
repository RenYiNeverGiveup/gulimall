package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author renyi
 * @email renyi537@163.com
 * @date 2023-08-31 22:02:35
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
