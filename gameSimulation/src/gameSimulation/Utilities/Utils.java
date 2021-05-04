package gameSimulation.Utilities;

import gameSimulation.Entites.Game;

public class Utils {
	 public static void showTransactionDetails(Game game) {
		 System.out.println("-----Transaction Details-----");
		 if(game.getPriceAfterDiscount() == 0) {
			 
			 System.out.println("Game Details : " + game.getDetails());
			 System.out.println("Price : " + game.getPrice());
			
		 }
		 else {
			 System.out.println("Game Details : " + game.getDetails());
			 System.out.println("Price : " + game.getPrice());
			 System.out.println("Price After Discount : " + game.getPriceAfterDiscount());
		 }
		 System.out.println("----------");
	 }
}
