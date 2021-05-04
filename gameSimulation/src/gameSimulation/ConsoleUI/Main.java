package gameSimulation.ConsoleUI;

import gameSimulation.Entites.Game;
import gameSimulation.Entites.Gamer;
import gameSimulation.Business.CampingManager;
import gameSimulation.Business.GamerManager;
import gameSimulation.Business.MernisCheckManager;
import gameSimulation.Business.SalesManager;
import gameSimulation.Entites.Camping;

public class Main {

	public static void main(String[] args) {
		Game game0 = new Game(1,"GTA","Best Open World Game",179.90);
		Game game1 = new Game(2,"WatchDogs","Open World Game",288.90);
		
		Gamer gamer0 = new Gamer(1,"Tuðberk", "Balýkçý",
				"tugbalikci@gmail.com", "11122233444", "2000");
		Gamer gamer1 = new Gamer(2,"GamerName","GamerLastName",
				"GamerEmail","GamerIdentityNumber","");
		
		GamerManager gamerManager = new GamerManager(new MernisCheckManager());
		gamerManager.register(gamer0);
		gamerManager.register(gamer1);
		
		Camping camping0 = new Camping(1, 20);
		Camping camping1 = new Camping(2,25);
		
		CampingManager campingManager = new CampingManager();
		campingManager.addCampingToTheSystem(camping0);
		campingManager.addCampingToTheSystem(camping1);
		
		
		SalesManager salesManager = new SalesManager(campingManager,new MernisCheckManager());
		salesManager.sale(game0, gamer0,camping1);
		
	}

}
