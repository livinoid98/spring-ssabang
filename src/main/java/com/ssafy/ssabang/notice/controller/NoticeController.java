package com.ssafy.ssabang.notice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.ssabang.notice.model.dto.Notice;
import com.ssafy.ssabang.notice.model.service.NoticeService;
import com.ssafy.ssabang.user.model.dto.User;

@RestController
@RequestMapping("/notice")
public class NoticeController {
	
	private NoticeService service;
	
	@Autowired
	public NoticeController(NoticeService service) {
		super();
		this.service = service;
	}
	
	@GetMapping("/list")
	public List<Notice> list() {
		List<Notice> list = service.getList();
		return list;
	}
	
	@GetMapping("/detail")
	public Notice detail() {
		int articleNo = 1;
		Notice notice = service.detail(articleNo);
		return notice;
	}
}
