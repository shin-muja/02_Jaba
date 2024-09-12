package com.hw1.model.dto;

public class Novel extends Book{
	
	private String genre;
	public Novel() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Novel(String title, String author, String genre) {
		super(title, author);
		this.genre = genre;
		
		displayInfo();
	}


	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub

		// 부모에게 물려받은 getter/setter는 super 예약어를 사용하지 않고 가능하다
		// 가독성의 이유로 
		System.out.printf("[소설] 제목 : %s / 저자 : %s / 과목 : %s\n", getTitle() , getAuthor(), genre);
		
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}
}
