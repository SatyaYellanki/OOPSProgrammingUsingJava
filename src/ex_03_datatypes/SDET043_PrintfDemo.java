package ex_03_datatypes;

public class SDET043_PrintfDemo {

public static void main(String[] args) {
	  int age = 98;
	  // %d ->  any integer - byte, short, int or long
	  // %s -> String
	  // %c -> char
	  // %f -> float
	  System.out.printf("Ritesh age is %d",age);
	  
	  int number = 9;
      System.out.printf("Your number is -> %d", number);
      System.out.println();
      System.out.println("Your number is -> " + number);
      // Your number is -> 9

      float pi = 3.14159f;
      System.out.printf("Your value is  %f",pi);
      
      // Non Primitive
      String name = "Satya";
      System.out.println(name);
      System.out.printf("Your name is -> %s",name);
}

}
