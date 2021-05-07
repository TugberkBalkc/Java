package eTradeSimulation.utils;

import eTradeSimulation.entites.concretes.User;

public class UserUtilities {
	
	public static void showUserProfile(User user) {
		System.out.println("-----" + user.getId() + "-----");
		System.out.println("First Name : "+ user.getFirstName());
		System.out.println("Last Name : " + user.getLastName());
		System.out.println("Email : " + user.getEmail());
		System.out.println("Password : " + user.getPassword());
		System.out.println("PhoneNumber : " + user.getPhoneNumber());
		System.out.println("Account Condition : " + user.getAccountCondition());
		System.out.println("-----------");
	}

}
