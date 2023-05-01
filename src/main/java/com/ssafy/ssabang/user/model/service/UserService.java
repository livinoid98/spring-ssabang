package com.ssafy.ssabang.user.model.service;

import com.ssafy.ssabang.user.model.dto.User;

public interface UserService {
	User login(int userNo);
	int signup(User user);
}
