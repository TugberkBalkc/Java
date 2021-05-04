package gameSimulation.Business;

import gameSimulation.Entites.Camping;
import gameSimulation.Entites.Game;

public class CampingManager implements ICampingService {
	
	public void addCampingToTheSystem(Camping camping) {
			System.out.println(camping.getDiscountPercentage()+"% Camping added to the System!");
	}
	public void makeCamping(Camping camping,Game game) {
		System.out.println(camping.getDiscountPercentage() +"% Camping Added!" );
		game.setPriceAfterDiscount(game.getPrice()-(game.getPrice()*camping.getDiscountPercentage()/100));
	}


	public void removeCamping(Camping camping) {
		System.out.println( camping.getDiscountPercentage()+"% Camping Removed!" );
	}


	public void updateCamping(Camping camping) {
		System.out.println("Camping Updated!" );
	}

}
