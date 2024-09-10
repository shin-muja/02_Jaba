package test.run;

import test.model.service.TestService;

public class TestRun {
	public static void main(String[] args) {

		int age  = 23;

		String result = "";
		
		result += (char)(age/100 + 'a');
		
		result += (char)(age/10 + 'a');

		System.out.println(result);
	}
}
