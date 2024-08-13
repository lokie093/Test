package com.dao;

import com.dto.PostDto;

public interface WriteDao {
	
	int curPostNo(int postNo);
	// 현재 작성되는 게시물의 번호
	// 기존 가장 마지막에 할당된 번호를 받아옴. 해당 번호에 +1을 하여 다음 PostNo으로 설정함
	// 저장시 할당, 먼저 저장된 데이터에 작은 수를 받아야 

	PostDto curPostInfo(int postNo, String writerId, String writerPw, String postTitle, String postText);
	// 사용자에게서 입력받은 정보들을 저장
	
	
}
