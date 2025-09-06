package ex_04_operators;

/**
 * =========================
 * Program: DiscountCalculationDemo
 * Domain: E-Commerce
 * =========================
 * Description:
 *   Demonstrates multiplicative, assignment, ternary operators in discount logic.
 *
 * Purpose:
 *   - To simulate discount application in online shopping carts.
 *   - QA relevance: validation of price calculation rules.
 *
 * Usage:
 *   - Apply percentage discount.
 *   - Use ternary to apply extra festive discount.
 *
 * Expected Output:
 *   Original Price: 2000
 *   After 10% Discount: 1800
 *   Final Price with Festive Offer: 1700
 */
public class SDET069_DiscountCalculationDemo {
    public static void main(String[] args) {
        int originalPrice = 2000;

        // Apply 10% discount
        int discountedPrice = originalPrice - (originalPrice * 10 / 100);
        System.out.println("After 10% Discount: " + discountedPrice);

        // Festive extra discount
        boolean festiveOffer = true;
        discountedPrice -= (festiveOffer ? 100 : 0);

        System.out.println("Final Price with Festive Offer: " + discountedPrice);
    }
}

