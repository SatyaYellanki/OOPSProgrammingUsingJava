package operators;

/**
 * =========================
 * Program: CartPriceCalculation
 * Domain: E-Commerce
 * =========================
 * Description:
 *   Demonstrates arithmetic, assignment, and ternary operators in an E-Commerce 
 *   scenario where a customer adds items to the cart, applies a discount coupon, 
 *   and checks delivery charges.
 *
 * Purpose:
 *   - To showcase operator precedence in cart price calculation.
 *   - Common in QA testing for validating business logic in e-commerce applications.
 *
 * Usage:
 *   - Calculate cart total (unit price × quantity).
 *   - Apply discount.
 *   - Add delivery charges if applicable.
 *
 * Expected Output:
 *   Cart Total before discount: 1499.97
 *   After 10% Coupon Discount: 1349.973
 *   Final Payable Amount: 1399.973
 */
public class SDET068_CartPriceCalculation {
    public static void main(String[] args) {
        double unitPrice = 499.99;
        int quantity = 3;
        double cartTotal = unitPrice * quantity; // Arithmetic (multiplication)

        System.out.println("Cart Total before discount: " + cartTotal);

        // Apply flat 10% discount using compound assignment
        cartTotal -= cartTotal * 0.10; 
        System.out.println("After 10% Coupon Discount: " + cartTotal);

        // Delivery charge condition using ternary
        cartTotal += (cartTotal < 1000) ? 50 : 0; 
        System.out.println("Final Payable Amount: " + cartTotal);
    }
}
