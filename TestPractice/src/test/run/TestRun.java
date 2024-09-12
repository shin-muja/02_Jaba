package test.run;

public class TestRun {
	public static void main(String[] args) {
		
		String answer = "";
		String letter = ".... . .-.. .-.. ---";
        String[] morse = {".-","-...","-.-.","-..","."
        		,"..-.","--.","....","..",".---",
        		"-.-",".-..","--","-.","---",".--.","--.-",
        		".-.","...","-","..-","...-",".--","-..-","-.--"
        		,"--.."};

    	String str = null;
        
        for( int i = 0 ; i < letter.length() ; i++) {
        	if(letter.charAt(i) != ' ') {
        		str+= letter.charAt(i);
        		System.out.println(str);
        		
        	}	else {
        		for( int j = 0 ; j < morse.length ; j++ ) {
        			if(str.equals(morse[j])) {
        				
        				answer += (char)(i + 'a');
        				str = null;
        				System.out.println(i + " / " + answer);
        				break;
        			}
        		}
        	}
        }
        
        str = "....";
        System.out.println(str.equals(morse[4]));
        System.out.println(morse[8]);
        System.out.println(answer);
	}
}
