package com.ssafy.ssabang.notice.model.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Notice {
	private int articleNo;
	private String id;
	private String title;
	private String content;
	private int showCnt;
	private Date registerTime;
}
