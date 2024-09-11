package com.hw2.model.dto;

public class Employee extends Person {
	
	private String position;

	public Employee(String id, String mame, String position) {
		super(id, mame);
		this.position = position;
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return "";
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	@Override
	public String toString() {
		return "ID : " + this.id + " , 이름 : " + this.name + " , 직책 : " + position + "\n";
	}
	

}
