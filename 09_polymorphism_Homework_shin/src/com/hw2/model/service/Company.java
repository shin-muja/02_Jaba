package com.hw2.model.service;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Person;

public class Company extends ManagementSystem{
	private Employee employees[];
	private int employeeCount;
	
	public Company(int size) {
		employees = new Employee[size];
		employeeCount = 0;
	}

	@Override
	public void addPerson(Person person) {
		// TODO Auto-generated method stub
		if(employees.length >= employeeCount) {
			
			int x = employeeCount;
			
			employees[x] = (Employee)person;
			
			System.out.printf("직원이 추가되었습니다. - " + employees[x].toString());
			
			employeeCount++;
			
		} else {
			System.out.println("공간이 없습니다.");
		}
	}

	@Override
	public void removePerson(String id) {
		
		// TODO Auto-generated method stub
		for(int i =0 ; i < employeeCount ; i++ ) {
			if(employees[i].getId().equals(id)) {
				System.out.printf("직원이 삭제 되었습니다. - " + employees[i].toString());
			
				employees[i] = null;
				break;
			}
		}
		
		
		for( int i = 0 ; i< employees.length ; i++ ) {
			if( employees[i] == null ) {
				for( int j = i + 1 ; j < employees.length ; j++) {
					
					
					if(employees[j] != null) {
						employees[i] = employees[j];
						employees[j] = null;
						
						employeeCount = i + 1;
						break;
					}
					
					
				}
			}
		}
		
		System.out.println(employeeCount);
		
	}

	@Override
	public void displayPersons() {
		
		System.out.println("전체 직원 명단 : ");

		for( Employee i : employees) {
			if( i == null ) break;
			
			System.out.print(i.toString());
		}
		
	}

	
	
	
}
