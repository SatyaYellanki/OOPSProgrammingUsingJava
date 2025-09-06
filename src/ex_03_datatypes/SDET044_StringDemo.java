
package ex_03_datatypes;

/**
 * Class body → only declarations (no free statements).
 * Methods / constructors / static blocks → actual executable statements.
 */
public class SDET044_StringDemo {
	String name = null;
	String name2 = "Satya";
	
	//name= "satya"; not allowed inside the class body [outside the method/constructor]
	//System.out.println("Hello"); not allowed inside the class body [outside the method/constructor]
	
	
	public static void main(String[] args) {
        String employeename = null;       // ✅ allowed
        employeename = "satya";           // ✅ allowed
        System.out.println(employeename); // ✅ allowed
}
}
