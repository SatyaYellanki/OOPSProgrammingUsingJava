package operators;

public class SDET057_ConcatenationDemo {

	public static void main(String[] args) {
        // concatination
        System.out.println("Satya" + "Yellanki");
//    System.out.println("Satya" / "Yellanki");
//        System.out.println("Satya" * "Yellanki");
//        System.out.println("Satya" - "Yellanki");

        int a = 10;
        int b = 20;
        System.out.println(a + b);

        // + -> behave differently with the data type.
        // + -> operator overloading
        
        
        
        String first_name = "Satya";
        String last_name = "Yellanki";

        int c = 10;
        int d = 10;

      System.out.println(first_name + last_name + a + b);
      System.out.println(a + b + first_name + last_name);

        System.out.println(first_name + last_name + (a + b));
        
        // BODMAS - Bracket of Div, mul, add, sub
        
        char a1 = 'A'; // ASCII - 65
        char b1 = 'B'; // 66
        System.out.println(a1+b1);
        
        short s = 10;
        char c1 = 'A';
        String s1 = "A";
        System.out.println(c1+s);
        System.out.println(c1);
        System.out.println(c1+c1);
        System.out.println(c1+s1);

	}
}
