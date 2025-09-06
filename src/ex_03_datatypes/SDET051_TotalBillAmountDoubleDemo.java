package ex_03_datatypes;

/*
 ============================================================================
 Program: Total Bill Amount Double Demo
 Domain Context: E-commerce

 Description:
 Demonstrates usage of double for bill amount calculation.
 Includes tax in the final bill.

 Steps:
 1. Declare base price as double.
 2. Declare tax percentage as double.
 3. Calculate total price (price + tax).
 4. Print final bill.
 ============================================================================
*/

public class SDET051_TotalBillAmountDoubleDemo {
    public static void main(String[] args) {
        double basePrice = 999.50;
        double tax = 0.18; // 18% GST
        double totalBill = basePrice + (basePrice * tax);

        System.out.println("Final Bill Amount (with Tax): " + totalBill);
    }
}

/*
 Expected Output:
 Final Bill Amount (with Tax): 1179.41
*/

