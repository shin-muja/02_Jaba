package edu.kh.basic;


// 한 줄 주석
/*
 * 범위 주석
 */

// class : 자바 코드가 작성되는 영역
public class JavaBasic {
	
	// 'main' 입력 후 ctrl + space -> 맨 위에 main method 자동완성
	// 면접 때 기본적인 것으로 묻기에 자동완성은 자제
	public static void main(String[] arge) {
		// main method(메서드) : 자마 애플리케이션(프로그램)을 실행하기 위해
		// 반드시 필요한 메서드
		
		// 콘솔창에 출력 메서드
		System.out.println("Hellow, World!!");
		System.out.println("점심 배고파");
		System.out.println("자동완성 확인");
		// 'syso' 입력 후 ctrl + space System.out.println 자동완성
		
		System.out.println("-------------------------------");
		
		// 숫자 연산
		System.out.println("1 + 2 : ");
		System.out.println(1 + 2);
		
		// ""안에 작성된 코드는 단순 문자열로 인식
		// ""안에 작성되지 않은 코드는 숫자, 변수로 인식

		System.out.println(50 - 23);
		System.out.println(12 * 13);
		System.out.println(327 / 3);
		System.out.println(12 % 2);
		
		// debug : ctrl + F11
		
		// "" (문자열) + 숫자 함께 작성
		
		System.out.println("14 * 19 = " + 14 * 19);
		System.out.println("14 * 19 = " + 266);
		
		int a = 90 + 70 + 65; 
		
		System.out.println("90 + 70 + 65 = " + a);
		
		// 자바는 사칙연산의 우선 순위를 그대로 따른다
		// -> 우선 계산을 원하면 () 괄호 사용 또는 변수 사용
		// -> 숫자 + 숫자 = 덧셈 연산 결과
		// -> 문자열 + 숫자 or
		//		문자열 + 문자열 --> 이어쓰기
		
		
		
		
		
	}
}
