package ex_02_variables;

/*
============================================================================
Program: Static vs Instance Variable Demo
Domain Context: Core Java Interview / QA Scenario

Description:
Demonstrates the difference between static and instance variables.
Shows why an instance variable cannot be accessed directly inside 
a static method (like main), and provides correct ways to fix it.

Steps:
1. Declare an instance variable (non-static).
2. Try to access it directly inside main() → leads to compilation error.
3. Correct the program by:
   a) Creating an object to access the instance variable.
   b) Alternatively, making the variable static (if required).
============================================================================
*/

class SDET031_VariableComparision2 {

   // Step 1: Instance variable (belongs to object, not class)
   int a = 5;

   public static void main(String[] args) {
       // ❌ Direct access not allowed: System.out.println(a);

       // Step 2a: Correct way → Create object to access instance variable
	   SDET031_VariableComparision2 obj = new SDET031_VariableComparision2();
       System.out.println("Accessing instance variable via object: " + obj.a);

       // Step 2b: If variable was static, we could access directly
       System.out.println("Accessing static variable: " + StaticHelper.b);
   }
}

//Helper class for static example
class StaticHelper {
   // Static variable (belongs to class, shared across all objects)
   static int b = 10;
}
