package ex_02_variables;

/*
 * Description: Demonstrates local variable usage inside a method 
 * Steps:
 * 1. Declare a local variable inside a method 
 * 2. Try to use it outside the scope(will throw error if attempted).
 * 
 * 
 * Note:variables declared inside methods, constructor, or blocks are called
 * local variables. Scope limited to that block.
 * 
 */

public class SDET021_LocalVariablesDemo {

	public void show() {
		int count = 10; // local variable
		System.out.println("Local count = " + count);
	}

	public void print() {
		// System.out.println(count); // Error: could not visible here
	}

	public static void main(String[] args) {
		SDET021_LocalVariablesDemo obj = new SDET021_LocalVariablesDemo();
		obj.show();
 
		// System.out.println(count); // Error : could not visible here

	}

}
