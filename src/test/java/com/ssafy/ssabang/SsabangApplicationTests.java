package com.ssafy.ssabang;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.ssafy.ssabang.notice.model.dto.Notice;
import com.ssafy.ssabang.notice.model.mapper.NoticeMapper;
import com.ssafy.ssabang.user.model.dto.User;
import com.ssafy.ssabang.user.model.mapper.UserMapper;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
class SsabangApplicationTests {
	
	private static final Logger log = LoggerFactory.getLogger(SsabangApplicationTests.class);
	private UserMapper mapper;
	private NoticeMapper noticeMapper;
	
	@Autowired
	public SsabangApplicationTests(UserMapper mapper, NoticeMapper noticeMapper) {
		super();
		this.mapper = mapper;
		this.noticeMapper = noticeMapper;
	}

	@Test
	@Transactional
	void contextLoads() {
		User user = User.builder().name("hansaem").userId("hansaem").userPw("hansaem").build();
		assertEquals(1, mapper.insert(user));
		
		User ssafy = User.builder().name("ssafy").userId("hansaem").userPw("hansaem").build();
		assertEquals(0, mapper.insert(ssafy));
	}
	
	@Test
	@Transactional
	void insertNotice() {
		Notice notice = Notice.builder().id("hansaem").title("test title").content("test content").build();
		assertEquals(1, noticeMapper.insert(notice));
	}

}
