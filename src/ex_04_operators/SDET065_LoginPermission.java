package operators;

public class SDET065_LoginPermission {
	
	public static void main(String[] args) {
		boolean isUserActive = true;
		boolean hasAdminRole = false;
		
		if(isUserActive&&hasAdminRole) {
			System.out.println("Access granted to Admin Dashboard");
		}
		else {
			System.out.println("Access Denied");
		}
	}

}
