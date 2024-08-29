package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice3 {
	public void problem1() {
		int price = 0;
		boolean memberShip;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가격을 입력 하세요 : ");
		price = sc.nextInt();
		
		System.out.print("멤버십 있으세요? (있으면 ture/없으면 false 입력) : ");
		memberShip = sc.nextBoolean();
		
		double result  = memberShip ? price * 0.9 : price * 0.95;
		
		
		System.out.printf("\n할인을 포함한 최종금액 : %.1f원\n", result);
	}
	
	public void problem2() {
		
		int credit = 0;
		int credit50 = 0;
		int credit10 = 0;
		int credit5 = 0;
		int credit1 = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("출금할 금액 입력 : ");
		credit = sc.nextInt();
		
		credit50 = credit / 50000;
		credit %= 50000;
		
		credit10 = credit / 10000;
		credit %= 10000;
		
		credit5 = credit / 5000;
		credit %= 5000;
		
		credit1 = credit / 1000;
		credit %= 1000;
		
		System.out.printf("\n50000원 : %d\n10000원 : %d\n5000원 : %d\n1000원 : %d\n"
				, credit50, credit10, credit5, credit1);
		
	}
	
	public void problem3() {
		int num1 = 0;
		int num2 = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 수 : ");
		num1 = sc.nextInt();
		
		System.out.print("두 번째 수 : ");
		num2 = sc.nextInt();
		
		String result = (num1 % num2 == 0) ? "배수입니다" : "배수가 아닙니다.";
		System.out.println(result);
	}
	
	
	
}
