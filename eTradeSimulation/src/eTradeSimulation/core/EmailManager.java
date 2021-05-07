package eTradeSimulation.core;

import java.util.regex.Pattern;

public class EmailManager {
	

	public static final Pattern emailAdressRegex 
	= Pattern.compile
	("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",Pattern.CASE_INSENSITIVE);

	public static boolean isEmailValid(String email) {
		return emailAdressRegex.matcher(email).matches();
	}
}
