package eTradeSimulation.business.abstracts;

import java.util.List;
import eTradeSimulation.entites.concretes.User;

public interface IUserValidationService {
		boolean validateFirstNameLastName(String firstName,String lastName);
		boolean validatePassword(String password);
		boolean validateEmail(String Email);
		boolean validateIsEmailUsedBefore(List<User> users,String email);
}
