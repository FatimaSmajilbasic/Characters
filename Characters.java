package chars;

public class Characters {
    String input;
	 
	     Characters(String input){
	    	 this.input = input;
	     }
	     public static void atEvenIndex(String input) {
	    	 for ( int i = 0; i < input.length(); i++) {
	    		 if ( i % 2 == 0) {
	    			 System.out.print(input.charAt(i) + ", ");
	    		 }
	    	 }
	     }
	     public static void atOddIndex(String input) {
	    	  for ( int i = 0; i < input.length(); i++) {
	    		 if ( i % 2 != 0) {
	    			 System.out.print(input.charAt(i) + ", ");
	    		 }
	    	 }
	     }
	     public static int numberOfUpperCase(String input){
	    	 int count = 0;
	    	 for ( int i = 0; i < input.length(); i++) {
	    		 if(Character.isUpperCase(input.charAt(i))) {
	    			 count++;
	    		 }
	    	 }
	    	  return count;
	     }
	     public static int numberOfLowerCase(String input) {
	    	 int count = 0;
	    	 for ( int i = 0; i < input.length(); i++) {
	    		 if(Character.isLowerCase(input.charAt(i))) {
	    			 count++;
	    		 }
	    	 } return count;
	    	
	     }
	     public static int notChars(String input) {
	     int count = 0;
		 for ( int i = 0; i < input.length(); i++) {
			 if(!Character.isLetter(input.charAt(i))) {
				 count++;
			 }
		 }   return count;
		
	 }

}


