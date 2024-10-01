package test.run;

import java.util.*;

public class TestRun {
	public static void main(String[] args) {
		
		String[] dic = {"def", "dww", "dzx", "loveaw"};
		String[] spell = {"z", "d", "x"};
		
		for( String di : dic) {
			for (int i = 0 ; i < spell.length; i++ ) {
				if(!di.contains(spell[i])) break;
				
				if(i == spell.length - 1) System.out.println("성공");
			}
		}
		
		System.out.println(2);
	}
	
}


