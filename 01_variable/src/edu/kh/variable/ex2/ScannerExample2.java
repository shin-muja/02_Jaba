package edu.kh.variable.ex2;

import java.util.Scanner;

public class ScannerExample2 {
	public static void main(String[] args) {
		
		// 사직 연산 계산기
		// -> 두 실수를 입력 받아 사칙연산 결과를 모두 출력
		// -> 단, 출력된 결과값은 소수점 이하 2째 자리까지만 표현
		
		// Scanner 필요
		Scanner sc = new Scanner(System.in);
		// ctrl + shift + o 파일에서 inport 되지 않은 클래스 모두
		// import 단축기
		
		System.out.print("실수 1 입력 : ");
		double input1 = sc.nextDouble();

		System.out.print("실수 2 입력 : ");
		double input2 = sc.nextDouble();
		
		// +, - , * , /
		
		System.out.printf("%.2f + %.2f = %.2f\n", input1, input2, input1 + input2);
		System.out.printf("%.2f - %.2f = %.2f\n", input1, input2, input1 - input2);
		System.out.printf("%.2f * %.2f = %.2f\n", input1, input2, input1 * input2);
		System.out.printf("%.2f / %.2f = %.2f\n", input1, input2, input1 / input2);
	}
}
