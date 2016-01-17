/* Java Array Fundamentals: Compound Array
 * 
 * Objective: 	You have to create a method "compoundArray" which should take as input 
 * 				two int arrays of different length and return one int array with numbers
 * 				of both arrays shuffled one by one. 
 *
 * Example: 	Input - {1,2,3,4,5,6} and {9,8,7,6} Output - {1,9,2,8,3,7,4,6,5,6}.
 */

public class CompoundArray {
    
    public static int[] compoundArray(int[] a, int[] b){
    	// Size and Allocate Compounded Array for Return 
		int tot_size = a.length + b.length;
    	int[] c = new int[tot_size];
		int j = 0;
      
		// Sequentially add elements from Input to Compounded Array
		for(int i = 0; i < tot_size; i++){
			if(i < a.length){
				c[j] = a[i];
				j++;
			}
			if(i < b.length){
				c[j] = b[i];
				j++;
			}
		}    	
    
    	return c;
    }
}