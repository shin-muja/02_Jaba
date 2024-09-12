package com.hw2.run;


import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Prisoner;
import com.hw2.model.service.Company;
import com.hw2.model.service.ManagementSystem;
import com.hw2.model.service.Prison;

public class Run {
	public static void main(String[] args) {
		ManagementSystem comp = new Company(10);
		ManagementSystem prison = new Prison(10);
		// 부모타입 참조변수 = 자식객체 (업 캐스팅);
		
		// 다형성 업캐스팅 사용
		comp.addPerson(new Employee("EMP001", "유재석", "기획팀"));
		comp.addPerson(new Employee("EMP002", "정형돈", "개발팀"));
		comp.addPerson(new Employee("EMP003", "하하", "인턴"));
		prison.addPerson(new Prisoner("1205", "정준하", "밥도둑"));
		prison.addPerson(new Prisoner("0705", "박명수", "웃음연쇄살인"));
		prison.addPerson(new Prisoner("8597", "노홍철", "상습사기"));
		prison.addPerson(new Prisoner("9700", "길", "노상방뇨"));
		
		comp.displayPersons();
		prison.displayPersons();
		
		System.out.println("=====================================================================");
		
		comp.removePerson("EMP002");
		prison.removePerson("0705");
		prison.removePerson("8597");

		System.out.println("=====================================================================");
		
		comp.displayPersons();
		prison.displayPersons();
		

	}
}
