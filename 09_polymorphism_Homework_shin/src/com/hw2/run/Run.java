package com.hw2.run;


import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Prisoner;
import com.hw2.model.service.Company;
import com.hw2.model.service.Prison;

public class Run {
	public static void main(String[] args) {
		Company comp = null;
		Prison prison = null;
		
		comp = new Company(10);
		prison = new Prison(10);
		
		comp.addPerson(new Employee("EMP001", "유재석", "기획팀"));
		comp.addPerson(new Employee("EMP002", "정형돈", "개발팀"));
		prison.addPerson(new Prisoner("1205", "정준하", "밥도둑"));
		prison.addPerson(new Prisoner("0705", "박명수", "웃음연쇄살인"));
		
		comp.displayPersons();
		prison.displayPersons();
		
		System.out.println("=====================================================================");
		
		comp.removePerson("EMP001");
		prison.removePerson("1205");

		System.out.println("=====================================================================");
		
		comp.displayPersons();
		prison.displayPersons();
		

	}
}
