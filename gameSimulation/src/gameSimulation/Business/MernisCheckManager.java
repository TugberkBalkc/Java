package gameSimulation.Business;

import gameSimulation.Entites.Gamer;

public class MernisCheckManager extends BaseGamerCheckService{

	
	public boolean Validate(Gamer gamer) {
		if(gamer.getFirstName() !="" &&
		   gamer.getLastName() !="" &&
		   gamer.getNationalIdentity() != "" &&
		   gamer.getYearOfBirth() != "") {
			
			System.out.println("<<Gamer Validated>> <<Mernis Services>>" );
			return true;
		}
		else {	
			System.out.println("<<Gamer Could not Validated>> <<Mernis Services>>");
		return false;	
		}
	}

}
