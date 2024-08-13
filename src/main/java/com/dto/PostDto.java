package com.dto;

public class PostDto {
	int postNo; // �Խù� ��ȣ
	String writerId; // �ۼ��� ���̵�
	String writerPw; // �ۼ��� ��й�ȣ
	String postTime;  // �ۼ� �ð� (��¥ + �ð�)
	String postTitle; // �Խù� ����
	String postText; // �Խù� ����
	
	public PostDto(int postNo, String writerId, String writerPw, String postTime, String postTitle, String postText) {
		this.postNo = postNo;
		this.writerId = writerId;
		this.writerPw = writerPw;
		this.postTime = postTime;
		this.postTitle = postTitle;
		this.postText = postText;
	}
	// ��ü�� �޴� ��ü, �Խù� �ۼ����� ���
	
	public PostDto(int postNo, String writerId, String postTime, String postTitle, String postText) {
		this.postNo = postNo;
		this.writerId = writerId;
		this.postTime = postTime;
		this.postTitle = postTitle;
		this.postText = postText;
	}
	// ������ �� �Խù� ��ȣ, �ۼ��� ���̵�, �ۼ� �ð�, ����, ������ �޴� ��ü
	// ���� �� �ۼ����� ����ϸ� ��й�ȣ�� ��¥�� ������ �� ����.
	
	public PostDto(int postNo, String postTitle, String postTime, String writerId) {
		this.postNo = postNo;
		this.writerId = writerId;
		this.postTime = postTime;
		this.postTitle = postTitle;
	}
	// ������ �� �ۼ��� ID, �Խ� ��¥, ������ �޴� ��ü
	// ����Ʈ ���ο��� ǥ��
	
	public PostDto(int postNo, String writerPw) {
		this.postNo = postNo;
		this.writerPw = writerPw;
	}
	// ��й�ȣ Ȯ���� ����, ��ȣ�� ���� ��й�ȣ �޾ƿ��� ��ü
	
	public int getPostNo() {
		return postNo;
	}
	
	public void setPostNo(int postNo) {
		this.postNo = postNo;
	}
	public String getWriterId() {
		return writerId;
	}
	public void setWriterId(String writerId) {
		this.writerId = writerId;
	}
	public String getWriterPw() {
		return writerPw;
	}
	public void setWriterPw(String writerPw) {
		this.writerPw = writerPw;
	}
	public String getPostTime() {
		return postTime;
	}
	public void setPostTime(String postTime) {
		this.postTime = postTime;
	}
	public String getPostTitle() {
		return postTitle;
	}
	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}
	public String getPostText() {
		return postText;
	}
	public void setPostText(String postText) {
		this.postText = postText;
	}
	//getter setter

	@Override
	public String toString() {
		return "postNo : " + postNo + ", writerId : " + writerId + ", writerPw : " + writerPw + ", postTime : "
				+ postTime;
	}
	// toString
}