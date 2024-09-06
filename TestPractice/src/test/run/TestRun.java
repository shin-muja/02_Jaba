package test.run;

import test.model.service.TestService;

public class TestRun {
	public static void main(String[] args) {
		TestService run = new TestService();
		
		// run.profile();
		// run.test();
		
		char a = 'a';
		char A = 'A';
		char Z= 'Z';
		
		if( A == 65) System.out.println("같다");
		
		System.out.println((int)a+ "\n"+ (int)A + "\n" + (int)Z);
	}
}
