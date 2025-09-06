package operators;

/**
 * Demonstrates the practical application of the modulus operator (%) for
 * calculating remainders and solving common problems like even/odd checks.
 *
 * @author Satya
 * @version 1.1
 */
public class SDET063_ModulusOperatorDemo {

	public static void main(String[] args) {

		//Modulus -> Remainder
		
		
		// --- Example 1: Modulus with Double Data Type ---
		double dividend = 34.0;
		double divisor = 10.0;
		// Calculate remainder of 34 divided by 10
		double result = dividend % divisor;
		// Expected: 34.0 / 10.0 = 3 with a remainder of 4.0
		System.out.println("The remainder of " + dividend + " % " + divisor + " is: " + result);

		// Manual Calculation Visualization:
		// 10 | 34 | Q - 3
		// | 30 |
		// -------
		// Remainder -> 4

		// --- Example 2: Even or Odd Number Detection ---
		int numberToCheck = 38;
		// The remainder of any integer divided by 2 can only be 0 or 1.
		int remainder = numberToCheck % 2;
		System.out.println("The remainder of " + numberToCheck + " % 2 is: " + remainder);

		// --- Application: Comparator Operator for Logic ---
		// This is the standard logic for checking if a number is even or odd.
		// If (num % 2 == 0), the number is Even (no remainder, divisible by 2).
		// If (num % 2 == 1), the number is Odd (a remainder of 1 exists).

		if (remainder == 0) {
			System.out.println("QA Conclusion: The number " + numberToCheck + " is EVEN.");
		} else {
			System.out.println("QA Conclusion: The number " + numberToCheck + " is ODD.");
		}
	}
}
