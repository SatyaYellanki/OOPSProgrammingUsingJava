package ex_02_variables;

//Java Program: Difference Between Instance and Static Variables
//Demonstrates how instance and static variables behave differently

class SDET033_VariableComparision4 {
 // Instance variable: each object has its own copy
 int a = 10;

 // Static variable: shared across all objects
 static int b = 20;

 public static void main(String[] args) {
     // Step 1: Create an object of the class
	 SDET033_VariableComparision4 t = new SDET033_VariableComparision4();

     // Step 2: Print instance and static variable values
     System.out.println("Instance variable a: " + t.a);  // 10
     System.out.println("Static variable b: " + t.b);    // 20
 }
}

