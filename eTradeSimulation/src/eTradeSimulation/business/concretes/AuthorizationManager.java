package eTradeSimulation.business.concretes;

import java.util.List;

import eTradeSimulation.business.abstracts.IUserValidationService;
import eTradeSimulation.core.IAuthorizationService;
import eTradeSimulation.dataAccess.abstracts.IUserDao;
import eTradeSimulation.entites.concretes.User;

public class AuthorizationManager implements IAuthorizationService {
	private IUserDao userDao;
	private IUserValidationService userValidationService;
	
	public AuthorizationManager
	(IUserDao userDao,
	 IUserValidationService userValidationService) {
		this.userDao = userDao;
		this.userValidationService = userValidationService; 
		
	}
	@Override
		public boolean register(String firstName, String lastName, String email, String password) {
			boolean[] validationRules = {
					this.userValidationService.validateFirstNameLastName
					(firstName,lastName),
					this.userValidationService.validatePassword(password),
					this.userValidationService.validateEmail(email),
					this.userValidationService.validateIsEmailUsedBefore(userDao.getAll(), email),
				};
			
			for(boolean b : validationRules) {
				if(b == false) {
					System.out.println("<Registration Unsuccessful>");
					return false;
				}
			}
			return true;
		}

	@Override
	public boolean login(String email, String password) {
		return true;
	}
	public boolean login(List<User> users,String email, String password) {
		for(User user : users) {
			if(user.getEmail() == email && user.getPassword() == password) {
					if(user.getAccountCondition()) {
						System.out.println("<Logged In>");
						return true;
					}
					else {
						System.out.println("<Login Failed>");
						System.out.println("(Account Must Be Verified To Sign In)");
						return false;
					}
			}	
		}
		System.out.println("<Login Failed>");
		System.out.println("(Email or Password is incorrect!)");
		return false;	
	}

}
