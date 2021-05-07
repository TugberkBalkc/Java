package eTradeSimulation.core;

import java.util.List;

import eTradeSimulation.entites.concretes.User;
import googleAuthorization.GoogleAuthorizationManager;

public class GoogleAuthorizationManagerAdapter implements IAuthorizationService {
	
	private GoogleAuthorizationManager authorizationManager;
	public GoogleAuthorizationManagerAdapter() {
		this.authorizationManager = new GoogleAuthorizationManager();
	}
	@Override
	public boolean register(String firstName, String lastName, String email, String password) {
		return authorizationManager.register(firstName, lastName, email, password);
	}

	@Override
	public boolean login(String email, String password) {
		return authorizationManager.login(email, password);
	}
	@Override
	public boolean login(List<User> users, String email, String password) {
		System.out.println
		("This Method Generated to Access User in AuthorizationManager to Login Process");
		return false;
	}

}
