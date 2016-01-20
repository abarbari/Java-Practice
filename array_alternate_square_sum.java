/* Java Array Fundamental: Alternate Square Sum
 * Objective:	Write a method alternate_sq_sum (JS: alternateSqSum ) that 
 *				takes an array of Integers as Input and finds the sum of 
 *				squares of the elements at even positions (i.e 2nd 4th 6th
 *				etc etc elements) and the rest of the elements at odd 
 *				Position (i.e 1st 3rd etc elements) without squaring them 
 *				(the odd ones) thus completing whole array.
 *
 * NOTE:		Elements at EVEN POSITION need to be squared, like element 
 *				at index ( assuming starting index of an array in language 
 *				to be 0 ) 1,3,5,7.. etc because 1st elements will be at 1st
 *				position (though it would have 0 as its index).
 *
 * Example:		alternateSqSum(new int[] {11, 12, 13, 14, 15}) // return 379
 *				Elements at indices 0, 2, 4 are 11, 13, 15 and they are at 
 *				odd positions as 11 is at position #1, 13 is at position #3 
 *				and 15 at #5. Elements at indices 1, 3 are 12 and 14 and 
 *				they are at even position. So we need to add 11, 13, 15 as 
 *				they are and square of 12 and 14.
 *
 *				--> 11 + 13 + 15 + 12^2 + 14^2 = 11 + 13 + 15 + 144 + 196
 *				= 379
 */
 
public class Kata {
	public static int alternateSqSum(int[] arr) {
		int result = 0;
		// Parse and check if 'i' is an odd number for square rule
		for(int i = 0; i < arr.length; i++) {
			result += (i % 2 == 1) ? arr[i]*arr[i] : arr[i];
		}
		return result;
	}
} 