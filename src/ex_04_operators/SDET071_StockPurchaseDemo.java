package ex_04_operators;

/**
 * =========================
 * Program: StockPurchaseDemo
 * Domain: E-Commerce / Stock Trading
 * =========================
 * Description:
 *   Demonstrates multiplicative, additive, and assignment operators in a stock purchase scenario.
 *   A customer buys multiple units of a stock at a given price, brokerage charges are added, and the
 *   final amount is updated.
 *
 * Purpose:
 *   - To simulate operator execution in stock purchase calculation.
 *   - Useful for QA engineers validating calculation modules in financial apps.
 *
 * Usage:
 *   - Multiply unit price with quantity (Multiplicative).
 *   - Add brokerage fee (Additive).
 *   - Update final cost using assignment (+=).
 *
 * Expected Output:
 *   Stock Purchase Base Cost: 5000.0
 *   After Adding Brokerage: 5050.0
 */
public class SDET071_StockPurchaseDemo {
    public static void main(String[] args) {
        double stockUnitPrice = 100.0;
        int quantity = 50;

        // Multiplicative operator
        double totalCost = stockUnitPrice * quantity; 
        System.out.println("Stock Purchase Base Cost: " + totalCost);

        // Additive + Assignment operator
        totalCost += 50; // adding brokerage
        System.out.println("After Adding Brokerage: " + totalCost);
    }
}
