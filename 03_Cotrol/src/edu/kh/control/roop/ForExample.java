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
	
	public void ex3() {
		
		// 1부터 입력 받은 수까지 1씩 증가하며 출력
		System.out.print("입력 번호 : ");
		int input = sc.nextInt();
		
		for ( int  i=1 ; i <= input ; i++) {
			System.out.print(i + " ");
		}
		
	}
	
	public void ex4() {
		// 정수 5개 받아서 합계 받기
		int total = 0;
		
		for (int i = 1 ; i <= 5 ; i++ ) {
			System.out.printf("입력 %d : ", i);
			int input = sc.nextInt();
			
			// total에 입력받은 input 값 누적
			total += input;
		}
		
		System.out.println("\n합계 : " + total);

	}
	
	public void ex5() {
		// 1부터 20까지 1씩 증가하면서 출력
		// 단, 입력받은 수의 배수는 양쪽에 () 표시
		
		// ex)
		// 과로흘 표시할 배수
		// 1 2 (3) 4 5 (6) ....
		System.out.print("1~20 사이의 수를 입력해주세요 : ");
		int input = sc.nextInt();
		
		for(int i = 1 ; i <=20 ; i++) {
			/*if ( i % input == 0) System.err.printf("(%d) ", i);
			else System.out.print(i + " ");*/
			String str = (i % input) == 0 ? "(" + i + ") " : i + " ";
			System.out.print(str);
			
		}
	}
	
	public void ex6() {
		// [구구단 출력]
		// 2~9 사이 수를 하나 입력 받아
		// 해당 당늘 출력
		// 단, 입력받은 수가 2~9사이 숫자가 아니라면
		// "잘못 입력하셨습니다.
		
		System.out.print("단을 입력하세요 : ");
		int dan = sc.nextInt();
		
		if ( dan >= 2 && dan <= 9 ) {
			for( int i = 1 ; i <= 9 ; i++) {
				System.out.printf("%d X %d = %d\n", dan, i , dan*i);
			}
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
	}
	
	public void ex7() {
		// 구구단 모두 출력하기
		for (int i = 2 ; i <= 9 ; i++ ) {
			for (int j = 1 ; j <= 9 ; j++) {
				System.out.printf("%d X %d = %2d  ", i, j , i*j);
			}
			System.out.println();
		}
		
		System.out.println("\n================================================================\n");
		
		
		for (int i = 9 ; i >= 2 ; i-- ) {
			for (int j = 1 ; j <= 9 ; j++) {
				System.out.printf("%d X %d = %2d  ", i, j , i*j);
			}
			System.out.println();
		}
		
		// 구구단 모두 역순 출력하기
	}
	
	public void ex8() {
		// 숫자 세기  count
		
		//1부터 20까지 1씩 증가하면서
		// 입력받은 수의배수와 총 개수 출력
		// 입력받은 수의 배수의 합계 출력
		
		// 배수 입력 : 3
		// 3 6 9 12 15 418 : 6개
		// 3의 배수 합계 :632
		
		int count = 0; // n의 배수의 계수를세기 위한 변수
		int sum = 0; // n의 배수의 합계를 구하기 위한 변수
		String result = "";
		
		System.out.print("배수 입력 : ");
		int input = sc.nextInt();
		
		for( int i =1 ; i<= 20 ; i++) {
			if ( i % input == 0) {
				result += " " + i;
				sum += i;
				count++;
			}
		}
		
		result += " : " + count;
		System.out.println(result);
		System.out.println(input + "의 배수 합계 : " + sum);
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
			for (int j = 0 ; j < max ; j++) {
				if ( j  < max - i ) {
					System.out.print(" ");		
				} else {		
					System.out.print("*");	
				}
				
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
			for (int j = 0 ; j < max ; j++) {
				if ( j < max - i ) 	System.out.print(" ");		
				else System.out.print("*");
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
