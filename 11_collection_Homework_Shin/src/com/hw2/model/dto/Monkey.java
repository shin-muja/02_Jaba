package com.hw2.model.dto;

public class Monkey extends Animal {
	
	public Monkey() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Monkey(String name) {
		super(name);
	}



	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println(super.name + "가 우끼끼 소리를 냅니다");
	}

}
