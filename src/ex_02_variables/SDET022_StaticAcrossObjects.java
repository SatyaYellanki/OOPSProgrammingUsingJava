package ex_02_variables;

//Java Program: Static variable behaviour with multiple objects
//Demonstrates that static variable is shared across all objects

public class SDET022_StaticAcrossObjects {
	// Step 1: Declare static variable
	static int x = 100;

	// Step 2: Constructor increments static variable

	public SDET022_StaticAcrossObjects() {
		x++; // increments static variable each time object is created
	}

	// Step 3: Main method
	public static void main(String[] args) {

		// create two objects
		new SDET022_StaticAcrossObjects();
		new SDET022_StaticAcrossObjects();

		// Step 4: Print final value of static variable
		System.out.println("Final value of x: " + x);
	}

}
