package com.study.mybatis.mapper;

import java.util.List;

import com.study.mybatis.model.Authority;

public interface AuthorityMapper {

	public void insertAuthority(String authorityName);
	
	public List<Authority> findAllAuthority();
}
