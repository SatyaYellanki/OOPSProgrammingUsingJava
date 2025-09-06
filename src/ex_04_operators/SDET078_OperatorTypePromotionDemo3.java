package ex_04_operators;


/**
 * =========================
 * Program: TransactionDataTypeCompatibility
 * Domain: Common (E-Commerce, Banking, Telecom)
 * =========================
 * Description:
 *   Demonstrates datatype conversions (widening, narrowing, char→int, type promotion) 
 *   during transaction operations.
 *
 * Purpose:
 *   - To highlight implicit and explicit datatype conversions.
 *   - Common in QA when verifying system handling of numeric operations.
 *
 * Usage:
 *   - Widening: int → double.
 *   - Narrowing: double → int.
 *   - char → int Unicode value.
 *   - Type promotion in arithmetic.
 *
 * Expected Output:
 *   Widening int->double (Txn ID): 10234.0
 *   Narrowing double->int (Txn Amt): 4599
 *   Currency symbol to int Unicode: 8377
 *   byte + byte promoted to int: 128
 */
public class SDET078_OperatorTypePromotionDemo3 {
    public static void main(String[] args) {
        int txnId = 10234;
        double widened = txnId; // widening
        System.out.println("Widening int->double (Txn ID): " + widened);

        double txnAmount = 4599.75;
        int narrowed = (int) txnAmount; // narrowing
        System.out.println("Narrowing double->int (Txn Amt): " + narrowed);

        char currency = '₹'; 
        int code = currency; 
        System.out.println("Currency symbol to int Unicode: " + code);

        byte b1 = 100, b2 = 28;
        int total = b1 + b2; // promoted to int
        System.out.println("byte + byte promoted to int: " + total);
    }
}
