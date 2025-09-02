package ex_02_variables;

/*
 ============================================================================
 Program: Volatile Variable Demo
 Domain Context: Core Java (Threads)

 Description:
 Demonstrates usage of volatile variable.
 Ensures updated value is visible across threads.

 Steps:
 1. Create a volatile boolean flag.
 2. Start a thread that changes the flag.
 3. Main thread observes updated flag.
 ============================================================================
*/

public class SDET036_VolatileVariableDemo {
    volatile boolean flag = false;

    public static void main(String[] args) throws InterruptedException {
    	SDET036_VolatileVariableDemo obj = new SDET036_VolatileVariableDemo();

        // Thread to update flag
        new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
            obj.flag = true;
            System.out.println("Flag updated to true by thread.");
        }).start();

        // Main thread waits until flag is true
        while (!obj.flag) {
            // Busy wait
        }
        System.out.println("Main thread detected flag as true.");
    }
}

/*
 Expected Output:
 Flag updated to true by thread.
 Main thread detected flag as true.
*/
