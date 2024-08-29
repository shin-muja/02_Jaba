package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice2 {
	public void age() {
		int age = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 나이는 ? : ");
		age = sc.nextInt();
		
		String result1 = age >= 20 ? "저는 성인 입니다." : "저는 미성년 입니다";
		boolean result2 = (age >= 13) && (age <= 19) ? true : false;
		boolean result3 = (age >= 65) || (age <= 12) ? true : false;
		
		System.out.printf("\n%s\n청소년 입니까? %b\n노인이거나 어린이입니까? %b\n", result1, result2, result3);
		
	}
}
