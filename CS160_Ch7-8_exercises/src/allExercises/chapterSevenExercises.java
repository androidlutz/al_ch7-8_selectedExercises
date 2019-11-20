//HEADER
//Program Name: Chapter 7 Exercises 1 and 4
//Author: Andrew Lutz
//Class: CS160 Fall 2019
//Date: 11/18/2019
//Description: These exercises demonstrate how to understand loops.

package allExercises;

public class chapterSevenExercises {
	
	public static void main(String[] args) {
		System.out.println(factorial(6));
		
		
	}//Exercise 4
	public static int factorial(int n) {
	  int result = 1;
	  int i;
		for(i = 1; i <= n; i++ ) {
			result = result * i;
			
	   }
		   return result;
	}
}
		   
	
	    	
		//Exercise one
	/*public static void loop(int n) {
	    int i = n;
	    while (i > 1) {
	        System.out.print(n);
	        if (i % 2 == 0) {
	            i = i / 2;
	        } else {
	            i = i + 1;
	     }
	}
	}
}

/*
 * EX 1.1.  
 *	n		i
    10		10
   	10		5
   	10		6
   	10		3
   	10		4
   	10		2    
 *	 
 * EX 1.2. The output for this loop is:
 * 10
   5
   6
   3
   4
   2
 * 
 * EX 1.3. This loop terminates when one is used as the parameter.  
 * 	  All other integers are increased by one if they do not meet the conditions. 
 * 
 *  
 * EX 4.  720

 * 
 * 
 *
 * 
*/
