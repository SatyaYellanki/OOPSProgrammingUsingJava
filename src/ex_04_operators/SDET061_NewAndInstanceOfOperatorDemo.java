package operators;

/**
 * This class demonstrates the core functionality of the 'new' and 'instanceof'
 * operators. It highlights object creation, memory allocation, and runtime type
 * checking in Java.
 */

public class SDET061_NewAndInstanceOfOperatorDemo {
	/**
	 * The main method serves as the entry point for the Java application. It
	 * creates a String object and performs instanceof checks.
	 *
	 * @param args Command-line arguments (not used in this example)
	 * 	QA Usage :Validate type of objects in test frameworks
	 */
	public static void main(String[] args) {

		// 1. Using the 'new' operator for explicit object creation.
		// - Allocates memory on the Heap for a new String object.
		// - The constructor String(String original) is called, initializing the object
		// with "Satya".
		// - The reference to this new object is stored in the variable 's1'.
		String s1 = new String("Satya");

		// 2. Using the 'instanceof' operator for type checking.
		// - Checks if the object referred to by 's1' is an instance of the String
		// class.
		// - Expected result: true.
		System.out.println("Is s1 an instance of String? " + (s1 instanceof String));

		// 3. Checking against the root of the class hierarchy.
		// - The Object class is the superclass of all other classes in Java.
		// - Since String inherits from Object, this check will also return true.
		System.out.println("Is s1 also an instance of Object? " + (s1 instanceof Object));

		// 4. Attempting to check against an incompatible type.
		// - This line is commented out because it would cause a compile-time error.
		// - The compiler performs an upfront check and recognizes that a String can
		// NEVER be
		// an instance of Integer, as they are on separate branches of the inheritance
		// tree.
		// - Uncommenting this line would prevent the code from compiling.
		// System.out.println("Is s1 an instance of Integer? " + (s1 instanceof
		// Integer));
		
		
		Object response = "Automation Response"; // could be from API

        if (response instanceof String) {
            System.out.println("PASS: Response is String");
        } else {
            System.out.println("FAIL: Unexpected type");
        }
	
	}

}
