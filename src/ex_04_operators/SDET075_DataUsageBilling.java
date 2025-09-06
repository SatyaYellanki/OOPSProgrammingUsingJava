package operators;


/**
 * =========================
 * Program: DataUsageBilling
 * Domain: Telecom
 * =========================
 * Description:
 *   Demonstrates arithmetic operators, precedence, and assignment operators
 *   in mobile data billing for customers based on data usage and tax.
 *
 * Purpose:
 *   - To simulate real-world billing system scenarios.
 *   - Useful for QA engineers in validating telecom billing calculations.
 *
 * Usage:
 *   - Calculate base amount = perGB × dataUsed.
 *   - Apply GST tax using precedence and brackets.
 *   - Add late fees using assignment operator.
 *
 * Expected Output:
 *   Base Data Usage Cost: 750.0
 *   Total with GST: 885.0
 *   Final Payable Amount (with Late Fee): 985.0
 */
public class SDET075_DataUsageBilling {
    public static void main(String[] args) {
        double perGBRate = 50.0;
        int dataUsed = 15; // GB

        // Arithmetic with precedence (multiplication before addition)
        double baseAmount = perGBRate * dataUsed; 
        System.out.println("Base Data Usage Cost: " + baseAmount);

        // GST 18% applied → brackets for precedence
        double gstAmount = (baseAmount * 18) / 100;
        double totalBill = baseAmount + gstAmount;
        System.out.println("Total with GST: " + totalBill);

        // Assignment operator to add late fee
        totalBill += 100;
        System.out.println("Final Payable Amount (with Late Fee): " + totalBill);
    }
}
 	