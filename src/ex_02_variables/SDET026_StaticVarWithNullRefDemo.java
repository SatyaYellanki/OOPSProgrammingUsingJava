package ex_02_variables;

/*
============================================================================
Program: Static Variable Access with Null Reference
Domain Context: Core Java Interview / QA Scenario

Description:
Demonstrates that a static variable can be accessed using a null object
reference because static members belong to the class, not the instance.

Steps:
1. Create a class with a static variable.
2. Create a null reference of that class.
3. Try accessing the static variable via the null reference.
4. Observe that it works, but note why it's not a good practice.
============================================================================
*/

class Bank {
    // Step 1: Define a static variable (shared across all objects)
    static String bankName = "Global Bank";
}

public class SDET026_StaticVarWithNullRefDemo {

    public static void main(String[] args) {
        // Step 2: Create a null reference
        Bank ref = null;

        // Step 3: Access static variable using null reference
        System.out.println("Access via class: " + Bank.bankName);
        System.out.println("Access via null reference: " + ref.bankName);  // Works!

        // Step 4: Best practice note
        System.out.println("\nNote: Although it works, always prefer 'Bank.bankName' " +
                "instead of using a null reference. It improves readability.");
    }
}
