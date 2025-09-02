package ex_02_variables;

//Java Program: Java Program to Access Static Variable Directly in main()

/**
 * In Java, static variables belong to the class, not to any object.
 * If you are accessing the static variable from within the same class,
 * you can access it directly by name (without classname).
 * If accessing from another class, you need to use ClassName.variable.
 */

class SDET024_StaticVariableAccessDemo {
 // Static variable (class-level)
 static int x = 100;

 public static void main(String[] args) {
     // Access directly (allowed because we are in the same class)
     System.out.println("Access directly: " + x);

     // Access using classname (recommended style)
     System.out.println("Access via classname: " + SDET024_StaticVariableAccessDemo.x);

     // Access via object (possible, but not recommended)
     SDET024_StaticVariableAccessDemo obj = new SDET024_StaticVariableAccessDemo();
     System.out.println("Access via object (not recommended): " + obj.x);
 }
}

