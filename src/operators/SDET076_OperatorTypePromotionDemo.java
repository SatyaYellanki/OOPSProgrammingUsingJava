package operators;

/**
 * Headline: Data Type Compatibility with Operators Demo
 *
 * Description: Demonstrates how Java handles type compatibility when using
 * operators, focusing on implicit type promotion and compile-time errors.
 *
 * Purpose: - Highlight common pitfalls with byte/short/char when used in
 * arithmetic. - Show why compound assignment works while normal assignment
 * fails. - Frequently asked tricky question for mid-senior QA interviews.
 *
 * Usage: Run and observe compilation behavior vs execution behavior.
 */

public class SDET076_OperatorTypePromotionDemo {
	public static void main(String[] args) {
		// Example 1: Normal assignment with byte
		byte b = 10;
		// b = b + 1; // ❌ Compile-time error: "possible lossy conversion from int to
		// byte"

		// Example 2: Compound assignment (implicit cast)
		b += 1; // Works because (b = (byte)(b + 1))
		System.out.println("After += : " + b); // Expected 11

		// Example 3: Promotion in expressions
		short s1 = 5, s2 = 10;
		// short s3 = s1 + s2; // ❌ Compile error (int result cannot be assigned to
		// short)
		int s3 = s1 + s2; // ✅ Correct way
		System.out.println("Sum of shorts promoted to int: " + s3);

		// Example 4: Real-world QA scenario (Salary calculation overflow risk)
		short monthlySalary = 30000;
		short months = 12;
		// short yearlySalary = monthlySalary * months; // ❌ Compile error
		int yearlySalary = monthlySalary * months; // ✅ Correct
		System.out.println("Yearly Salary: " + yearlySalary);

		// Example 5: Mixed data types
		int x = 5;
		double y = 2.5;
		double result = x + y; // int promoted to double
		System.out.println("Mixed type addition (int + double): " + result);
	}
}
