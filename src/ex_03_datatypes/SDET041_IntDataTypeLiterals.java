package ex_03_datatypes;

public class SDET041_IntDataTypeLiterals {

	public static void main(String[] args) {
		// ASCII Table
        // 0-9 48-57
        // A-Z 65-90
        // a-z 97-122
//      // 0-9 48-57

		int age = 65; // 65
		System.out.println(age);

		// Binary Literal
		int binary_num = 0b1010; // Decimal System - 10
		System.out.println(binary_num);
		// Octal base? -> 8
		
		int octal = 0101;
		System.out.println(octal);
		
		// Hexadecimal Literals - 16
		int hex = 0Xface;
		System.out.println(hex);
		// base 16 color combination are in hex - #28a745
	}
}
