package com.study.mybatis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.mybatis.mapper.UserMapper;
import com.study.mybatis.model.User;
import com.study.mybatis.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public List<User> findAllUser() {
		// TODO Auto-generated method stub
		return userMapper.findAllUser();
	}

}
