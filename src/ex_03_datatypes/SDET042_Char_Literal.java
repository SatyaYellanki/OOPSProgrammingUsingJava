package ex_03_datatypes;

public class SDET042_Char_Literal {
	public static void main(String[] args) {
        char c1 = 'A'; // A to Z, a-z, !@#$%^&*()_+
        char c2 = 'B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        
        
        char c8 = '\n'; // New line / Next Line
        char c9 = '\t'; // Add Tab
        char c10 = '\b'; // Backlash, delete 1 char
        char c11 = '\r'; // Backlash, delete 1 char
        System.out.println("Satya" + c11 + "Yellanki");
        System.out.println("Satya\tYellanki");
        System.out.println("Saty\"a"); //Saty"a
        System.out.println("Saty\'a"); //Saty'a
        
     // Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("SatyaYellanki");
        System.out.println("Satya"+new_line+"Yellanki");
        System.out.println("Satya"+tab_line+"Yellanki");
        System.out.println("Satya"+back_space+"Yellanki");
        System.out.println("Satya is old"+carriage_return+"Yellanki");

        System.out.println("Hi, This is a First line"+new_line+"This is second line\n This is Third line");
        
       

        char c13 = 'A';
        //  // ASCII, (limited numbers) - A -> 65

        char c14  = '\u1F60';
        System.out.println(c14);
        char my_laugh_smily = '\u1f60'; // :)
        System.out.println(my_laugh_smily);
        
        char c = 'A';
        System.out.println(c);

        char c15 = '$';
        System.out.println(c15);

        char c16 = '\n';
        System.out.println(c16);

        char c17 = '\u1F6A';
        System.out.println(c17);
        // :), :(, :D .;) -> unicode chars


        
    }
}
