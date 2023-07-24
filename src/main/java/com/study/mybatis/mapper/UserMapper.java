package com.study.mybatis.mapper;

import java.util.List;

import com.study.mybatis.model.User;

public interface UserMapper {
	public List<User> findAllUser();
}
