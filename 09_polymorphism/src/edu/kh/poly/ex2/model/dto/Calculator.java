package edu.kh.poly.ex2.model.dto;

// 계산기 인터페이스
// -> 모든 계산기에 대한 공톨 필드, 기능명을 제공하는접점(interface)의 용도
public interface Calculator {
	
	// 인터페이스 : 추상클래스의 변형체 (추상클래스보다 추상도 높음)
	// - 추상클래스 : 일부만 추상메서드(0개 이상)
	// - 인터페이스 : 모두 추상메서드
	
	// 속성
	// 필드는 묵시적으로 public static final => 상수
	public static final double PI = 3.14;
	static final int MAX_NUM = 100000;
	public int MIN_NUM = -100000;
	int ZERO = 0;
	// 모두 생력 되어있지만 public static final 로 되어있다.
	
	// private int num;
	// Illegal modifier for the interface field Calculator.num; only public, static & final are permitted
	// 문법적 예외 public 외 다른 접근제한자 사용할 수 없음
	
	
	// 기능
	// 메서드는 묵시적으로 public abstract
	
	public abstract int plus(int num1 , int num2);
	
	int minus(int num1, int num2);
	
	public int multiple(int num1, int num2);
	
	public abstract int divide(int num1, int num2);
	

}
