package com.hw1.model.dto;

public class Poetry extends Book{
	private int numberOfPoems;
	
	public Poetry() {
		// TODO Auto-generated constructor stub
	}

	public Poetry(String title, String author, int numberOfPoems) {
		super(title, author);
		this.numberOfPoems = numberOfPoems;
		
		displyInfo();
	}

	@Override
	public void displyInfo() {
		// TODO Auto-generated method stub
		System.out.printf("[시집] 제목 : %s / 저자 : %s / 과목 : %s\n", getTitle() , getAuthor(), numberOfPoems);
	}

	public int getNumberOfPoems() {
		return numberOfPoems;
	}

	public void setNumberOfPoems(int numberOfPoems) {
		this.numberOfPoems = numberOfPoems;
	}

}
