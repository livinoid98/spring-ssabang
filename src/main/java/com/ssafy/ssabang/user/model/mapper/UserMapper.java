package com.ssafy.ssabang.user.model.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.ssabang.user.model.dto.User;

@Mapper
public interface UserMapper {
	User select(int userNo);
	int insert(User user);
}