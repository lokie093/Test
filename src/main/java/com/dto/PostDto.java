package com.dto;

public class PostDto {
	int postNo; // 게시물 번호
	String writerId; // 작성자 아이디
	String writerPw; // 작성자 비밀번호
	String postTime;  // 작성 시간 (날짜 + 시간)
	String postTitle; // 게시물 제목
	String postText; // 게시물 본문
	
	public PostDto(int postNo, String writerId, String writerPw, String postTime, String postTitle, String postText) {
		this.postNo = postNo;
		this.writerId = writerId;
		this.writerPw = writerPw;
		this.postTime = postTime;
		this.postTitle = postTitle;
		this.postText = postText;
	}
	// 전체를 받는 객체, 게시물 작성에서 사용
	
	public PostDto(int postNo, String writerId, String postTime, String postTitle, String postText) {
		this.postNo = postNo;
		this.writerId = writerId;
		this.postTime = postTime;
		this.postTitle = postTitle;
		this.postText = postText;
	}
	// 데이터 중 게시물 번호, 작성자 아이디, 작성 시간, 제목, 본문을 받는 객체
	// 수정 및 작성에서 사용하며 비밀번호와 날짜는 변경할 수 없다.
	
	public PostDto(int postNo, String postTitle, String postTime, String writerId) {
		this.postNo = postNo;
		this.writerId = writerId;
		this.postTime = postTime;
		this.postTitle = postTitle;
	}
	// 데이터 중 작성자 ID, 게시 날짜, 제목만을 받는 객체
	// 리스트 메인에서 표기
	
	public PostDto(int postNo, String writerPw) {
		this.postNo = postNo;
		this.writerPw = writerPw;
	}
	// 비밀번호 확인을 위한, 번호에 따른 비밀번호 받아오는 객체
	
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