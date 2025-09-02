package ex_02_variables;

/*
Description: Demonstrates difference between instance and static variables.

Steps:
1. Declare both static and instance variables.
2. Create multiple objects.
3. Observe behavior of static (shared) vs instance (unique).

Note:
Key difference between memory sharing & object-specific data.
*/

class Employee {
	int empId; // instance variable
	static String company; // static variable

	public Employee(int id, String comp) {
		this.empId = id;
		this.company = comp;
	}

	void display() {
		System.out.println("Employee Id: " + empId + ", Company: " + company);
	}
}

public class SDET030_VariableComparision {

	public static void main(String[] args) {

		Employee e1 = new Employee(101, "Infosys");
		//e1.display();			// Displays Infosys
		Employee e2 = new Employee(202, "TCS");

		e1.display();			//Displays TCS
		e2.display();			//Dsiplays TCS
	}

}
