package com.ssafy.ssabang.notice.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.ssabang.notice.model.dto.Notice;

@Mapper
public interface NoticeMapper {
	List<Notice> select();
	Notice detail(int articleNo);
	int insert(Notice notice);
	int update(Notice notice);
	int delete(int articleNo);
}
