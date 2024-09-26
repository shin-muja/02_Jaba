package test.run;

import java.util.*;

import test.model.vo.Animal;

public class TestRun {
	public static void main(String[] args) {
		String str1 = "ab6CDE443fgh22iJKlmn1o";
		String str2 = "6CD";
		
		for( int i = 0 ; i < str1.length() - str2.length() ; i++ ) {
            String str = "";
            
            for( int j = i; j < i+3 ; j++ ) {
                str += str1.charAt(j);

            }

            if( str.equals(str2))System.out.println(1);
        
        }
        System.out.println(2);;
		
	}
}
