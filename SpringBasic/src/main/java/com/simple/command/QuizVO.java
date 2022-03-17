package com.simple.command;

public class QuizVO {
	
	private String id;
	private String pw;
	
	public QuizVO() {
		// TODO Auto-generated constructor stub
	}

	public QuizVO(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}
	
	
}
