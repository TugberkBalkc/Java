package eTradeSimulation.business.concretes;


import eTradeSimulation.business.abstracts.IAccountVerificationService;
import eTradeSimulation.entites.concretes.User;

public class EmailAccountVerificationManager implements IAccountVerificationService {

	@Override
	public void sendVerification(User user) {
			System.out.println("<Verification Link Has Sent with Email "
					+ "Which is :" + user.getEmail()+">");
			System.out.println("(Please Go To The Link To Access Account)");
	}

}
