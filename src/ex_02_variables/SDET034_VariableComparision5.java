package ex_02_variables;

//Java Program: Accessing Static vs Instance Variables in main()

class SDET034_VariableComparision5 {
 // Static variable (belongs to class, default 0)
 static int x;

 // Instance variable (belongs to object, default 0)
 int y;

 public static void main(String[] args) {
     // Step 1: Print static variable directly (works fine)
     System.out.println("Static variable x: " + x);

     // Step 2: Try to access instance variable directly
     // System.out.println(y); // Compile-time Error: non-static variable y cannot be referenced from a static context

     // Step 3: Correct way → create an object
     SDET034_VariableComparision5 obj = new SDET034_VariableComparision5();
     System.out.println("Instance variable y: " + obj.y);
 }
}

