package com.ssafy.ssabang.notice.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.ssabang.notice.model.dto.Notice;
import com.ssafy.ssabang.notice.model.mapper.NoticeMapper;

@Service
public class NoticeServiceImpl implements NoticeService {
	
	private NoticeMapper mapper;
	
	@Autowired
	public NoticeServiceImpl(NoticeMapper mapper) {
		super();
		this.mapper = mapper;
	}

	@Override
	public List<Notice> getList() {
		return mapper.select();
	}

	@Override
	public Notice detail(int articleNo) {
		return mapper.detail(articleNo);
	}

	@Override
	public int insert(Notice notice) {
		return mapper.insert(notice);
	}

	@Override
	public int update(Notice notice) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int articleNo) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
