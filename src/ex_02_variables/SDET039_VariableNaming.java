
package ex_02_variables;

/**
 * This program demonstrates Java identifier rules.
 * 
 * <p>Identifiers are names used for variables, methods, classes, etc.
 * They must follow certain rules:
 * <ul>
 *   <li>They cannot be a Java keyword (e.g., <code>enum</code>).</li>
 *   <li>They cannot contain spaces.</li>
 *   <li>They can start with a letter, underscore (<code>_</code>), or dollar sign (<code>$</code>).</li>
 *   <li>They can contain digits, but not as the first character.</li>
 *   <li>Underscore (<code>_</code>) and dollar sign (<code>$</code>) are technically allowed, 
 *       but using them in variable names is discouraged by convention.</li>
 * </ul>
 */

public class SDET039_VariableNaming {
	  /**
     * The main method runs the identifier examples.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // int enum = 10;  // ❌ 'enum' is a keyword, cannot be used as an identifier
    	int Enum = 9;
        System.out.println(Enum);

        int a_b = 89;          // valid identifier using underscore
        // int satya yellanki = 89; //  space not allowed in identifiers
        int satya$yellanki = 90; // valid, but discouraged ($ symbol)
        int Sdet039 = 123;      //  valid, digits allowed if not at the start

        System.out.println(a_b);
        System.out.println(satya$yellanki);
        System.out.println(Sdet039);
    }

}
