package operators;


/**
 * =========================
 * Program: SubjectMarksDemo
 * Domain: Education / Student Grading
 * =========================
 * Description:
 *   Demonstrates relational, logical, and ternary operators in grading a student 
 *   based on marks in multiple subjects.
 *
 * Purpose:
 *   - To simulate eligibility logic based on multiple conditions.
 *   - Very useful in QA to validate business logic where multiple checks are combined.
 *
 * Usage:
 *   - Use relational operators to check subject pass criteria.
 *   - Combine them with logical operators.
 *   - Apply ternary operator to decide overall result.
 *
 * Expected Output:
 *   Marks: Math=65, Science=70, English=55
 *   Result: Pass
 *   
 *   QA Usage: Quick decision making in test conditions.
 */
public class SDET067_SubjectMarksDemo {
    public static void main(String[] args) {
        int math = 65, science = 70, english = 55;

        // Relational and logical operators
        boolean passed = (math >= 35) && (science >= 35) && (english >= 35);

        // Ternary operator for final decision
        String result = passed ? "Pass" : "Fail";

        System.out.println("Marks: Math=" + math + ", Science=" + science + ", English=" + english);
        System.out.println("Result: " + result);
    }
}

