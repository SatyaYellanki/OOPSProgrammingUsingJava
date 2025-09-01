package ex_01_introductiontojava;

/**
 * Program Name: MainMethodOverloadingDemo
 * 
 * Description: This program demonstrates how the "main" method in Java can be
 * overloaded. - The JVM always looks for the signature: public static void
 * main(String[] args) as the entry point of the program. - Additional
 * overloaded "main" methods can be defined with different parameter lists, but
 * they will not be executed automatically unless explicitly called.
 * 
 * Steps: 1. Define a public class `MainMethodOverloadingDemo`. 2. Implement the
 * standard main method (String[] args) which is the JVM entry point. 3.
 * Overload the main method with no parameters. 4. From the standard main, call
 * the overloaded main to demonstrate execution. 5. Print outputs to verify
 * which methods are executed.
 * 
 * QA Note: This example is often asked in interviews to test knowledge about
 * JVM entry point, method overloading, and execution flow.
 */

public class SDET003_OverloadedMainDemo {

	// Standard main method - JVM calls this as the entry point
	public static void main(String[] args) {
		System.out.println("Execution started from: main(String[] args)");

		// Explicitly calling overloaded main()
		main();

		// Calling another overloaded version
		main(101);
	}

	// Overloaded main method (no arguments)
	public static void main() {
		System.out.println("Overloaded main() without parameters");
	}

	// Overloaded main method (integer argument)
	public static void main(int number) {
		System.out.println("Overloaded main(int) with value: " + number);
	}
}
