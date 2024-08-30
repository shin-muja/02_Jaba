package edu.kh.practice;

public class Practice {
	public void ex1() {
		String str = "";
		
		for ( int i = 1 ; i <= 5 ; i++) {
			str = "";
			for ( int j = 1 ; j <= i; j++) {
				str += "*";
			}
			System.out.println(str);
		}
	}

	
	public void ex2 () {
		byte i= 127;
		byte j = (byte) (i + 2);
		System.out.println(j);
	}
}
