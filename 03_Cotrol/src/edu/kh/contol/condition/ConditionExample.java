package edu.kh.contol.condition;

import java.util.Scanner;

public class ConditionExample { // 기능 제공용 class
	
	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		// if 문
		// 조건식이 true일때만 내부 코드 수행
		
		// 입력받은 정수가 양수인지 검사
		// 양수라면 "양수입니다"출력
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		if ( input > 0 ) {
			System.out.println("양수입니다.");			
		}
		
		if ( input <= 0 ) {
			System.out.println("양수가 아닙니다.");
		}
	}

	public void ex2() {
		// if else 문
		// 조건식 결과가 ture면 if면,
		// false면 else구문이 수행됨
		
		// 홀짝 검사
		// 입력받은 정수값이
		// 홀수이면 "홀수입니다." 출력
		// 0이면 "0입니다"
		// 짝수이면 "짱수입니다."출력
		// else if 사용X, 중척 if문 사용하기
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		if(input % 2 != 0 ) {
			System.out.println("홀수 입니다");
		} else { // 짝수 또는 0입력시 수행
			
			// 중첩 if문
			
			if(input == 0) {
				System.out.println("0입니다");
			} else {
				System.out.println("짝수 입니다.");
			}
			
		}
		
	}

	public void ex3() {
		
		// if(조건식) - else if(조건식) - else
		// 양수, 음수, 0 판별
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		if ( input > 0 ) {
			System.out.println("양수 입니다.");
			
		} else if( input < 0 ) {
			// 바로 위에 있는 if문이 만족되지 않은 경우 수행
			System.out.println("음수 입니다.");
			
		} else {
			System.out.println("0 입니다.");
		}
	}

	public void ex4() {
		
		// 달(month)을 입력받아 해당 달에 맞는 계절 출력
		// 1,2,12 겨울 (-15도 이하 : "한파 경보" / -12도 이하 : "한파 주의")
		// 3~5 봄
		// 6~8 여름 (35도 이상 : "폭염 경보" / 33도 이상 "폭염 주의보")
		// 9~11 가을
		// 1~12 사이가 아닐 땐 "해당하는 계절이 없다" 출력
		
		System.out.print("달 입력 : ");
		int month = sc.nextInt();
		int temPerature = 0;
		
		String season; // 아래 조건문 수행 결과를 저장할 변수 선언
		
		if( month == 1 || month == 2 || month ==12 ) {
			season = "겨울";
			
			System.out.print("온도 입력 : ");
			temPerature = sc.nextInt();
			
			if ( temPerature <= -15) {
				// 겨울 한파 경보
				season += " 한파 경보";
			} else if ( temPerature <= -12) {
				season += " 한파 주의보";
			}
					
		} else if( month >=3 && month <= 5) {
			season = "봄";
			
		} else if( month >= 6 && month <= 8) {
			season = "여름";
			
			System.out.print("온도 입력 : ");
			temPerature = sc.nextInt();
			
			if ( temPerature >= 35) {
				season += " 폭염 경보";
			} else if ( temPerature >= 33 ) {
				season += " 폭염 주의보";
			}
			
		} else if( month >= 9 && month <= 11 ) {
			season = "가을";
			
		} else {
			season = "해당하는 계절이 없습니다";
		}
		
		System.out.println(season);
	}

	public void ex5() {
		// 나이를 입력 받아
		// 13세 이하면 "어린이 입니다."
		// 13세 초과 19세 이하면 : "청소년 입니다."
		// 19세 초과 시 : "성인 입니다". 출력
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		String str = "";
		
		if (age <= 13 ) {
			str = "어린이 입니다.";
			
		} else if (age <= 19) {
			str = "청소년 입니다.";
			
		} else {
			str = "성인 입니다.";
		}
		
		System.out.println(str);
	}

	public void ex6() {
		// 점수(100점 만점)를 입력 받아
		// 90점 이상 : A
		// 80점 이상 90점 미만 : B
		// 70점 이상 80점 미만 : C
		// 60점 이상 70점 미만 : D
		// 60점 미만 : F
		// 0점 미만, 100 초과 : "잘못 입력하셨습니다"
		
		System.out.print("점수를 입력하세요 : ");
		double value = sc.nextDouble();
		
		String str = "";
		
		if ( value > 100 || value < 0 ) {
			str = "잘못 입력하셨습니다.";
		} else if( value >= 90) {
			str = "A";
		} else if( value >= 80) {
			str = "B";
		} else if( value >= 70) {
			str = "C";
		} else if( value >= 60) {
			str = "D";
		} else {
			str = "F";
		}
		
		System.out.println(str);
	}

	public void ex7() {
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		System.out.print("키를 입력하세요 : ");
		float height = sc.nextFloat();
		
		String str = "";
		
		if ( age <= 0 || age > 100) {
			str = "잘못 입력 하셨습니다.";
			
		} else if ( age >= 12 && height >= 140 ) {
			str = "탑승 가능";
		} else {
			if (age < 12) {
				str = "적정 연령이 아닙니다.";
			}
			if ( height < 140) {
				str = "적정 키가 아닙니다.";
			}
		}
		
		System.out.println(str);
	}

	public void ex8() {
		// 놀이기구 탑승 제한 검사 프로그램
		// 조건 - 나이 : 12세 이상
		// - 키 : 140.0cm 이상
		// 나이를 0~100세 사이로 입력하지 않은 경우 : "나이를 잘못 입력 하셨습니다."
		// 키를 0~250.0cm 사이로 입력하지 않은 경우 : "키를 잘못 입력 하셨습니다."
		// -> 입력이 되자 마자 검사를 진행하여 잘못된 경우 프로그램 종료
		// 나이 O , 키 X : "나이는 적절하나, 키가 적절치 않음";
		// 나이 X , 키 O : "키는 적절하나, 나이는 적절치 않음";
		// 나이 X , 키 X : "나이와 키 모두 적절치 않음";
		// 나이 O , 키 O : "탑승 가능"

		boolean isHeight;
		boolean isAge;
		
		String str = "";
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		if ( age > 100 || age < 0 ) {
			str = "나이를 잘못 입력 하셨습니다.";
			
		} else {
			
			System.out.print("키를 입력하세요 : ");
			
			float height = sc.nextFloat();
			
			if ( height > 250 || height < 0 ) {
				str = "키를 잘못 입력 하셨습니다";
				
			} else {
				
				if (age >= 12 ) isAge = true;
				else isAge = false;
				
				if ( height >= 140) isHeight = true;
				else isHeight = false;
				
				if ( isAge == true && isHeight == true) str = "탑승 가능";
				
				if ( isAge == true && isHeight == false) str = "나이는 적절하나, 키가 적절치 않음";
				
				if ( isAge == false && isHeight == true) str = "키는 적절하나, 나이는 적절치 않음";

				if ( isAge == false && isHeight == false) str = "나이와 키 모두 적절치 않음";
			}
		}
		
		
		System.out.println(str);
		
	}
	

}
