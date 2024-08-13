package com.dao;

import com.dto.PostDto;

public interface AdjDao {
	
	PostDto pwAuth(int postNo, String writerPw);
	// 사용자에게 입력받는 비밍번호를 비교한다.
	
	PostDto postAdjInf(int postNo);
	// 수정하는 게시물을 번호를 이용하여 불러온다.
}
