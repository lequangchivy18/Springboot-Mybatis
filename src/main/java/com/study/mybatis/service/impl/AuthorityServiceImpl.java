package com.study.mybatis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.study.mybatis.mapper.AuthorityMapper;
import com.study.mybatis.model.Authority;
import com.study.mybatis.service.AuthorityService;

@Service
@Transactional
public class AuthorityServiceImpl implements AuthorityService {

	@Autowired
	private AuthorityMapper authorityMapper;
	
	@Override
	public void insertAuthority(String authorityName) {
		authorityMapper.insertAuthority(authorityName);
		
	}

	@Override
	public List<Authority> findAllAuthority() {
		return authorityMapper.findAllAuthority();
	}

}
