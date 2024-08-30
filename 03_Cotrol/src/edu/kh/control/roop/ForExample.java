package edu.kh.control.roop;

import java.util.Scanner;

public class ForExample { // 기능 제공용
	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		
		for (int i = 1 ; i <= 10 ; i++ ) {
			System.out.print(i + " ");			
		}
	}
	
	public void ex2() {
		// 영어 알바벳 A부커 Z까지 한줄로 출력
		
		for ( int i = 'A'; i <= 'Z' ; i++) {
			System.out.print((char)i + " ");
		}
		System.out.println();
		System.out.println("===============================================================");
		for ( char i = 'A'; i <= 'Z' ; i++) {
			System.out.print(i + " ");
		}
	}

	public void practice1() {
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int max = sc.nextInt();
		
		if (max < 1) {
			System.out.println("1이상의 수를 입력해주세요");
		}else {
			for( int i = 1 ; i <= max ; i++ ) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	public void practice2() {
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int min = sc.nextInt();
		
		if( min < 1 ) {
			System.out.println("1이상의 수를 입력해주세요");
		} else {
			for( int i = min ; i >= 1 ; i-- ) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	public void practice3() {
		System.out.print("정수를 입력하세요 : ");
		int input = sc.nextInt();
		
		int total = 0;
		
		for (int i = 1 ; i <= input ; i++) {
			if(i == input) System.out.print(i + " = ");
			else System.out.print(i + " + ");
			
			total += i;
		}
		
		System.out.println(total);		
		
	}

	public void practice4() {
//		사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
//		만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		
		int max = 0, min = 0;
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if( num1 < 1 || num2 < 1) {
			System.out.println("1이상의 수를 입력해주세요");
			return;
		}
		
		if ( num1 < num2) {
			max = num2;
			min = num1;
		} else if( num1 == num2) {
			System.out.print(num1);			
		} else {
			max = num1;
			min = num2;
		}
		
		for (int i = min ; i <= max; i++) {
			System.out.print(i + " ");			
		}
		
	}

	public void practice5() {
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		
		if ( dan <2 || dan > 9 ) {
			System.out.println("2~9 사이의 수를 입력해주세요");
			return;
		}
		
		System.out.println("===== " + dan + "단 =====");
		
		for (int i =1 ; i <= 9 ; i++) {
			System.out.printf("%d X %d = %d\n", dan, i ,dan * i);
		}		
	}

	public void practice6() {
		
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		
		if ( dan <2 || dan > 9 ) {
			System.out.println("2~9 사이의 수를 입력해주세요");
			return;
		}
		
		for( int i = dan ; i <= 9; i++) {
			
			System.out.println("===== " + dan + "단 =====");
			
			for (int j =1 ; j <= 9 ; j++) {
				System.out.printf("%d X %d = %d\n", dan, j ,dan * j);
			}
			dan++;
		}
	}

	public void practice7() {
		System.out.print("정수를 입력하세요 : ");
		int max = sc.nextInt();
		
		if (max < 1) {
			System.out.println("1 이상의 수를 입력해주세요");
			return;
		}
		
		for(int i = 1; i <= max ; i++) {
			for (int j =1 ; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice8() {
		
		System.out.print("정수를 입력하세요 : ");
		int min = sc.nextInt();
		
		if (min < 1) {
			System.out.println("1 이상의 수를 입력해주세요");
			return;
		}
		
		for(int i = min; i >= 1 ; i--) {
			for (int j =1 ; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public void practice9() {
		System.out.print("정수를 입력하세요 : ");
		int max = sc.nextInt();
		
		if (max < 1) {
			System.out.println("1 이상의 수를 입력해주세요");
			return;
		}
		
		for(int i = 1; i <= max ; i++) {
			for (int j = max ; j >= i+1 ; j--) {
				System.out.print(" ");
			}
			for (int j =1 ; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice10() {
		System.out.print("정수를 입력하세요 : ");
		int max = sc.nextInt();
		
		if (max < 1) {
			System.out.println("1 이상의 수를 입력해주세요");
			return;
		}
		
		for(int i = 1; i <= max ; i++) {
			for (int j =1 ; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = max - 1; i >= 1 ; i--) {
			for (int j =1 ; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	public void practice11() {
		System.out.print("정수를 입력하세요 : ");
		int max = sc.nextInt();
		
		if (max < 1) {
			System.out.println("1 이상의 수를 입력해주세요");
			return;
		}
		
		for ( int i = 1 ; i <= max ; i++) {
			for(int j = max; j >= i+1; j--) {
				System.out.print(" ");
			}
			for(int j = 1 ; j <= i ; j++) {
				System.out.print("*");
			}
			for(int j = 1 ; j <= i - 1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice12() {
		
		System.out.print("정수를 입력하세요 : ");
		int max = sc.nextInt();
		
		if (max < 1) {
			System.out.println("1 이상의 수를 입력해주세요");
			return;
		}
		
		for(int i =1 ; i <= max ; i++) {
			if( i == 1 || i == max) {
				for (int j = 1 ; j <= max ; j++) {
					System.out.print("*");
				}
				System.out.println();
				
			} else {
				System.out.print("*");
				for (int j = 1 ; j <= max -2 ; j++){
					System.out.print(" ");
				}
				System.out.println("*");
			}
			
		}
		
	}

	public void practice13() {
		int num2 = 2;
		int num3 = 3;
		int count = 0;
		
		System.out.print("정수를 입력하세요 : ");
		int max = sc.nextInt();
		
		if (max < 1) {
			System.out.println("1 이상의 수를 입력해주세요");
			return;
		}
		
		for ( int i = 1 ; i <= max ; i++) {
			if( i % 2 == 0 || i % 3 == 0) {
				System.out.print(i + " ");
			}
			
			if ( i % 2 == 0 && i % 3 == 0 ) count++;
			
		}
		System.out.println("\ncount : " + count);
		
	}
}
