package com.study.mybatis.service;

import java.util.List;

import com.study.mybatis.model.Authority;

public interface AuthorityService {
	public void insertAuthority(String authorityName);

	public List<Authority> findAllAuthority();
}
