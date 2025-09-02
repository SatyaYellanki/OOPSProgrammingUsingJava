package ex_02_variables;

//Java Program: Instance vs Local Variable with Shadowing

/**
 * If a local variable has the same name as an instance variable, the local
 * variable shadows the instance variable inside the method. To access the
 * instance variable, we use the this keyword.
 */

class SDET035_VariableShadowDemo {
	// Instance variable
	int x = 5;

	void display() {
		// Local variable shadows instance variable
		int x = 10;

		// Prints local variable
		System.out.println("Local variable x: " + x);

		// Access instance variable using 'this'
		System.out.println("Instance variable x: " + this.x);
	}

	public static void main(String[] args) {
		// Create object
		new SDET035_VariableShadowDemo().display();
		;

	}
}
