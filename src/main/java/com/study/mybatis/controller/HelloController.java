package com.study.mybatis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.study.mybatis.model.User;
import com.study.mybatis.service.UserService;

@Controller("/springboot_mybatis")
public class HelloController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/hello")
	public String hello(Model model) {
		
		List<User> users = userService.findAllUser();
		System.out.println(users.toString());
		model.addAttribute("users", users);
		
		return "index";
	}
}