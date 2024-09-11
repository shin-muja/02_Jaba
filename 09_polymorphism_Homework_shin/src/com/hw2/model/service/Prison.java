package com.hw2.model.service;

import com.hw2.model.dto.Person;
import com.hw2.model.dto.Prisoner;

public class Prison extends ManagementSystem{
	private Prisoner[] prisoners;
	private int prisonerCount;
	
	public Prison(int size) {
		// TODO Auto-generated constructor stub
		prisoners = new Prisoner[size];
		prisonerCount = 0;
	}

	@Override
	public void addPerson(Person person) {
		
		if(prisoners.length >= prisonerCount) {
			int x = prisonerCount;
			
			prisoners[x] = (Prisoner) person;
			
			System.out.print("수감자가 추가되었습니다 - " + prisoners[x].toString());
			
			prisonerCount++;
		} else {
			System.out.println("공간이 없습니다.");
		}
		
	}

	@Override
	public void removePerson(String id) {
		// TODO Auto-generated method stub
		for( int i = 0 ; i < prisonerCount; i++) {
			if( prisoners[i].getId().equals(id)) {
				System.out.print("수감자가 삭제되었습니다 - " + prisoners[i].toString());
				
				prisoners[i] = null;
				break;
			}
		}
		
		for( int i = 0 ; i < prisonerCount; i++) {
			if( prisoners[i] == null) {
				for(int j = i + 1 ; j < prisonerCount ; j++) {
					if( prisoners[i] != null ) {
						prisoners[i] = prisoners[j];
						prisoners[j] = null;
						
						prisonerCount = i + 1;
						break;	
					}
				}
			}
		}
	}

	@Override
	public void displayPersons() {
		System.out.println("전체 수감자 명단 : ");

		for( Prisoner i : prisoners) {
			if( i == null ) break;
		
			System.out.print(i.toString());
		}
		
	}
	
	
	
}
