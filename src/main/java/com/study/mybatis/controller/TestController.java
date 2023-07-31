package com.study.mybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.study.mybatis.model.Authority;
import com.study.mybatis.service.AuthorityService;

@RestController("/api/v1")
public class TestController {

	@Autowired
	private AuthorityService authorityService;

	@PostMapping("/authority")
	public ResponseEntity<Authority> createAuthority(@RequestBody Authority authority) {

		authorityService.insertAuthority(authority.getAuthorityName());

		return ResponseEntity.ok(authority);
	}

}
