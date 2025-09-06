package ex_03_datatypes;

/*
 ============================================================================
 Program: Average Marks Double Demo
 Domain Context: Education

 Description:
 Demonstrates usage of double for average calculation.
 double is used to preserve decimal points.

 Steps:
 1. Declare subject marks as int.
 2. Calculate average as double.
 3. Print average.
 ============================================================================
*/

public class SDET050_AverageMarksDoubleDemo {
    public static void main(String[] args) {
        int math = 85, science = 90, english = 80;
        double average = (math + science + english) / 3.0;
        System.out.println("Average Marks: " + average);
    }
}

/*
 Expected Output:
 Average Marks: 85.0
*/
