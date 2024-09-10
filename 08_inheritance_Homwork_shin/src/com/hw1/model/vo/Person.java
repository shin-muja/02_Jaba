package com.hw1.model.vo;

public class Person {
	protected String name;
	// 상속받은 후손 클래스 O, 같은패키지 O, 직접 접근 O
	
	/*
	 * private 필드는 상속을 통해 자식 클래스가
	 * 부모 클래스의 필드를 물려받더라도
	 * getter/setter를 이용하여 간접접근 해야함.
	 * 
	 * protected 필드는 상속받은 자식이 마치 원래 본인것 이었던 것처럼
	 * 사용 가능하기 때문에 부모 필드에 직접 접근 가능 == 타 class에서 this 사용 가능
	 * */
	private int age;
	private double height;
	private double weight;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(int age, double height, double weight) {
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	public String information() {
		
		return String.format("이름 : %s / 나이 : %d / 신장 : %.1f / 몸무게 : %.1f", name, age, height, weight);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
}
