package com.hw2.model.service;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.hw2.model.dto.Animal;

public class Zoo {
	private List<Animal> animals = new ArrayList<Animal>();
	
	public Zoo() {
		// TODO Auto-generated constructor stub
	}
	
	public void addAnimal(Animal animal) {
		animals.add(animal);
	}
	
	public void showAnimals() {
		System.out.println("동물들의 울음소리를 들어보세요");
		for(Animal animal : animals) {
			animal.sound();
		}
	}
	
	public void dispalyMenu() {
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("***** KH 동물원 *****");
			System.out.println("1. 동물들의 울음소리 듣기");
			System.out.println("2. 종료");
			System.out.print("선택 : ");
			
			
			
			try {
				
				int input = sc.nextInt();
				if(input == 1) {
					showAnimals();
				} else if( input == 2) {
					break;
				} 
				
			} catch (InputMismatchException e){
				System.out.println("숫자 외 다른 문자를 입력하지마세요.");
				break;
			}
		}
				
				
		
	}
}
