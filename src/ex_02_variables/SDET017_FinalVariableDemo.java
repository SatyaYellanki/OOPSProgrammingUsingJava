package ex_02_variables;

/*
Description: Demonstrates final variable immutability.

Steps:
1. Declare a final variable.
2. Try to reassign (compile-time error if attempted).

Note: Value cannot be reassigned once initialized.
*/

public class SDET017_FinalVariableDemo {

	final int MAX_USERS = 100;

	public static void main(String[] args) {
		SDET017_FinalVariableDemo obj = new SDET017_FinalVariableDemo();
		System.out.println("Maximum allowed users: " + obj.MAX_USERS);

		// obj.MAX_USERS = 200; //Compile time error : Cannot assign a value to final variable

	}
}
