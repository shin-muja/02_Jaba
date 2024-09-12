package edu.kh.exception.model.service;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionService {

	// 예외(Exception) : 소스코드의 수정으로 해결 가능한 오류
	
	// 예외는 두 종류로 구분됨
	// 1) Unchecked Exception : 선택적으로 예외 처리 ( ex. Runtime Exception..)
	// 2) Checked Exception : 필수적으로 예외 처리( ex. IOException, 나머지... )
	
	private Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		
		System.out.println("두 정수를 입력 받아 나누기한 몫을 출력");
		
		System.out.print("정수 1 입력 : ");
		int input1 = sc.nextInt();
		
		System.out.print("정수 2 입력 : ");
		int input2 = sc.nextInt();
		
		
		try {
			// 예외가 발생할거 같은 코드
			
			System.out.println("결과 : " + input1 / input2);
			// java.lang.ArithmeticException: / by zero : 산술적 예외 ( 0으로 나눌 수 없다..)
			
		} catch(ArithmeticException e) {
			// try에서 던져진 예외를 catch문의 매개변수 e로 잡음
			System.out.println("infinity"); // 처리코드
		}
		
		if( input2 != 0) {

			System.out.println("결과 : " + input1 / input2);
		} else {
			System.out.println("infinity");
		}
		
		// 발생하는 예외 중 일부 예외 try-catch 사용 안 해도
		// if - else 예외 상황 방지 가능
		// 일부예외 == 대부부 Unchecked Exception
	}
	
	public void ex2() {
		// 여러가지 예외에 대한 처리 방법
		
		try {
			System.out.print("정수 1 입력 : "); // InputMismatchException
			int input1 = sc.nextInt(); // int형이 아닌 다른형 넣었을때
			
			System.out.print("정수 2 입력 : "); // InputMismatchException
			int input2 = sc.nextInt(); // int형이 아닌 다른형 넣었을때
			
			System.out.println("결과 : " + input1 / input2);// java.lang.ArithmeticException: / by zero
			// input2에 0이 들어왔을 때
			
			String str = null;
			
			System.out.println( str.charAt(0) );
			// java.lang.NullPointerException: Cannot invoke "String.charAt(int)" because "str" is null
		
		// InputMismatchException, ArithmeticException 둘다 RuntimeException 후손
		// RuntimeException은 Exceprion 후손
		// 그렇기에 Exception 첫 조건으로 쓸시
		// Exception이 모든 예외를 처리하기에 뒤 예외까지 갈일이 없다
		} catch( InputMismatchException e ) {
			System.out.println("타입에 맞는 값만 입력하세요.");
		} catch ( ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} catch ( Exception e ) {
			// Exception 클래스 : 모든 예외의 최상위 부모
			// 다형성 - 업캐스팅 : 부모타입 참조변수로 자식객체 참조
			
			// ** 상위 타입의 예외 클래스를 catch문에 작성하면
			//    다형성 업캐스팅에 의해 모두 잡아서 처리 가
			
			System.out.println("뭔지 모르겠으나 예외가 발생해서 처리함");
			e.printStackTrace();
			// 발생한 예외에 대한 메서드와 위치에 대한 모든 내용을 출력
			// 예외 발생 지점 추적 메서드
		}
	}
	
	public void ex3() {
		// try - catch - finally
		// finally : try 구문에서 예외가 발생 하든말든 무조건 마지막에 행
		
		try {
			
			System.out.print("정수 1 입력 : "); // InputMismatchException
			int input1 = sc.nextInt(); // int형이 아닌 다른형 넣었을때
			
			System.out.print("정수 2 입력 : "); // InputMismatchException
			int input2 = sc.nextInt(); // int형이 아닌 다른형 넣었을때
			
			System.out.println("결과 : " + input1 / input2);// java.lang.: / by zero
			
		} catch(ArithmeticException e ) {
			System.out.println("예외 처리 됨");
			
			// catch문 매개변수 활용
			// 매개변수 e : 예외 관련된 정보 + 예외 관련기능
			
			System.out.println( e.getClass() ); // 어떤 예외 클래스인가
			
			System.out.println( e.getMessage() ); // 예외 발생 시 출력된 내용
			
			System.out.println(e); // e.toString()
			
			e.printStackTrace();
			
		} catch(InputMismatchException e) {
			System.out.println("숫자만 넣어라..");
		} finally {
			
			System.out.println("무조건 수행됨");
			sc.close(); // 스캐너 통로 닫기 : 메모리 누수 방지
		}
	}
	
	public void ex4() {
		
		// throw / throws
		try {
			methodA();
			
		} catch(Exception e ) {
			// Exception : 모든 예외의 최상위부모
			// == 예외 종류 상관없이 모두 처리
			
			System.out.println("methodC 에서부터 발생한 예외를 ex4에서 잡아 처리함");
			
		}
	}
	
	public void methodA() throws IOException {
		methodB();
	}
	
	public void methodB() throws IOException {
		
		methodC();
	}
	
	public void methodC() throws IOException {
						// throws : 호출할 메서드에게 예외를 던짐
						// -> 호출한 메서드에게 예외를 처리하라고 위임하는 행위
		
		// throw : 예외 강제 발생 구문
		// checked Exception == Exception 객체
		throw new IOException(); 
	}
	
	public void ex5() throws UserException {
		// 사용자 정의 예외
		
		throw new UserException("사용자정의 예외 발생");
	}
}










