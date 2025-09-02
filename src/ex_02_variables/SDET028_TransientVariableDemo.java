package ex_02_variables;

import java.io.*;

/*
Description: Demonstrates transient variable (not serialized).

Steps:
1. Create Serializable class with normal & transient variable.
2. Serialize & Deserialize object.
3. Observe transient variable becomes default value (null/0).

Note:
Skips variable during serialization.
*/

class User implements Serializable{
	 int id;
	    transient String password; // will not be serialized

	    User(int id, String password) {
	        this.id = id;
	        this.password = password;	
}

public class SDET028_TransientVariableDemo {
	public static void main(String[] args) throws Exception {
        User u = new User(101, "secret123");

        // Serialize
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.txt"));
        oos.writeObject(u);
        oos.close();

        // Deserialize
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user.txt"));
        User newUser = (User) ois.readObject();
        ois.close();

        System.out.println("User ID: " + newUser.id);
        System.out.println("Password after deserialization: " + newUser.password); // will be null
    }
}

}
