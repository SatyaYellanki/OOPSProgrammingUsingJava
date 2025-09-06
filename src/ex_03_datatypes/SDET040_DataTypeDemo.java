package ex_03_datatypes;

/**
 * Here are some of the important points about primitive data types:
 * Numeric and boolean (true, false) values are written without quotes. E.g. int score = 85; boolean isQualified = true;
 * The character value must be written in single quotes while assigning it to a character variable. E.g. char gender = 'M';
 * A long value is assigned to the variable, suffixed with L (uppercase letter or lower case letter L can be used). E.g. long salary = 500000L; 
 * A float value must be suffixed with F or f while assigning to the variable. E.g. float average = 78.6f;
 * As of now, note that the default values are not applicable to the variables declared inside a method. 
 * The variables declared inside a method must be initialized with a value before printing their value or performing any operation on them.
 */

public class SDET040_DataTypeDemo {
	int a = 10;
    byte b = 10;
    short s = 10;
    long l = 9876543210L;
    float f = 3.14F;
    double d = 67.8987654567;
    boolean b1 = true;
    char c = 'A';

    int local;
//    System.out.println(local);
    
    // byte ( -128 to 127)

    byte b2 = -128; // Size, Range
//    byte b3 = -200;
    byte b4 = -1;
//    byte b5 = 127;
//    b5 = b5+1;

    short s1 = -31567;
    short s2 = -1;
//    short s3 = 33678;



}
