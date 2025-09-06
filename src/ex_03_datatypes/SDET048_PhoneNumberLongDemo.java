package ex_03_datatypes;

/*
 ============================================================================
 Program: Phone Number Long Demo
 Domain Context: Telecom

 Description:
 Demonstrates usage of long for storing 10-digit phone numbers.
 int cannot hold 10-digit numbers (max ~2.1 billion).

 Steps:
 1. Declare a phone number as long.
 2. Print phone number to verify.
 ============================================================================
*/

public class SDET048_PhoneNumberLongDemo {
    public static void main(String[] args) {
        long phoneNumber = 9876543210L; // L for long
        System.out.println("Customer Phone Number: " + phoneNumber);
    }
}

/*
 Expected Output:
 Customer Phone Number: 9876543210
*/
