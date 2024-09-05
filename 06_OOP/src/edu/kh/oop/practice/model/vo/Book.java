package edu.kh.oop.practice.model.vo;

public class Book {
	
	// 필드
	private String title;
	private int price;
	private double discountRate;
	private String author;
	
	// 기본 생성자
	public Book() {} // (Ctrl + space + enter)
	
	// 매개변수 생성자
	// Alt + Shift + s -> Generate Constructor using fields.. -> generate
	public Book(String title, int price,
			double discountRate, String author) {
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		this.author = author;
	}
	
	
	
	
	// 어노테이션 : 컴파일러용 주석
	// 해당 java 자체 메서드가 있지만 개발자가 직접 재정의함
	// Overriding : 재정의(메서드)
	@Override
	public String toString() {
		return title + " / " + price + " / " + discountRate + " / " + author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	
	/*
	 * 현실 객체 : 인간이 인식할고 정의 할수 있는것들로 동물,눈 책상 같은 생물체나
	 * 				물체뿐만이 아닌 판소리, 분자등 과 같은 실체를 보거나 만질순 없지만
	 * 				인식될 수 있는것들도 하나의 객체이다.
	 * 
	 * 객체 지향 언어 : 사물이나 개념처럼 독립된 객체들로 발생하는 모든 사건들의
	 * 					행동이나 결과들을 이 개념을 컴퓨터로 작동하게 하는 방법
	 * 
	 * ** 자바 객체 : 클래스에 정의된 내용(설계도)을 통해 new 연산자로 메모리 영역에 행성된 것
	 * 
	 * class : 속성(이름, 구조,요소등)(필드 == 필드변수 == 멤버변수),
	 * 			기능(수영하는 동작, 밥먹기 등)(생성자, method)로 이루어진 설계도
	 * 			class 작성시 추상화, 캡슐화는 반드시 구성되어야함
	 * 
	 * new 연산자 : 사용법 (자료형) 변수명 = new (자료형) / 자료형(사용자 지정 자료형)
	 *				사용자가 변수명을 선언 후 해당 객체의 설계도를 new 연산자를 통해
	 *				하나의 틀을 heap 영역에 생성 후 heap영역의 주소를 stack영역 변수에 할당한다
	 *				사용자는 변수에 할당된 주소를 통해 heap영역의 틀을 사용하여 속성을 정의하고
	 *				기능을 수행시킨다
	 * 
	 * 추상화 : 흔히 동물로 쳤을때 다리가 4개이고 머리에 풍성한 갈기가 달리고 육식동물이라 하면
	 * 			수컷사자를 연상시키는 거와 같이 해당 속성들과 기능을 통해 클래스를 표현하근 것
	 * 			JAVA에서 기본으로 적용되는 특징 
	 * 
	 * 캡슐화 : 외부로부터 class 내부 속성들을 지키며 필드, 생성자, 메소드를 하나로 묶어 사용할수
	 * 			있게하는 특징, 부가적으로 정보은닉의 효과가 발생함
	 *  
	 * 캡슐화 원칙 : 필드 (== 필드변수 == 멤버변수)는 접근제어자를 public이 아닌 private를 사용하여
	 * 				함부로 외부에서 속성을 변형시킬수 없게 해야한다
	 * 
	 * 메서드/기능의 '정의'란 : 전달받은 값이 있을수도 없을수도 있지만 메소드내의 연산내용(함수)을
	 * 							수행 후 반환할 값이 있을 가지고 반한하는 과정?기능?
	 *  
	 * 메서드의 '호출' 이란 : 메서드에 정의된 함수를 그 위치에서 연산시키기 위한 행위
	 * 						같은 클래스내에서는 메서드명(); 으로 간단한 하게 불러올수 있고
	 * 						클래스 위부에서 호출시 new 연산자를 통해 인스턴스화 한다음
	 * 						변수명.메서드명(); 으로 호출할 수 있다.						
	 * 
	 * return : 해당 예약어 작동 시 뒤 작동할 내용이 있더라도 호출한 곳으로 돌아가는 예약어
	 * 			반환할 값이 있다면 메소드의 반환형에 맞는 값을 가지고 호출한곳으로 돌아감
	 * 
		[접근제어자] 반환형 메소드명
		public String ex1() {
    		return "Hi";
		}   

	위 메서드 상세히 해석 : 메소드명 ex1()로 호출시 접근제어자 public으로 어디서든 접근가능하며
							ex1() 내부에 있는 "Hi"라는 문자열 String(으로 반환해준다.
	
	 */

}
