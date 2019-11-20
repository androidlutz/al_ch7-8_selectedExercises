/HEADER
//Program Name: Chapter 7 Exercise 4
//Author: Andrew Lutz
//Class: CS160 Fall 2019
//Date: 11/18/2019
//Description: This exercise demonstrates how to understand loops.


package allExercises;

public class exercise_four {

		public static void main(String[] args) {
			
			int result = indexOfMax(new int[] {1,2,3,4,5});
			System.out.println(result);
		}		
			//Exercise 4
			public static int indexOfMax(int[] arr) {
				int max = 0 ;
				int i;
				for (int n : arr) {
				//(i = 1; i < arr.length; i++) {
						if(arr[n] > arr[max]) {
							max = n;
						}
			
						return max;
				}
				
			}
}



/*
 * Footer
 * Yes, this can be written using an enhanced for loop.  It would replace the content within the for loop with 
 * someting like this: for(int n : arr) but i must be initialized when this is done.  
 * 
 * This program would not successfully run and I could not figure out how to fix it.  
 * It was after class that I discovered this was the case and it was too late to do anything about it.
*/
