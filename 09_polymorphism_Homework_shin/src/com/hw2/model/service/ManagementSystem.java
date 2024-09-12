package com.hw2.model.service;

import com.hw2.model.dto.Person;

public interface ManagementSystem {

	void addPerson(Person person);
	
	abstract void removePerson(String id);
	
	public void displayPersons();
	
	// public abstract void == void == abstract void == public void 묵시적으로 다 같은 뜻 /  반환형은 있어야함
	

}
