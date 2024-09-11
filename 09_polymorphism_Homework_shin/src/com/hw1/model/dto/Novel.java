package com.hw1.model.dto;

public class Novel extends Book{
	
	private String genre;
	public Novel() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Novel(String title, String author, String genre) {
		super(title, author);
		this.genre = genre;
		
		displyInfo();
	}


	@Override
	public void displyInfo() {
		// TODO Auto-generated method stub

		System.out.printf("[소설] 제목 : %s / 저자 : %s / 과목 : %s\n", getTitle() , getAuthor(), genre);
		
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}
}
