package operators;

/**
 * =========================
 * Program: OperatorPrecedenceDemo
 * Domain: General / QA Validation
 * =========================
 * Description:
 *   Demonstrates execution sequence of different operators 
 *   and how precedence impacts the result.
 *
 * Purpose:
 *   - To highlight operator precedence in expressions.
 *   - Critical for QA engineers validating complex calculation rules.
 *
 * Usage:
 *   - Use brackets, multiplicative, additive, relational, logical, ternary.
 *
 * Expected Output:
 *   Expression Result: 25
 *   Is Greater Than 20? true
 *   Final Decision: PASS
 */
public class SDET058_OperatorPrecedenceDemo {
    public static void main(String[] args) {
        int a = 5, b = 10, c = 20;

        // Precedence: Brackets > Multiplicative > Additive
        int result = (a + b) * 2 + c / 4;
        System.out.println("Expression Result: " + result);
        
        System.out.println((9 * 3 / 9 + 1) * 3);
        // 9 * 3 - 27
        // 27/9 -> 3
        // 3+1 -> 4
        // 4 * 3 -> 12
        
        // Relational operator
        boolean greater = result > 20;
        System.out.println("Is Greater Than 20? " + greater);

        // Ternary decision
        String decision = greater ? "PASS" : "FAIL";
        System.out.println("Final Decision: " + decision);
    }
}
