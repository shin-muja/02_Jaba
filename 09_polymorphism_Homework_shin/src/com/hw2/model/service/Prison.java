package com.hw2.model.service;

import com.hw2.model.dto.Person;
import com.hw2.model.dto.Prisoner;

public class Prison implements ManagementSystem{
	private Prisoner[] prisoners;
	private int prisonerCount;
	
	public Prison(int size) {
		// TODO Auto-generated constructor stub
		prisoners = new Prisoner[size];
		prisonerCount = 0;
	}

	@Override
	public void addPerson(Person person) {
		
		if(person instanceof Prisoner && prisonerCount < prisoners.length ) {
			/*
			int x = prisonerCount;
			
			prisoners[x] = (Prisoner) person;
			
			System.out.print("수감자가 추가되었습니다 - " + prisoners[x].getInfo());
			
			prisonerCount++;
			*/
			
			prisoners[prisonerCount++] = (Prisoner) person;
			System.out.print("수감자가 추가되었습니다 - " + person.getInfo());
		} else {
			System.out.println("더 이상 수용될 공간이 없습니다.");
		}
		
	}

	@Override
	public void removePerson(String id) {
		// TODO Auto-generated method stub
		for( int i = 0 ; i < prisonerCount; i++) {
			if( prisoners[i].getId().equals(id)) {
				System.out.print("수감자가 삭제되었습니다 - " + prisoners[i].getInfo());
				
				prisoners[i] = null;
				
				for( int j = i ; j < prisonerCount - 1 ; j++ ) {
					prisoners[j] = prisoners[j + 1];
				}
				prisoners[--prisonerCount] = null;
				return;
			}
		}
		
		System.out.println("ID : " + id + "인 수감자는 없습니다.");
		
		/*
		label:
		for( int i = 0 ; i < prisoners.length; i++) {
			if( prisoners[i] == null) {
				
				for(int j = i + 1 ; j < prisoners.length ; j++) {
					
					if( prisoners[j] != null ) {
						prisoners[i] = prisoners[j];
						prisoners[j] = null;
						
						prisonerCount = i + 1;
						break;	
					}
					
					if( j == prisoners.length -1 && prisoners[j] == null) { 
						prisonerCount = i;
						break label;
					}
				}
			} 
		}*/
		
	}

	@Override
	public void displayPersons() {
		System.out.println("전체 수감자 명단 : ");

		for(int i = 0; i < prisonerCount ; i++) {
			System.out.print(prisoners[i].getInfo());
		}
		
	}

	public Prisoner[] getPrisoners() {
		return prisoners;
	}

	public void setPrisoners(Prisoner[] prisoners) {
		this.prisoners = prisoners;
	}

	public int getPrisonerCount() {
		return prisonerCount;
	}

	public void setPrisonerCount(int prisonerCount) {
		this.prisonerCount = prisonerCount;
	}
	
	
	
}
