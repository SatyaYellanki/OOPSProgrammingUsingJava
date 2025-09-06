package ex_04_operators;

/**
 * =========================
 * Program: LoanEligibilityCheck
 * Domain: Banking
 * =========================
 * Description:
 *   Demonstrates relational, logical, and ternary operators in determining
 *   loan eligibility based on customer age, income, and credit score.
 *
 * Purpose:
 *   - To validate decision-making using operators in real-time banking.
 *   - Useful in QA automation where business logic validation is key.
 *
 * Usage:
 *   - Compare eligibility conditions.
 *   - Combine conditions using logical operators.
 *   - Use ternary operator to print eligibility result.
 *
 * Expected Output:
 *   Loan Eligibility Result: Eligible for Loan
 */
public class SDET073_LoanEligibilityCheck {
    public static void main(String[] args) {
        int age = 30;
        double monthlyIncome = 60000;
        int creditScore = 750;

        // Relational + Logical operators
        boolean isEligible = (age >= 21 && age <= 60) 
                              && (monthlyIncome >= 25000) 
                              && (creditScore >= 700);

        // Ternary operator for decision making
        String result = isEligible ? "Eligible for Loan" : "Not Eligible for Loan";
        System.out.println("Loan Eligibility Result: " + result);
    }
}
