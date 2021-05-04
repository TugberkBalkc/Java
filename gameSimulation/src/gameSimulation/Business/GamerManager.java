package gameSimulation.Business;

import gameSimulation.Entites.Gamer;

public class GamerManager implements IGamerService {

		private BaseGamerCheckService gamerCheckService;
		
		public GamerManager(BaseGamerCheckService gamerCheckService) {
			this.gamerCheckService = gamerCheckService;
		}

	public void register(Gamer gamer) {
		if(gamerCheckService.Validate(gamer)) {
			System.out.println("<<"+gamer.getFirstName() + " " + 
		gamer.getLastName() +" Has Registered Succesfully!>>");
		}
		else {
			System.out.println("<<Gamer Could not Registered!>>");
		}
	}


	public void update(Gamer gamer) {
		if(gamerCheckService.Validate(gamer)) {
					System.out.println("<<Gamer Profile Has Updated!>>");
		}
		else {
			System.out.println("<<Update is Unavailable for Unvalidated Gamers>>");
		}
		

	}


	public void delete(Gamer gamer) {
		if(gamerCheckService.Validate(gamer)) {
		System.out.println("<<Gamer Profile Has Deleted Permanently!>>");
		}
		else {
			System.out.println("<<Delete is Unavailable for Unvalidated Gamers>>");
		}
	}
	
}
