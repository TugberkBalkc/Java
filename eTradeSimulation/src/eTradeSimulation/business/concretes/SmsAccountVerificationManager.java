package eTradeSimulation.business.concretes;


import eTradeSimulation.business.abstracts.IAccountVerificationService;
import eTradeSimulation.entites.concretes.User;

public class SmsAccountVerificationManager implements IAccountVerificationService {

	@Override
	public void sendVerification(User user) {
		System.out.println("<Verification Link Has Sent with SMS"
				+ "Which is : " + user.getPhoneNumber()+">");
		System.out.println("(Please Go To The Link To Access Account)");
	}

}
