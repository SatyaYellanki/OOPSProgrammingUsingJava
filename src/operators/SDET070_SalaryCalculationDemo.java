package operators;

/**
 * =========================
 * Program: SalaryCalculationDemo
 * Domain: HR / Payroll
 * =========================
 * Description:
 *   Demonstrates additive, multiplicative, relational, ternary operators 
 *   in salary and tax deduction calculation.
 *
 * Purpose:
 *   - To simulate payroll module testing.
 *   - Useful for QA when verifying net salary calculations.
 *
 * Usage:
 *   - Calculate gross salary.
 *   - Deduct tax based on slabs.
 *   - Decide take-home pay.
 *
 * Expected Output:
 *   Gross Salary: 60000
 *   Tax Deducted: 6000
 *   Net Salary: 54000
 */
public class SDET070_SalaryCalculationDemo {
    public static void main(String[] args) {
        int baseSalary = 50000;
        int bonus = 10000;

        int gross = baseSalary + bonus;
        System.out.println("Gross Salary: " + gross);

        // 10% tax using multiplicative
        int tax = gross * 10 / 100;
        System.out.println("Tax Deducted: " + tax);

        int netSalary = gross - tax;
        System.out.println("Net Salary: " + netSalary);
    }
}
