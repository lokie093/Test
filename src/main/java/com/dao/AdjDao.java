package com.dao;

import com.dto.PostDto;

public interface AdjDao {
	
	PostDto pwAuth(int postNo, String writerPw);
	// ����ڿ��� �Է¹޴� ��ֹ�ȣ�� ���Ѵ�.
	
	PostDto postAdjInf(int postNo);
	// �����ϴ� �Խù��� ��ȣ�� �̿��Ͽ� �ҷ��´�.
}
