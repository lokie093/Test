package com.dao;

import com.dto.PostDto;

public interface WriteDao {
	
	int curPostNo(int postNo);
	// ���� �ۼ��Ǵ� �Խù��� ��ȣ
	// ���� ���� �������� �Ҵ�� ��ȣ�� �޾ƿ�. �ش� ��ȣ�� +1�� �Ͽ� ���� PostNo���� ������
	// ����� �Ҵ�, ���� ����� �����Ϳ� ���� ���� �޾ƾ� 

	PostDto curPostInfo(int postNo, String writerId, String writerPw, String postTitle, String postText);
	// ����ڿ��Լ� �Է¹��� �������� ����
	
	
}
