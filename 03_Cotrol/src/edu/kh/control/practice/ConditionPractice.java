package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		System.out.print("숫자를 한 개 입력하세요:");
		int input = sc.nextInt();
		
		if ( input % 2 == 0) {
			System.out.println("짝수입니다.");
		} else if ( input <= 0) {
			System.out.println("양수만 입력해주세요.");
		} else {
			System.out.println("홀수 입니다.");
		}
		
	}

	public void practice2() {
		boolean isPass = true;
		
		System.out.print("국어점수 : ");
		int a = sc.nextInt();
		
		if (a < 40)	isPass = false;
		
		System.out.print("수학점수 : ");
		int b = sc.nextInt();
		
		if (b < 40)	isPass = false;
		
		System.out.print("영어점수 : ");
		int c = sc.nextInt();
		
		if (c < 40)	isPass = false;
		
		int total = a + b + c;
		double tem = total / 3 ;
		
		if ( tem < 60 ) isPass = false;
		
		String str = "";
		
		if ( isPass == true ) { 
			str = "국어 : " + a + "\n수학 : " + b + "\n영어 :" + 
					c + "\n합계 : " + total + "\n평균 : " + tem;
			str += "\n축하합니다. 합격입니다!";
		} else {
			str = "불합격입니다.";
		}
		
		System.out.println(str);
		
		
	}
	
	public void practice3() {
		System.out.print("이번달을 입력해주세요(정수만) : ");
		int month = sc.nextInt();
		String str = "";
		
		switch(month) {
		case 1, 3, 5, 7, 8, 10, 12 : str = month + "월은 31일까지 있습니다.";
				break;
		case 4, 6, 9, 11 : str = month + "월은 30일까지 있습니다.";
				break;
		case 2 : str = "2월은 28일까지 있습니다."; break;
		
		default : str = month + "월은 잘못 입력된 달입니다."; break;
		}
		
		System.out.println(str);
	}

	public void practice4() {
		double bmi;
		String str = "";
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게를(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		bmi = weight / ( height * height );
		
		System.out.printf("BNI지수 : %.2f\n", bmi);
		
		if ( bmi >= 30 ) {
			str = "고도 비만";
		} else if ( bmi  >= 25) {
			str = "비만";
		} else if ( bmi  >= 23) {
			str = "과체중";
		} else if ( bmi  >= 18.5) {
			str = "정상체중";
		} else {
			str = "저체충";
		}
		
		System.out.println(str);
	}
	
	public void practice5() {
		
		String str = "";
		
		int input;
		
		System.out.print("중간 고사 점수 : ");
		input = sc.nextInt();
		
		double middle = input * 0.2;
		
		System.out.print("기말 고사 점수 : ");
		input = sc.nextInt();
		
		double last = input * 0.3;
		
		System.out.print("과제 점수 : ");
		input = sc.nextInt();
		
		double report = input * 0.3;
		
		System.out.print("출석 횟수 : ");
		input = sc.nextInt();
		
		double run = input;
		
		double total = middle + last + report + run;
		
		System.out.println("================= 결과 =================");
		
		str += "중간 고사 점수(20) : " + middle;
		str += "\n기말 고사 점수(30) : " + last;
		str += "\n과제      점수(30) : " + report;
		str += "\n출석      점수(20) : " + run;
		str += "\n총점 : " +  total;
		
		if ( run <= (20 * 0.7)) {
			str = "Fail [출석 횟수 부족 (" +  (int)run +"/20)]";
		} else if ( total >= 70 ) {
			str += "\nPASS";
		} else {
			str +=  "\nFail [점수 미달]";
		}
		
		System.out.println(str);
		
	}


}
