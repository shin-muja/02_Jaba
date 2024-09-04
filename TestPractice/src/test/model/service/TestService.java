package test.model.service;

import test.model.vo.Animal;

public class TestService {
	public void profile() {
		
		Animal dog = new Animal();
		
		dog.setType("포유류");
		dog.setName("뽀삐");
		dog.setLeg(4);
		dog.setWing(false);
		dog.setSwimming(true);
		
		System.out.println("종류 : " + dog.getType());
		System.out.println("이름 : " + dog.getName());
		System.out.println("다리 갯수 : " + dog.getLeg());
		dog.printSwim();
		dog.printWing();
	}
}
