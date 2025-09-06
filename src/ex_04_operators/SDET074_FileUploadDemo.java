package operators;

/**
 * =========================
 * Program: FileUploadDemo
 * Domain: File Handling / QA Upload Validation
 * =========================
 * Description:
 *   Demonstrates relational, logical, and assignment operators
 *   in simulating a file upload validation.
 *
 * Purpose:
 *   - To show how operators validate file size and type in real applications.
 *
 * Usage:
 *   - Check size limit.
 *   - Validate file extension.
 *   - Assign status message.
 *
 * Expected Output:
 *   File Size Valid: true
 *   File Type Valid: true
 *   Upload Status: SUCCESS
 */
public class SDET074_FileUploadDemo {
    public static void main(String[] args) {
        int fileSizeMB = 8;
        int maxLimitMB = 10;
        String fileType = "jpg";

        boolean sizeValid = fileSizeMB <= maxLimitMB;
        boolean typeValid = fileType.equals("jpg") || fileType.equals("png");

        System.out.println("File Size Valid: " + sizeValid);
        System.out.println("File Type Valid: " + typeValid);

        String uploadStatus = (sizeValid && typeValid) ? "SUCCESS" : "FAILED";
        System.out.println("Upload Status: " + uploadStatus);
    }
}

