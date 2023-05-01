package com.ssafy.ssabang.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.ssabang.user.model.dto.User;
import com.ssafy.ssabang.user.model.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	private UserService service;
	
	@Autowired
	public UserController(UserService service) {
		super();
		this.service = service;
	}

	@GetMapping
	public User login() {
		int userId = 1;
		User selected = service.login(userId);
		return selected;
	}

	
}
