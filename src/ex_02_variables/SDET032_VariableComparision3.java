package ex_02_variables;

/*
============================================================================
Program: Static Method Access Demo
Domain Context: Core Java Interview / QA Scenario

Description:
Demonstrates how a static method can only directly access static variables,
not instance variables. If we need to access instance variables, we must
create an object inside the static method.

Steps:
1. Create an instance variable 'a' and a static variable 'b'.
2. Write a static method 'display()'.
3. Inside display():
   - Try to access instance variable 'a' (not allowed directly).
   - Access static variable 'b' (allowed).
   - Create an object to access instance variable 'a'.
4. Call display() from main().
============================================================================
*/

class SDET032_VariableComparision3 {

   // Step 1: Variables
   int a = 5;                // Instance variable
   static int b = 10;        // Static variable

   // Step 2: Static method
   static void display() {
       // Not allowed: System.out.println(a); // Compile error

       // Step 3a: Access static variable directly
       System.out.println("Accessing static variable inside display(): " + b);

       // Step 3b: To access instance variable, create object
       SDET032_VariableComparision3 obj = new SDET032_VariableComparision3();
       System.out.println("Accessing instance variable inside display(): " + obj.a);
   }

   public static void main(String[] args) {
       // Step 4: Call static method
       display();
   }
}

