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
			System.out.println(gamer.getFirstName() + " sisteme ba�ar�yla kaydedildi!");
		else
			System.out.println(gamer.getFirstName() + " sisteme kay�t olamad�!");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " sistemden ba�ar�yla silindi!");
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " ba�ar�yla g�ncellendi!");

		
	}
	

}
