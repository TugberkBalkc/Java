package eTradeSimulation.business.concretes;

import java.util.List;
import eTradeSimulation.business.abstracts.IAccountVerificationService;
import eTradeSimulation.business.abstracts.IUserService;
import eTradeSimulation.core.IAuthorizationService;
import eTradeSimulation.dataAccess.abstracts.IUserDao;
import eTradeSimulation.entites.concretes.User;
import eTradeSimulation.utils.UserUtilities;

public class UserManager implements IUserService {

	private IUserDao userDao;
	private IAuthorizationService authService;
	private IAccountVerificationService accountVerificationService;
	public UserManager
	(IUserDao userDao,
	 IAuthorizationService authService,
	 IAccountVerificationService accountVerificationService) {
		this.userDao = userDao;
		this.authService = authService;
		this.accountVerificationService =accountVerificationService;
	}
	
	
	@Override
	public List<User> getAll() {
		return userDao.getAll();
	}
	
	@Override
	public void add(User entity) {
		if(authService.register
		(entity.getFirstName(), entity.getLastName(),
		 entity.getEmail(), entity.getPassword())) {
			UserUtilities.showUserProfile(entity);
			userDao.add(entity);
			System.out.println("<User Successfully Added>");
			entity.setValidationCondition(true);
			accountVerificationService.sendVerification(entity);
		}
		else {
			System.out.println("<User Could not Added>");
		}
	}

	@Override
	public void delete(User entity) {
		userDao.delete(entity);
		System.out.println("<User Deleted>");
	}


	

	public void login(String email, String password) {
		authService.login(userDao.getAll(),email, password);
	}
	@Override
	public void verifyAccount(User user) {
		if(user.getValidationCondition()) {
		user.setAccountCondition(true);
		System.out.println("<Account Verified>");
		UserUtilities.showUserProfile(user);
		return;
		}
		System.out.println("<Unavailable Request>");
		System.out.println("(Verification is not Sent To Unregistered Users!)");
	}


	

}
