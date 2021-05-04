package gameSimulation.Business;

import gameSimulation.Entites.Camping;
import gameSimulation.Entites.Game;
import gameSimulation.Entites.Gamer;
import gameSimulation.Utilities.Utils;


public class SalesManager implements ISalesService {
	
	private ICampingService campingService;
	private BaseGamerCheckService customerCheckService;
	public SalesManager() {
		
	}
	public SalesManager(ICampingService campingService,BaseGamerCheckService customerCheckService) {
		this.campingService =campingService;
		this.customerCheckService = customerCheckService;
	}
	
	public void sale(Game game,Gamer gamer) {
		if(customerCheckService.Validate(gamer)) {
			System.out.println (
				"*-----" + game.getName() + 
				" Sold to "+gamer.getFirstName() + " " +
				gamer.getLastName() +"-----*");
		Utils.showTransactionDetails(game);
		}
		else{
			System.out.println("Sale Unsuccessful!");
		}
		
	}
	public void sale(Game game,Gamer gamer,Camping camping) {
		if(customerCheckService.Validate(gamer)) {
		System.out.println (
				"*-----" + game.getName() + 
				" Sold to "+gamer.getFirstName() + "" +
				gamer.getLastName() +"-----*");
			campingService.makeCamping(camping, game);
		Utils.showTransactionDetails(game);
		}
		else {
			System.out.println("Sale Unsuccessful!");
		}
	}
}
