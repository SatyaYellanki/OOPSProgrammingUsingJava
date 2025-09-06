package ex_04_operators;


/**
 * =========================
 * Program: OperatorPrecedenceFullDemo
 * Domain: Cross-Domain (E-Commerce, Banking, Telecom)
 * =========================
 * Description:
 *   Demonstrates full operator precedence order with a combined scenario:
 *   - Brackets ()
 *   - Multiplicative (*, /, %)
 *   - Additive (+, -)
 *   - Relational (>, <, ==)
 *   - Logical (&&, ||)
 *   - Ternary (?:)
 *   - Assignment (=, +=, -=)
 *
 * Purpose:
 *   - To show how operator precedence affects the execution sequence.
 *   - Critical for QA testing when validating complex business rules.
 *   Arithmetic → price/discount calculations   
 *   Relational → expected vs actual comparison
 *   Logical → permissions, multiple conditions
 *   Assignment/increment → retries, counters
 *   Ternary → simple validations
 *   Bitwise → feature toggles
 *   Instanceof → object type checks
 *
 * Usage:
 *   - Calculate expression with mixed operators.
 *   - Check precedence ordering with brackets.
 *   - Final decision making with ternary.
 *
 * Expected Output:
 *   Expression Value: 25
 *   Is Value > 20? true
 *   Logical Check: true
 *   Final Result: Success
 */
public class SDET059_OperatorPrecedenceFullDemo {
    public static void main(String[] args) {
        int a = 5, b = 10, c = 20;
        
        // Brackets first, then multiplicative, then additive
        int expressionValue = (a + b) * 2 + c / 4; 
		/*
		 * 15 15*2 20/4 30+5
		 */
         System.out.println("Expression Value: " + expressionValue);

        // Relational operator
        boolean isGreater = expressionValue > 20;
        System.out.println("Is Value > 20? " + isGreater);

        // Logical operator
        boolean logicalCheck = (isGreater && c > b) || (a > b);
        System.out.println("Logical Check: " + logicalCheck);

        // Ternary + Assignment
        String result = logicalCheck ? "Success" : "Failure";
        System.out.println("Final Result: " + result);
    }
}


