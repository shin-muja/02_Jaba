package edu.kh.oop.practice.run;

import edu.kh.oop.practice.model.service.BookService;
import edu.kh.oop.practice.model.service.HeroService;

public class PracticeRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookService service = new BookService();
		// 클래스 안에 생성자가 하나도 없다면
		// 컴파일러가 기본생성자는 자동으로 만들어줌
		// -> 그래서 우리가 BookService()이렇게 사용 가능하다.
		// -> 생성자가 하나라도 있으면 기본생성자 자동으로 생성X
		// -> 매개변수 생성자 만들었다면, 기본생성자 개발자가 만들어야함
		
		HeroService heroService = new HeroService();
		
		
		// service.practice();
		heroService.practice();

	}

}
