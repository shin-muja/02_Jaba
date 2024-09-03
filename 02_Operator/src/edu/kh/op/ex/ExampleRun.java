package edu.kh.op.ex;

public class ExampleRun { // 코드 실행용 class

	// 메인 method 필수 작성
	public static void main(String[] args) {
		
		// OpExample 생성
		// -> OpExample 이라는 class(설계도) 를 이용해서
		//    객체를 생성하는데 , 그 객체 이름이 opEx 다.
		OpExample opEx = new OpExample();
		// 같은 패키지 (edu.kh.op.ex) 안에 있는 class는
		// import를 하지 않아도 사용할 수 있다.
		
		// ex1() method 호출
		// opEx.ex1(); // opEx가 가지고 있는 ex1() method 실행
		
		// opEx.ex2();
		
		// opEx.ex3();
		
		opEx.ex4();
		
		
		
	}

}
