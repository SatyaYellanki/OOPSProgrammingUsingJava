package ex_02_variables;

/**
 Java Program to Demonstrate Error When Declaring Local Variable as Static    
                                                                                                                                                                                                                             |
 Description:
 In Java, local variables cannot be declared `static
 because they belong to the method’s stack frame, which is created and destroyed per method call.
 A `static` variable belongs to the class and has a lifetime equal to the program
 Mixing these two scopes causes conflict, so Java forbids it. |
*/

//Java Program: Declaring a Local Variable as Static

class SDET020_LocalStaticVariableDemo {
 public static void main(String[] args) {
     //static int x = 10;  // Compile-time error: illegal modifier for parameter x
    // System.out.println(x);
 }
}

