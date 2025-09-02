package ex_02_variables;

//Java Program: Call by Value with Primitive Variable

/**
 * Java passes all arguments by value.
 * When a primitive variable is passed to a method, only a copy is passed, 
 * so changes inside the method do not affect the original variable.
 */

class SDET014_CallByValueVariableDemo {
 int a = 10;   // Instance variable initialized with 10

 // Method that modifies its local parameter only
 void change(int a) {
     a = a + 5;  // This changes only the local copy
 }

 public static void main(String[] args) {
     // Step 1: Create object
	 SDET014_CallByValueVariableDemo t = new SDET014_CallByValueVariableDemo();

     // Step 2: Call change() with obj.a
     t.change(t.a);

     // Step 3: Print obj.a (unchanged)
     System.out.println("Value of a after change(): " + t.a);
 }
}

