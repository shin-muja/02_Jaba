package com.hw2.model.dto;

public class Employee extends Person {
	
	private String position;

	public Employee(String id, String mame, String position) {
		super(id, mame);
		this.position = position;
	}

	@Override
	public String getInfo() {
		return "ID : " + id + " , 이름 : " + name + " , 직책 : " + position + "\n";
		// id와 name을 Person에서 protected로 만들었기 때문에
		// 후손클래스에서 직접 접근 가능
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	

}
