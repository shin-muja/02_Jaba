package edu.kh.variable.ex2;

public class PrintExample {
	public static void main(String[] args) {
		// System.out.print() : 단순 출력 용 method(출력 후 줄바꿈 X)
		// System.out.println() : 한 줄 출력용 method(출력 후 줄바꿈 수행)
		// 줄바꿈 여부 차이점은 있지만 괄호안의 내용이 그대로
		// 출력된다는 것은 똑같다
		
		System.out.print("테스트1");
		System.out.println(); // 내용없는 println() : 단순 줄바꿈
		System.out.println("테스트2");
		System.out.println("테스트3");
		
		// System.out.printf() : 출력될 문자열 형식을 패턴으로 지정하는 출력구문
		
		System.out.println();
		
		int iNum1 = 10;
		int iNum2 = 5;
		
		// 10 + 5 = 15
		System.out.println(iNum1 + " + " + iNum2 + " = " + (iNum1 + iNum2));
		
		/*
		 * %d : 정수형, %o : 8진수, %x : 16진수
		 * %c : 문자, %s : 문자열
		 * %f : 실수(소수점 아래 6자리), %e : 지수형태표현, %g : 대입 값 그대로
		 * %A : 16진수 실수
		 * %b : 논리형
		 */
		
		// System.out.printf("패턴", 패턴에 들어갈 값);
		System.out.printf("%d + %d = %d\n", iNum1, iNum2, iNum1 + iNum2);
		// 줄바꿈 : \n
		
		int iResult1 = iNum1 + iNum1 * iNum2 / 2;
		System.out.printf("%d + %d * %d / 2 = %d\n", iNum1, iNum1, iNum2, iResult1);
		
		// 패턴 연습
		int iNum3 = 3;
		
		System.out.printf("%d\n",iNum3); // 3
		System.out.printf("%5d\n",iNum3); // 5칸 공간 확보 후 오른쪽 정렬
		System.out.printf("%-5d|\n",iNum3); // 5칸 공간 확보 후 왼쪽 정렬
		
		// 소수점 자리 제어( 반올리 처리)
		System.out.printf("%f\n", 10 / 4.0); // 2.50000000
		// 소수점 둘째 자리까지만 나타내기
		System.out.printf("%.2f\n", 10 / 4.0); // 2.50
		System.out.printf("%.0f\n", 10/ 4.0); // 소수점 아래를 표현하지 않겠다
		
		// 문자, 문자열, boolean
		boolean isTrue = false;
		char ch = '가';
		String str = "안녕하세요";
		
		// false / 가 / 안녕하세요~!
		System.out.printf("%b / %c / %s~!\n", isTrue, ch, str);
		
		// escape(탈출) 문자 : 일반 문자가 아닌 특수문자 표현
		
		// '\' 출력
		System.out.println("\\");
		
		// \o/
		System.out.println("\\o/");
		
		// tab 한공간 씩 표현 x, 한번에 공간 자치
		System.out.println("a\tb\tc\td");
		
		// 유니코드 이스케이프
		System.out.println("\u0041"); //A
		// 유니코드(16진수)
		// 65 를 16진수로 표현
		// 65 나누기 16 하면 몫 4, 나머지 1		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
