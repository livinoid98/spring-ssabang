package com.ssafy.ssabang.user.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.ssabang.user.model.dto.User;
import com.ssafy.ssabang.user.model.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService{
	
	private UserMapper mapper;
	
	@Autowired
	public UserServiceImpl(UserMapper mapper) {
		super();
		this.mapper = mapper;
	}

	@Override
	public User login(int userNo) {
		return mapper.select(userNo);
	}

	@Override
	public int signup(User user) {
		int result = mapper.insert(user);
		System.out.println(result);
		return result;
	}
	
}
