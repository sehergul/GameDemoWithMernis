package abstracts;

import entities.Campaign;
import entities.Game;
import entities.Gamer;

public interface GameSaleService{
	public void sell(Game game, Gamer gamer);
	public void sell(Game game, Gamer gamer, Campaign campaign);


}
