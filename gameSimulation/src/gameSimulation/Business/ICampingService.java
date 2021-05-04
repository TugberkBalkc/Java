package gameSimulation.Business;
import gameSimulation.Entites.Camping;
import gameSimulation.Entites.Game;

public interface ICampingService {
		void makeCamping(Camping camping,Game game);
		void removeCamping(Camping camping);
		void updateCamping(Camping camping);
}
