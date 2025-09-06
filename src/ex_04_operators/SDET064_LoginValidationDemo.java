package ex_04_operators;


/**
 * =========================
 * Program: LoginValidationDemo
 * Domain: Authentication / Login QA
 * =========================
 * Description:
 *   Demonstrates logical and relational operators in validating login credentials.
 *
 * Purpose:
 *   - To simulate login checks QA engineers test in authentication modules.
 *
 * Usage:
 *   - Compare user input with stored credentials.
 *   - Apply logical AND for username/password match.
 *
 * Expected Output:
 *   Username Match: true
 *   Password Match: true
 *   Login Successful: true
 */
public class SDET064_LoginValidationDemo {
    public static void main(String[] args) {
        String storedUsername = "qa_user";
        String storedPassword = "Test@123";

        String inputUsername = "qa_user";
        String inputPassword = "Test@123";

        boolean userMatch = storedUsername.equals(inputUsername);
        boolean passMatch = storedPassword.equals(inputPassword);

        System.out.println("Username Match: " + userMatch);
        System.out.println("Password Match: " + passMatch);

        boolean loginSuccess = userMatch && passMatch;
        System.out.println("Login Successful: " + loginSuccess);
    }
}

