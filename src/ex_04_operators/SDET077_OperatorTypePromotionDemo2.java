package operators;

/**
 * ========================= Program: DataTypeCompatibilityDemo Domain: Common
 * (E-Commerce, Banking, Telecom) ========================= Description:
 * Demonstrates datatype compatibility and promotions with operators: - Widening
 * (int → double) - Narrowing (double → int) - char → int (Unicode) - byte +
 * byte → int (type promotion in arithmetic)
 *
 * Purpose: - To show how operators behave with mixed datatypes. - Essential for
 * QA validation when testing systems with mixed-type data.
 *
 * Usage: - Widening and narrowing conversions. - Arithmetic between smaller
 * datatypes.
 *
 * Expected Output: Widening int->double: 2001.0 Narrowing double->int: 99 Char
 * to Unicode int: 65 byte + byte result promoted to int: 130
 */
public class SDET077_OperatorTypePromotionDemo2 {
	public static void main(String[] args) {
		int orderId = 2001;
		double widened = orderId;
		System.out.println("Widening int->double: " + widened);

		double discount = 99.99;
		int narrowed = (int) discount;
		System.out.println("Narrowing double->int: " + narrowed);

		char grade = 'A';
		int gradeCode = grade;
		System.out.println("Char to Unicode int: " + gradeCode);

		byte x = 100, y = 30;
		int sum = x + y;
		System.out.println("byte + byte result promoted to int: " + sum);
	}
}
