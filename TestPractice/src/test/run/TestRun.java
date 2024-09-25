package test.run;

import java.util.*;

import test.model.vo.Animal;

public class TestRun {
	public static void main(String[] args) {
		
		int[] array = {0, 11, 12};
		
		int n = 11;
		
		int min = array[0] - n;
        
        if(min < 0) min *= -1;
        
        for(int i = 0 ; i < array.length ; i++ ) {

            if ( array[i] == n ) {
            	System.out.println(array[i]);
            }
            
            int x = array[i] - n;
            
            if(x < 0) x *= -1;
            
            if( min > x) min = x;
        
        }
        
        for( int i = 0; i < array.length ; i++ ) {
            int x = array[i] - n;
            
            if(x < 0) x *= -1;
            
            if( min == x) {
            	System.out.println(array[i]); ;
            }
            
        }
	
		
		System.out.println("못찾음");
		
	}
}
