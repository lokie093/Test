package com.dao;

import com.dto.PostDto;

public interface PostDao {

	PostDto postInfo(int postNo);
	// PostNo를 이용하여 본문을 확인
}