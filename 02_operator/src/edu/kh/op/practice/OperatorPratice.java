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
		
		// nextLine(); 입력버퍼 비우는 일 (개행문자 비우기)
		
		System.out.print("성별(남학생/여학생) : ");
		gender = sc.next();
		// next() : 문자열 : 공백X
		// nextLine() : 문자열 - 띄어쓰기 , 공백 O
		// 위 nextInt() 입력 후 \n가 입력버퍼로 남아있어 바로 nextLine() 사용 시
		// \n 개행문자가 바로 출력후 nextLine() 으로 입력된다
		// nextInt(), nexDouble()등 다음으로 next()가 아닌 nextLine() 사용하고 싶을시
		// 위처럼 nextLine()으로 미리 개행문자를 받아줘야 한다.
		
		
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
