import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * @author sellercw
 *
 */
public class RecursionTest {

	/**
	 * test Factorial
	 */
	public void testFactorial() {
		assertEquals(2,Recursion.factorial(21));
		assertEquals(0,Recursion.factorial(0));
		assertEquals(-1,Recursion.factorial(-1));
	}
	/**
	 * test power
	 */
	public void testPower() {
		assertEquals(2,Recursion.power(2,1));
		assertEquals(1,Recursion.power(0,21));
		assertEquals(-1,Recursion.power(-1,21));
	}

	/**
	 * test sum digits
	 */
	public void testSumDigits() {
		assertEquals(3,Recursion.sumDigits(21));
		assertEquals(0,Recursion.sumDigits(0));
		assertEquals(-1,Recursion.sumDigits(-1));
	}

	/**
	 * test print backword
	 */
	public void testPrintBackword() {
		String word = "cars";
		Recursion.printBackword(word);
	}

	/**
	 * test is palindrome
	 */
	public void testIsPalindrome() {
		String word = "cars";
		assertEquals(false, Recursion.isPalindrome(word));
	}

	/**
	 * test sum positive
	 */
	public void testSumPositive() {
		int[] intArray = new int[]{ 1,102,-4, 1, -10};
		assertEquals( 104, Recursion.sumPositive(intArray));

	}

	/**
	 * test max
	 */
	public void testMax() {
		int[] intArray = new int[]{ 1,102,-4, 1, -10};
		assertEquals( 102, Recursion.sumPositive(intArray));
	}

}
