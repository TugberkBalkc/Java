package eTradeSimulation.business.abstracts;

import eTradeSimulation.entites.concretes.User;

public interface IAccountVerificationService {
		void sendVerification(User user);
}
