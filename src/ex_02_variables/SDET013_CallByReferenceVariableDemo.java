package ex_02_variables;

//Java Program: Call by Reference-like Example in Java

/**
 * Java does not support true call by reference, but when an object variable is passed to a method,
 * the reference copy still points to the same object. 
 * Hence, modifying the object inside the method reflects outside.
 */

class SDET013_CallByReferenceVariableDemo {
 int a = 10;   // Instance variable

 // Method receives an object reference
 void change(SDET013_CallByReferenceVariableDemo obj) {
     obj.a = obj.a + 5;  // modifies the actual object variable
 }

 public static void main(String[] args) {
     // Step 1: Create object
	 SDET013_CallByReferenceVariableDemo t = new SDET013_CallByReferenceVariableDemo();

     // Step 2: Call change() and pass the object
     t.change(t);

     // Step 3: Print updated value
     System.out.println("Value of a after change(): " + t.a);
 }
}
