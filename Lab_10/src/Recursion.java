import java.util.Arrays;

/**
 * 
 * @author sellercw
 *
 */
public class Recursion {
	public static int factorial(int n) {
		if( n== 0) {
			return 1;
		}
		else {
			return n * factorial(n-1);
		}
	}
	/**
	 * power method
	 * @param x an integer
	 * @param n an integer
	 * @return an integer of the power of a number
	 */
	public static int power(int x, int n) {
		if(n == 0)
			return 1;
		else 
			return x* power(x, n-1);
	}
	/**
	 * sum digits method
	 * @param n an integer value
	 * @return returns an integer of all the numbers in a number
	 */
	public static int sumDigits(int n) {
		if(n <10) 
			return n;
		else 
			return (n % 10) + sumDigits(n/10);

	}
	/**
	 * print backword
	 * @param word a string variable
	 */
	public static void printBackword(String word) {
		if(word.length() <= 1)
			System.out.println(word);
		else {
			System.out.print(word.charAt(word.length()-1));
			printBackword(word.substring(0,word.length()-1));
		}
	}
	/**
	 * is palindrome method
	 * @param word a string variable
	 * @return returns true if the word is a palindrome, false otherwise. 
	 */
	public static boolean isPalindrome(String word) {
		word = word.toLowerCase();
		if(word.length() < 2) 
			return true;
		else if(word.charAt(0) == (word.charAt(word.length()-1))){
			return isPalindrome(word.substring(1, word.length()-2));
		}
		else 
			return false;
	}
	/**
	 * sum positive function
	 * @param array an array of int values
	 * @return returns an integer of a sum of all positive ints
	 */
	 public static int sumPositive(int[] array) {
		 if(array.length == 0)
			 return 0;
		 else if(array[0] > 0)
			 return array[0] + sumPositive(Arrays.copyOfRange(array, 1, array.length));
		 else 
			 return sumPositive(Arrays.copyOfRange(array, 1, array.length));
	 }
	 /**
	  * max function
	  * @param array an int array 
	  * @return returns the max int in the array 
	  */
	public static int max(int[] array) {
		if(array.length == 1) {
			return array[0];
		}
		return Math.max(array[0], max(Arrays.copyOfRange(array, 1, array.length)));
	}
	/**
	 * main method for quick testing 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(factorial(3));
		System.out.println(power(3,2));
		printBackword("Happy");
		System.out.println(sumDigits(324));
		System.out.println(isPalindrome("racecar"));
		int[] intArray = new int[]{ 1,102,-4, 1, -10};
		System.out.println(sumPositive(intArray));
		System.out.println(max(intArray));

		
	}


}
