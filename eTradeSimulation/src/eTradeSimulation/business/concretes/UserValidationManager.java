package eTradeSimulation.business.concretes;

import java.util.List;

import eTradeSimulation.business.abstracts.IUserValidationService;
import eTradeSimulation.core.EmailManager;
import eTradeSimulation.entites.concretes.User;

public class UserValidationManager implements IUserValidationService {

	@Override
	public boolean validateFirstNameLastName(String firstName,String lastName) {
		if
		(firstName.length()<2||
		 lastName.length()<2) {
			System.out.println("<Validation Error>");
			System.out.println
			("(User First Name & Last Name should contain"+ 
			   " at least two characters!)");
			return false;
		}
		else return true;
	}

	@Override
	public boolean validatePassword(String password) {
		if(password.length()<6) {
			System.out.println("<Validation Error>");
			System.out.println
			("(Password should contain"
			+ " at least six characters!)");
			return false;
		}
		else return true;
	}

	@Override
	public boolean validateEmail(String email) {
	 boolean result = EmailManager.isEmailValid(email);
	 if(result != true) {
		 System.out.println
		 ("(Please write the email in correct order!)");
			System.out.println("<Validation Error>");
		 return false;
	 }
	 else return true;
	}

	@Override
	public boolean validateIsEmailUsedBefore(List<User> users,String email) {
		String tempEmail;
		for(User user : users) {
		tempEmail =	user.getEmail();
			if(tempEmail == email) {
				System.out.println("<Validation Error>");
				System.out.println("(This email is already in use!)");	
				return false;
			}
		}
		return true;
	}

}
