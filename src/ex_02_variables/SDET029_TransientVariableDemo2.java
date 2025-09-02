package ex_02_variables;
/*
 ============================================================================
 Program: Transient Variable Demo
 Domain Context: Serialization in Banking Domain

 Description:
 In Java, variables declared with the `transient` keyword 
 are not serialized. For example, if we save customer details 
 but don't want to store their password, we use `transient`.

 Steps:
 1. Create a Customer class implementing Serializable.
 2. Mark the 'password' field as transient.
 3. Serialize the object to a file.
 4. Deserialize it back and observe that password is not restored.
 ============================================================================
*/

import java.io.*;

// Step 1: Define a Customer class
class Customer implements Serializable {
    private static final long serialVersionUID = 1L;  // for serialization

    String customerName;
    transient String password;  // Step 2: transient variable

    public Customer(String customerName, String password) {
        this.customerName = customerName;
        this.password = password;
    }
}

public class SDET029_TransientVariableDemo2 {

    public static void main(String[] args) {
        String filename = "customer.ser";

        // Step 3: Serialize object
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            Customer cust = new Customer("Rahul Sharma", "mySecret@123");
            out.writeObject(cust);
            System.out.println("✅ Serialization done.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Step 4: Deserialize object
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            Customer cust = (Customer) in.readObject();
            System.out.println("Customer Name: " + cust.customerName);
            System.out.println("Password (transient): " + cust.password); // will be null
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}