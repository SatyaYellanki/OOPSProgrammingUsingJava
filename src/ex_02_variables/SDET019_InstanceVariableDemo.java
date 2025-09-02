package ex_02_variables;

/*
Description: Demonstrates instance variable behavior (different for each object).

Steps:
1. Declare instance variable.
2. Create multiple objects and assign different values.
3. Print to see each object has its own copy.

Note:Instance variables are declared in a class, but outside any method. 
Each object gets its own copy.
*/


public class SDET019_InstanceVariableDemo {
	
	int empID;

	public static void main(String[] args) {
		SDET019_InstanceVariableDemo e1 = new SDET019_InstanceVariableDemo();
		SDET019_InstanceVariableDemo e2 = new SDET019_InstanceVariableDemo();
		
		e1.empID = 101;
		e2.empID = 102;
		
		System.out.println("Employee 1 ID: "+e1.empID);
		System.out.println("Employee 2 ID: "+e2.empID);
		
	}

}
