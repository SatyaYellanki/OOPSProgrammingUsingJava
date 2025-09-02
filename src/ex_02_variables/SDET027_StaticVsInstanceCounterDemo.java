package ex_02_variables;
/*
 ============================================================================
 Program: Static vs Instance Variable Demo
 Domain Context: Core Java

 Description:
 Demonstrates difference between static and instance variables.
 Static -> shared by all objects.
 Instance -> unique for each object.

 Steps:
 1. Declare static and instance variable.
 2. Create multiple objects.
 3. Observe variable behavior.
 ============================================================================
*/

public class SDET027_StaticVsInstanceCounterDemo {
    static int staticCounter = 0;  // Shared
    int instanceCounter = 0;       // Unique

    public SDET027_StaticVsInstanceCounterDemo() {
        staticCounter++;
        instanceCounter++;
    }

    public static void main(String[] args) {
    	SDET027_StaticVsInstanceCounterDemo  obj1 = new SDET027_StaticVsInstanceCounterDemo ();
    	SDET027_StaticVsInstanceCounterDemo  obj2 = new SDET027_StaticVsInstanceCounterDemo ();

        System.out.println("Static Counter: " + SDET027_StaticVsInstanceCounterDemo .staticCounter); // 2
        System.out.println("Obj1 Instance Counter: " + obj1.instanceCounter); // 1
        System.out.println("Obj2 Instance Counter: " + obj2.instanceCounter); // 1
    }
}

/*
 Expected Output:
 Static Counter: 2
 Obj1 Instance Counter: 1
 Obj2 Instance Counter: 1
*/
