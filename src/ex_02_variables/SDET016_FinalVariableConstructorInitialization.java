package ex_02_variables;


//Java Program: Final Instance Variable Initialization in Constructor

/**
 * In Java, a final variable can only be assigned once.
 * A final instance variable must either be initialized
 * at the time of declaration or inside the constructor.
 * After assignment, it cannot be changed.
 */

class SDET016_FinalVariableConstructorInitialization {
 // Step 1: Declare final instance variable (not initialized here)
 final int x;

 // Step 2: Initialize final variable inside constructor
 SDET016_FinalVariableConstructorInitialization() {
     x = 100;  // once assigned, cannot be changed again
 }

 public static void main(String[] args) {
     // Step 3: Create object
	 SDET016_FinalVariableConstructorInitialization obj = new SDET016_FinalVariableConstructorInitialization();

     // Step 4: Print value of final variable
     System.out.println("Value of final variable x: " + obj.x);
 }
}
