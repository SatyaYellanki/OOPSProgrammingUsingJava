package ex_03_datatypes;

/*
 ============================================================================
 Program: Salary Float Demo
 Domain Context: Banking/Payroll

 Description:
 Demonstrates usage of float for salary representation.
 Float is used when decimals are required but not extreme precision.

 Steps:
 1. Declare a salary variable as float.
 2. Print the salary with decimals.
 ============================================================================
*/

public class SDET049_SalaryFloatDemo {
    public static void main(String[] args) {
        float monthlySalary = 25345.75f; // f is mandatory for float
        System.out.println("Employee Monthly Salary: " + monthlySalary);
    }
}

/*
 Expected Output:
 Employee Monthly Salary: 25345.75
*/
