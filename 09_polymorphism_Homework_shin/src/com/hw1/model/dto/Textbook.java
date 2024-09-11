package com.hw1.model.dto;

public class Textbook extends Book {

	private String subject;
	
	@Override
	public void displyInfo() {
		// TODO Auto-generated method stub
		System.out.printf("[전문서적] 제목 : %s / 저자 : %s / 과목 : %s\n", getTitle() , getAuthor(), subject);
		
	}
	
	public Textbook() {
		// TODO Auto-generated constructor stub
	}

	public Textbook(String title, String author, String subject) {
		super(title, author);
		this.subject = subject;
		
		displyInfo();
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

}
