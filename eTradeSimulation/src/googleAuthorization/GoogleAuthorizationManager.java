package googleAuthorization;

public class GoogleAuthorizationManager {
	public boolean register(String firstName,String lastName,String email,String password) {
		System.out.println("<Registered By Google Services>");
		return true;
	}
	public boolean login(String email,String password) {
		System.out.println("<Logged in By Google Services>");
		return true;
	}
}
