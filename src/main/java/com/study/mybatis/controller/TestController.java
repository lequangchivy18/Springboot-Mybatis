package com.study.mybatis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.study.mybatis.model.Authority;
import com.study.mybatis.service.AuthorityService;

@RestController("/api/v1")
@CrossOrigin
public class TestController {

	@Autowired
	private AuthorityService authorityService;

	@PostMapping("/authority")
	public ResponseEntity<Authority> createAuthority(@RequestBody Authority authority) {

		authorityService.insertAuthority(authority.getAuthorityName());

		return ResponseEntity.ok(authority);
	}

	@GetMapping("/authority")
	public List<Authority> getListAuthority() {

		List<Authority> authorities = authorityService.findAllAuthority();
		
		return authorities;
	}
}
