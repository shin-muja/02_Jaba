package com.hw2.model.service;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Person;

public class Company implements ManagementSystem{
	private Employee employees[];
	private int employeeCount;
	
	public Company(int size) {
		employees = new Employee[size];
		employeeCount = 0;
	}

	@Override
	public void addPerson(Person person) { // 업캐스팅
		
		// 매개변수로 들어온 person이 Employee인지 체크
		// employees 객체 배열 공간이 있는지 체크
		if( person instanceof Employee && employees.length > employeeCount ) {
			/*
			int x = employeeCount;
			
			employees[x] = (Employee)person;
			
			System.out.printf("직원이 추가되었습니다. - " + employees[x].getInfo());
			
			employeeCount++;
			*/
			
			employees[employeeCount++] = (Employee) person; // 다운캐스팅
			System.out.print("직원이 추가되었습니다. - " + person.getInfo()); // 동적바인딩
			
		} else {
			System.out.println("인원이 모두 충원되어 더 이상 추가 못함");
		}
	}

	@Override
	public void removePerson(String id) {
		
		// TODO Auto-generated method stub
		for(int i =0 ; i < employeeCount ; i++ ) {
			if(employees[i].getId().equals(id)) {
				System.out.printf("직원이 삭제 되었습니다. - " + employees[i].getInfo());
			
				employees[i] = null; // 삭제
				
				for( int j = i ; j< employeeCount - 1 ; j++) {
					// 삭제한 요소가 있는 i번쨰 인덱스 부터 배열에 존재하는 직원 마지막 요소까지 순차접근
					employees[j] = employees[j + i];
					//  배열 내 모든 후속 요소를 앞쪽으로 한칸씩 이동함
				}
				
				employees[--employeeCount] = null;
				// employeeCount 변수를 감소시켜 배열의 마지막 요소를 null로 설정하여 직원수 줄이기
				
				return;
			}
		}
		System.out.println("ID : " + id + "인 직원을 찾을 수 없습니다.");
		
		/*
		label:
		for( int i = 0 ; i < employees.length ; i++ ) {
			if( employees[i] == null ) {
				for( int j = i + 1 ; j < employees.length ; j++) {
					
					
					if(employees[j] != null) {
						employees[i] = employees[j];
						employees[j] = null;
						
						employeeCount = i + 1;
						break;
					}
					
					if( j == employees.length - 1 && employees[j] == null) {
						employeeCount = i;
						break label;
					}
					
				}
			}
		}*/
		
	}

	@Override
	public void displayPersons() {
		
		System.out.println("전체 직원 명단 : ");

		for( int i = 0 ; i< employeeCount ; i++) {
			
			System.out.print(employees[i].getInfo());
		}
		
	}

	public Employee[] getEmployees() {
		return employees;
	}

	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}

	public int getEmployeeCount() {
		return employeeCount;
	}

	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}

	
	
	
}
