package operators;

public class SDET066_RetryMechanism {

	public static void main(String[] args) {
		// 1. Initialize control variables
		int attempts = 0; // Counter to track the number of tries
		boolean success = false; // Flag to indicate if the operation succeeded

		// 2. The Retry Loop Condition:
		// "Keep trying WHILE we have attempts left (less than 3) AND we haven't
		// succeeded yet"
		while (attempts < 3 && !success) {
			attempts++; // 3. Increment the attempt counter at the start of each loop
			System.out.println("Attempt " + attempts + " to call API...");

			// 4. SIMULATION: This is where the actual operation (e.g., API call) would
			// happen.
			// For this demo, we artificially set success to 'true' on the 2nd attempt.
			if (attempts == 2) {
				success = true; // This simulates the API call succeeding on the 2nd try.
			}
		} // 5. End of loop. If 'success' is still false and attempts < 3, it loops again.

		// 6. Final Result Check:
		// Uses a ternary operator to print "PASS" if success is true, otherwise "FAIL"
		System.out.println("Final Result: " + (success ? "PASS" : "FAIL"));
	}

}
