package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPratice {
	public void practice1() {
		int people = 0;
		int each = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		people = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		each = sc.nextInt();
		
		System.out.printf("1인당 사탕 개수 : %d\n", each / people);
		System.out.printf("남은 사탕 갯수 : %d\n", each % people);
	}

	public void practice2() {
		String name ="";
		int hag = 0;
		int ban = 0;
		int number = 0;
		String gender = "";
		double value = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		name = sc.next();
		
		System.out.print("학년(정수만) : ");
		hag = sc.nextInt();
		
		System.out.print("반(정수만) : ");
		ban = sc.nextInt();
		
		System.out.print("번호 정수만 : ");
		number = sc.nextInt();
		
		System.out.print("성별(남학생/여학생) : ");
		gender = sc.next();
		
		System.out.print("성적(소수점 아래 둘째 자리까지) : ");
		value = sc.nextDouble();
		
		System.out.printf("\n%d학년 %d반 %d번호 %s %s의 성적은 %.2f이다.\n", hag, ban,
				number, name, gender, value);
	}

	public void practice3() {
		int a = 0;
		int b = 0;
		int c = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		a = sc.nextInt();
		
		System.out.print("영어 : ");
		b = sc.nextInt();
		
		System.out.print("수학 : ");
		c = sc.nextInt();
		
		int total = a + b + c;
		float tem = total / 3f;
		
		System.out.printf("\n합계 : %d\n평균 : %.1f", total, tem);
		System.out.println("확인용");
	}


}
