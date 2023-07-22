package com.study.springboot_mybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/springboot_mybatis")
public class HelloController {
	
	@GetMapping("/hello")
	public String hello() {
		return "index";
	}
}