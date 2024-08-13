package com.dao;

import java.util.List;

import com.dto.PostDto;

public interface ListDao {
	
	List<PostDto> postList();
	// 화면에 리스트를 출력
	
	//화면에 검색 기능은 추후 추가, 일단 기본 기능의 완성을 목표로
	
}