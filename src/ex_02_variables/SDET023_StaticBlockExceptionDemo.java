package ex_02_variables;

/**
 * Java Program: Division by Zero in Static block Demonstrates
 * ArithmeticException during class loading
 */

public class SDET023_StaticBlockExceptionDemo {

	// Step 1: Declare static variable
	static int x;

	// Step 2: Initialize inside static block
	static {
		// This line causes ArithmeticException: / by zero
		x = 10 / 0;
	}

	// Step 3: Main method( won't execute due to exception in static block)
	public static void main(String[] args) {
		// This won't run because exception occurs earlier
		System.out.println(x);
		
		//this works if the static block is something like 10/2 then main() 
		//will get executed and x value will get printed
	}

}
