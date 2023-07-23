package com.study.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.study.mybatis.model.User;

@Mapper
public interface UserMapper {

	public List<User> findAllUser();
}
