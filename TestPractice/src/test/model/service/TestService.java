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
	
	public void test() {
		int arr[] = {1, 1, 2, 2};
		int max = 0;
		int answer = 0;
		
		for( int i = 0 ; i < arr.length ; i++) {
			int count = 0;
			for(int j = 0 ; j < i ; j++) {
				if(arr[i] == arr[j]) count++;
			}
			if( max < count) {
				max = count;
				answer = arr[i];
			}
			
			if(max == count &&answer != arr[i]) {
				answer = -1;
			}
		}
		
		
		System.out.println(answer);
		
	}
}
