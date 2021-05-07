package eTradeSimulation.core;

import java.util.List;
import eTradeSimulation.entites.concretes.User;

public interface IAuthorizationService {
	boolean register(String firstName,String lastName,String email,String password);
	boolean login(String email ,String password);
	boolean login(List<User> users,String email ,String password);
}
