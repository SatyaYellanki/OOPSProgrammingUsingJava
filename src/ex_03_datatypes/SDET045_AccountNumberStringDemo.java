package ex_03_datatypes;

/*
 ============================================================================
 Program: Account Number String Demo
 Domain Context: Banking

 Description:
 Demonstrates usage of String for storing account numbers.
 Using int/long removes leading zeros, so String is the correct choice.

 Steps:
 1. Declare an account number with leading zeros.
 2. Store it in String.
 3. Print account number to verify leading zeros are preserved.
 ============================================================================
*/

public class SDET045_AccountNumberStringDemo {
    public static void main(String[] args) {
        String accountNumber = "00123456789";   // Leading zeros preserved
        System.out.println("Customer Account Number: " + accountNumber);
    }
}

/*
 Expected Output:
 Customer Account Number: 00123456789
*/
