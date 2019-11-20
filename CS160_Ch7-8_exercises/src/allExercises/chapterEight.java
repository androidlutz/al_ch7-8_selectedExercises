//HEADER
//Program Name: Chapter 8 Exercises 4 and 6.
//Author: Andrew Lutz
//Class: CS160 Fall 2019
//Date: 11/18/2019
//Description: These exercises demonstrate how to return the largest integer in an array and if the numbers 
//of an array are factors of n.


package allExercises;


public class chapterEight {
	//static int n = 4;
	//static int[] iArray = new int[] {10,20,30,40,50,60};
	
	public static void main(String[] args) {
		//n = 10;
		boolean result = areFactors(10, new int[] {10,20,30,40,50,60});
		System.out.println(result);
	}	
	
			//exercise 6
	 		public static boolean areFactors(int n, int[] numbers) {
	 			boolean allFactors = true;
	 			for(int number : numbers) {
	 				//if(i > numbers[i] && i % numbers[i] != 0) {
	 				if ((number % n) != 0) { 
	 					allFactors = false;
	 					break;
	 				}						
	 			}
	 			return allFactors;
	 			
 			}
	
}		
		
	

/*Footer
 * Output:
 * 
 * 
 * Yes, this can be written using an enhanced for loop.  It would replace the content within the for loop with 
 * someting like this: for(int n : arr) but i must be initialized when this is done.  
 *
 *
 *
 *

 */

