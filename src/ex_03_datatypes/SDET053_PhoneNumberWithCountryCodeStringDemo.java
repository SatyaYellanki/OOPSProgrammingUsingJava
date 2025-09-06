package ex_03_datatypes;

/*
 ============================================================================
 Program: Phone Number With Country Code String Demo
 Domain Context: Telecom

 Description:
 Demonstrates usage of String to store phone numbers with country code.
 +91 or +1 cannot be stored in numeric types (needs String).

 Steps:
 1. Declare phone number as String with country code.
 2. Print phone number.
 ============================================================================
*/

public class SDET053_PhoneNumberWithCountryCodeStringDemo {
    public static void main(String[] args) {
        String phoneWithCode = "+91-9876543210";
        System.out.println("Customer Phone Number (with country code): " + phoneWithCode);
    }
}

/*
 Expected Output:
 Customer Phone Number (with country code): +91-9876543210
*/
