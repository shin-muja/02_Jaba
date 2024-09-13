package test.run;

import java.util.*;

import test.model.vo.Animal;

public class TestRun {
	public static void main(String[] args) {
		
		int k = 1;
		
		int num = 29183;
		
		String str = "" + num;
		
		System.out.printf("%c\n", (char)( k + '0'));
        
        for( int i = 0; i< str.length() ; i++ ) {
        	System.out.println(str);
            if( str.charAt(i) == (char)( k + '0')) {
            	System.out.println(i + 1);
            }
        }
        System.out.println("-1");
		
	}
}
