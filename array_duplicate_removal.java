/* Java Array Fundamental: Remove Duplicates
 * Objective: 	Write a function called unique that takes an array of integers 
 * 				and returns the array with duplicates removed. It must return 
 * 				the values in the same order as first seen in the given array. 
 *				Thus no sorting should be done, if 52 appears before 10 in the
 *				given array then it should also be that 52 appears before 10 
 * 				in the returned array.
 *
 * Assumptions: All values given are integers (they can be positive or 
 * 				negative). You are given an array but it may be empty. They 
 *				array may have duplicates or it may not. You cannot use the 
 * 				uniq method on Arrays (don't even try it), or the nub function
 *				from Data.List.
 *
 * Example: 	UniqueArray.unique([1, 5, 2, 0, 2, -3, 1, 10]) 
 *				// -> [1, 5, 2, 0, -3, 10]
 */

 import java.util.*;

public class UniqueArray {
  public static int[] unique(int[] integers) {
    
    /* If: Input is an array of size 1 or less return Input */
    if(integers.length <= 1) {
		return integers;
    }
    
    /* Set Size for new array adjustments */
    int size = integers.length;
    
    /* Else: Parse through Input shifting next elements over duplicates */
    // Parse through to find duplicates
    for(int i = 0; i < size; i++) {
    	for(int j = i + 1; j < size; j++) {
			// If found hold value for shifting
			if(integers[i] == integers[j]) {
				int temp = j;
          
				// Shift following elements left like a fake removal
				for(int k = j + 1; k < size; k++, temp++){
					integers[temp] = integers[k];
				}
				// Reduce size for every duplicate
				size--;
				// Reduce 'j' to go back to previous value
				j--;
			}
		}
    }
    
    /* Create new array with updated information */    
    int[] return_array = new int[size];
    
    /* Add Values to return array */
    for(int n = 0; n < size; n++){
    	return_array[n] = integers[n];
    }
    
    return return_array;
  }
}