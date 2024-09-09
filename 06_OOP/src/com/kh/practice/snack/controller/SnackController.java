package com.kh.practice.snack.controller;
// Contriller : 사용자의 요청을 받아서 처리하고, 그 입력에 따라
// Model(데이터 처리, 비즈니스 로직)과 View(화면 출력를 연결해주는 역할

import com.kh.practice.snack.model.vo.Snack;

public class SnackController {
	
	private Snack s = new Snack();

	public SnackController() {
		System.out.println("스낵류를 입력하세요");
	}
	
	public String saveData(String kind, String name, String flavor, int numOf, int price) {
		
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumOf(numOf);
		s.setPrice(price);		
		
		return"저장 완료 되었습니다.\n저장한 정보를 확인하시겠습니까?(y/n) : ";
	}
	
	public String comfirmData() {
		return s.information();
	}
	
	

}
