package eTradeSimulation.business.abstracts;

import eTradeSimulation.entites.concretes.User;

public interface IUserService extends IEntityRepositoryBase<User>{
	void verifyAccount(User user);
	void login(String email,String password);
}
