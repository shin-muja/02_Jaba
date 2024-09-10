package com.hw3.controller;

import java.util.Scanner;
import com.hw3.model.vo.Product;

public class ProductController {
	private Product [] pro = null;
	public static int count = 0;
	Scanner sc = new Scanner(System.in);

	// 초기화 블럭
	// 객체 생성시 초기화블럭 수행 -> 생성자 수행
	// 생성자가 만들어진 이후 사용되는 경우가 적음
	{
		pro = new Product[10];
	}
	public ProductController() {
		
		pro[0] = new Product(1, "자바의 정석", 15000, 0.2);
		pro[1] = new Product(2, "C의 기초", 2000, 0.1);
	}
	
	public void mainMenu() {
		
		boolean exit = true;
		
		do {
			System.out.println("===== 제품 관리 메뉴 =====");
			System.out.println("1. 제품 정보 추가");
			System.out.println("2. 제품 전체 조회");
			System.out.println("3. 제품 정보 삭제");
			System.out.println("0. 프로그램 종료");
			
			System.out.print("메뉴 입력 : ");
			int input = sc.nextInt();
			sc.nextLine();
			
			switch(input) {
			case 1 : productInput(); break;
			case 2 : productPrint(); break;
			case 3 : productDelete();break;
			case 0 : System.out.println("프로그램을 종료합니다");
					exit = false; break;
			
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요"); break;
			}
			
		} while(exit);
	}
	
	public void productInput() {
		
		System.out.println("\n========제품 정보 추가========");

		if( count == 10 ) {
			System.out.println("용량이 꽉 찼습니다. 문의 후 이용해주세요");
			return;
		}
		
		System.out.print("제품 번호 : ");
		int pld = sc.nextInt();
		sc.nextLine();
		
		System.out.print("제품명 : ");
		String pName = sc.nextLine();
		
		System.out.print("제품가격 : ");
		int price = sc.nextInt();
		
		System.out.print("제품세금 : ");
		double tax = sc.nextDouble();
		
		
		pro[count] = new Product(pld, pName, price, tax);
		
		System.out.println("제품 추가 완료");			
		
	}

	public void productPrint() {
		if(count == 0) {
			System.out.println("도서정보를 추가해주세요");
			return;
		}
		
		System.out.println("===========저장된 제품 정보===========");
		
		for(int i = 0 ; i < count ; i++) {
			System.out.println(pro[i].information());
			System.out.println();
		}
	}
	
	public void productDelete() {
		System.out.println("=======================================");
		System.out.print("삭제할 제품 번호를 입력해주세요 : ");
		int input = sc.nextInt();
		
		for ( int i = 0 ; i < count ; i++) {
			if(input == pro[i].getPld()) {
				pro[i] = null;
				System.out.println("정상적으로 삭제 되었습니다.");
				break;
			}
		}
		
		
		loop: 
		for( int i = 0 ; i < count ; i++ ) {
			if( pro[i] == null ) {
				for( int j = i ; j < count ; j++ ) {
					if( pro[j] != null ) {
						pro[i] = pro[j];
						pro[i].setPld(i + 1);
						pro[j] = null;
						break;
					}	else if( pro[count - 1] == null) {
						count = i;
						break loop;
					}
				}
			}
		}
	}
}
