package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.Hero;

public class HeroService {
	public void practice() {
		Hero superMan = new Hero("슈퍼맨", "전사", 200, 20, 1,0);
		Hero batMan = new Hero("배트맨", "마법사", 100, 100, 1,0);
		
		superMan.vision();
		
		superMan.attack(100);
		superMan.attack(50.5);
		superMan.attack(49.5);
		superMan.dash();
		superMan.dash();
		superMan.dash();
		
		batMan.vision();

		batMan.attack(300);
		batMan.dash();
		batMan.attack(300);
		batMan.attack(300);
		
		System.out.println(superMan.toString());
		System.out.println(batMan.toString());
	
	}
	
	
}
