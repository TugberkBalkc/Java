package eTradeSimulation.presentation;

import eTradeSimulation.business.abstracts.IUserService;
import eTradeSimulation.business.concretes.AuthorizationManager;
import eTradeSimulation.business.concretes.EmailAccountVerificationManager;
import eTradeSimulation.business.concretes.UserManager;
import eTradeSimulation.business.concretes.UserValidationManager;
import eTradeSimulation.core.GoogleAuthorizationManagerAdapter;
import eTradeSimulation.dataAccess.abstracts.IUserDao;
import eTradeSimulation.dataAccess.concretes.InMemoryUserDao;
import eTradeSimulation.entites.concretes.User;
import eTradeSimulation.utils.UserUtilities;

public class ConsoleUI {

	public static void main(String[] args) {
		User user4 = new User
		(4,"Samet","Gemici",
		"gemici@gmail.com","samet123",
		"05385383838"); //InMemoryDao üzerinden ayný emaile 
		//sahip bir kullanýcý mevcut
		
		User user5 = new User
		(5, "Tuðberk","Balýkçý",
		"tugbalikci@gmail.com","balikci123",
		"05335333333");

			IUserService userService = new UserManager
			(new InMemoryUserDao(), 
				new AuthorizationManager
				(new InMemoryUserDao(),new UserValidationManager()),
					new EmailAccountVerificationManager());
			userService.add(user4);
			userService.verifyAccount(user4);
			userService.login("gemici@gmail.com", "samet123");
			System.out.println("----------");
			System.out.println("----------");
			System.out.println("----------");
			System.out.println("----------");
			userService.add(user5);
			userService.verifyAccount(user5);
			userService.login("tugbalikci@gmail.com", "balikci123");
	}

}
