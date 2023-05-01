package com.ssafy.ssabang.user.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class User {
	private int userNo;
	private String name;
	private String userId;
	private String userPw;
	private String address;
	private int age;
	private String gender;
}
