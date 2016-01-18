/* Java String Fundamental: Highest and Lowest
 * Objective:	In this little assignment you are given a string of space separated numbers, 
 *				and have to return the highest and lowest number.
 *
 * Example:		HighAndLow("1 2 3 4 5") // return "5 1"
 * 				HighAndLow("1 2 -3 4 5") // return "5 -3"
 *				HighAndLow("1 9 3 4 -5") // return "9 -5"
 * Notes:		All numbers are valid Int32, no need to validate them. There will always be
 * 				at least one number in the input string. Output string must be two numbers 
 * 				separated by a single space, and highest number is first.
 */
 
public class Kata {
	public static String HighAndLow(String numbers) {
    
		// Split into individual elements for an Array
		String[] split = numbers.split(" ");
    
		// Create an equally sized Array of Integers
		int[] parsed = new int[split.length];
    
		// Add elements from String Array to Integer Array
		for(int j = 0; j < split.length; j++) {
			parsed[j] = Integer.parseInt(split[j]);
		}
    
		// Set 'min' and 'max' to first number in Array so checks
		// are only limited to the elements in the Array
		int min = parsed[0];
		int max = parsed[0];
    
		// Parse through and check and set changes to 'min' and 'max'
		for(int i = 0; i < parsed.length; i++) {
			if(min > parsed[i]) {
				min = parsed[i];
			}
			if(max < parsed[i]) {
				max = parsed[i];
			}
		}
    
		// Create String with proper formatting
		String result = max + " " + min;
    
		return result;
	}
}