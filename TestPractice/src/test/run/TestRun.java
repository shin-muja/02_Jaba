package test.run;

import test.model.service.TestService;

public class TestRun {
	public static void main(String[] args) {
		TestService run = new TestService();
		
		String my_string = "AAAaaaZZZzzz";
		String result = "";
		
		
		for(int i = 0; i < my_string.length() ; i++ ) {

			if( (int)my_string.charAt(i) >= 65 && (int)my_string.charAt(i) <= 90) {
				result += my_string.toLowerCase().charAt(i);
			}
            
        }
		
		
		System.out.println(result);
	}
}
