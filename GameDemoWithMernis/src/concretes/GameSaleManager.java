package concretes;

import abstracts.GameSaleService;
import abstracts.GamerCheckService;
import entities.Campaign;
import entities.Game;
import entities.Gamer;

public class GameSaleManager implements GameSaleService{

	private GamerCheckService gamerCheckService;
	
	
	
	public GameSaleManager(GamerCheckService gamerCheckService) {
		super();
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void sell(Game game, Gamer gamer) {
		if(gamerCheckService.checkIfRealPerson(gamer)==true)
			System.out.println(gamer.getFirstName() + ", " + game.getName() + " oyununu " + game.getUnitPrice() + " TL'ye kampanyas�z alm��t�r.");
		else
			System.out.println("Ge�ersiz ki�i oldu�undan oyun sat�lamam��t�r!");
	}

	@Override
	public void sell(Game game, Gamer gamer, Campaign campaign) {
		if(gamerCheckService.checkIfRealPerson(gamer)==true)
			System.out.println(gamer.getFirstName() + ", " + game.getName() + " oyununu " + 
					campaign.getCampaignName() + " kampanyas�ndan faydalanarak " + 
					(game.getUnitPrice() - ( game.getUnitPrice() * campaign.getRateOfDiscount())
					 + " TL'ye alm��t�r."));
		else
			System.out.println("Ge�ersiz ki�i oldu�undan oyun sat�lamam��t�r!");
		
	}
	

}
