package ex_02_variables;

/*
Description: Demonstrates static variable (shared across all objects).

Steps:
1. Declare static variable.
2. Create multiple objects.
3. Modify value using one object & check others reflect change.

Note:
Static variables belong to the class, shared among all objects.
*/

public class SDET025_StaticVariableDemo {
	static String company = "Infosys"; // Static variable

	public static void main(String[] args) {
		SDET025_StaticVariableDemo e1 = new SDET025_StaticVariableDemo();
		SDET025_StaticVariableDemo e2 = new SDET025_StaticVariableDemo();

		System.out.println("Employee 1 company: " + e1.company);
		System.out.println("Employee 2 company: " + e2.company);

		// Change using one object
		e1.company = "TCS";

		System.out.println("After change Employee 1 company: " + e1.company);
		System.out.println("After change Employee 2 company: " + e2.company);

	}

}
