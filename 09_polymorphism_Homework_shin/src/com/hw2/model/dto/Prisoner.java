package com.hw2.model.dto;

public class Prisoner extends Person{
	private String crime;

	public Prisoner(String id, String mame, String crime) {
		super(id, mame);
		this.crime = crime;
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getCrime() {
		return crime;
	}

	public void setCrime(String crime) {
		this.crime = crime;
	}

	public String toString() {
		return "ID : " + this.id + " , 이름 : " + this.name + " , 죄목 : " + crime + "\n";
	}
	
}
