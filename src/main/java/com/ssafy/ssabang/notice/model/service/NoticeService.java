package com.ssafy.ssabang.notice.model.service;

import java.util.List;

import com.ssafy.ssabang.notice.model.dto.Notice;

public interface NoticeService {
	List<Notice> getList();
	Notice detail(int articleNo);
	int insert(Notice notice);
	int update(Notice notice);
	int delete(int articleNo);
}
