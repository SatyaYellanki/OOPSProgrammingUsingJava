package operators;

/**
 * =========================
 * Program: TestExecutionCountersDemo
 * Domain: QA / Test Execution
 * =========================
 * Description:
 *   Demonstrates increment, assignment, relational operators 
 *   to track executed test cases.
 *
 * Purpose:
 *   - To simulate test execution counters.
 *   - Useful for QA engineers validating test management dashboards.
 *
 * Usage:
 *   - Increment counter for each executed test.
 *   - Check completion percentage.
 *
 * Expected Output:
 *   Total Tests: 5
 *   Executed: 5
 *   All Tests Executed? true
 */
public class SDET072_TestExecutionCountersDemo {
    public static void main(String[] args) {
        int totalTests = 5;
        int executed = 0;

        // Increment execution counter
        for (int i = 0; i < totalTests; i++) {
            executed++;
        }

        System.out.println("Total Tests: " + totalTests);
        System.out.println("Executed: " + executed);

        boolean allExecuted = executed == totalTests;
        System.out.println("All Tests Executed? " + allExecuted);
    }
}
