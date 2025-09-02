package ex_02_variables;

//Java Program Showing Final Variable Initialization Inside Conditional Block

/**
 * A final variable must be assigned exactly once before use.
 * It can be initialized in a conditional block,
 *  but the compiler checks that all possible execution paths definitely assign it.
 */
class SDET015_FinalConditionalInitDemo {
    public static void main(String[] args) {
        final int x;  // Step 1: Declared but not initialized

        if (true) {   // Step 2: Always executes
            x = 5;
        }

        // Step 3: x is initialized → safe to use
        System.out.println("Final variable x: " + x);
    }
}

