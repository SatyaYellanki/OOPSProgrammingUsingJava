package ex_03_datatypes;

/*
 ============================================================================
 Program: Data Types and Their Default Values in Java
 Domain Context: Core Java (QA/Interview)

 Description:
 - This program demonstrates all Java primitive data types and String.
 - Shows the default values assigned by JVM when variables are declared
   at the class (instance/static) level but not initialized.
 - Important QA note: Local variables do NOT have default values and
   must be initialized before use.

 Steps:
 1. Declare instance variables of all data types without initialization.
 2. Print them to see the JVM-assigned default values.
 3. Show that local variables don't have default values.
 ============================================================================
*/

public class SDET046_DataTypesDefaultValuesDemo {

    // Instance variables (default values assigned by JVM)
    byte byteVar;           // default = 0
    short shortVar;         // default = 0
    int intVar;             // default = 0
    long longVar;           // default = 0
    float floatVar;         // default = 0.0
    double doubleVar;       // default = 0.0
    char charVar;           // default = '\u0000' (empty)
    boolean boolVar;        // default = false
    String strVar;          // default = null (non-primitive type)

    // Static variable
    static int staticIntVar;  // default = 0

    public static void main(String[] args) {
        // Create object to access instance variables
        SDET046_DataTypesDefaultValuesDemo obj = new SDET046_DataTypesDefaultValuesDemo();

        System.out.println("===== Data Types and Their Default Values =====");
        System.out.println("byteVar    : " + obj.byteVar);
        System.out.println("shortVar   : " + obj.shortVar);
        System.out.println("intVar     : " + obj.intVar);
        System.out.println("longVar    : " + obj.longVar);
        System.out.println("floatVar   : " + obj.floatVar);
        System.out.println("doubleVar  : " + obj.doubleVar);
        System.out.println("charVar    : '" + obj.charVar + "'");
        System.out.println("boolVar    : " + obj.boolVar);
        System.out.println("strVar     : " + obj.strVar);
        System.out.println("staticIntVar (static): " + staticIntVar);

        // Local variable - must be initialized before use
        int localVar;
        // System.out.println(localVar); // ❌ Compiler error if uncommented

        System.out.println("\nNote: Local variables must be explicitly initialized before use.");
    }
}

/*
 ============================================================================
 ✅ Expected Output:
 ===== Data Types and Their Default Values =====
 byteVar    : 0
 shortVar   : 0
 intVar     : 0
 longVar    : 0
 floatVar   : 0.0
 doubleVar  : 0.0
 charVar    : ''   (empty character)
 boolVar    : false
 strVar     : null
 staticIntVar (static): 0

 Note: Local variables must be explicitly initialized before use.
 ============================================================================
*/
