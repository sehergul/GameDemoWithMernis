package concretes;

import abstracts.GamerCheckService;
import abstracts.GamerService;
import entities.Gamer;

public class GamerManager implements GamerService{
	
	private GamerCheckService gamerCheckService;
	
	public GamerManager(GamerCheckService gamerCheckService) {
		super();
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void register(Gamer gamer) {
		if(gamerCheckService.checkIfRealPerson(gamer)==true)
			System.out.println(gamer.getFirstName() + " sisteme baþarýyla kaydedildi!");
		else
			System.out.println(gamer.getFirstName() + " sisteme kayýt olamadý!");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " sistemden baþarýyla silindi!");
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " baþarýyla güncellendi!");

		
	}
	

}
