package com.hw2.model.service;

import com.hw2.model.dto.Person;

public abstract class ManagementSystem {

	public abstract void addPerson(Person person);
	
	public abstract void removePerson(String id);
	
	public abstract void displayPersons();
	

}
