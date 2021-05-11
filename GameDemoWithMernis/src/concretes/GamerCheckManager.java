package concretes;

import abstracts.GamerCheckService;
import entities.Gamer;

public class GamerCheckManager implements GamerCheckService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " GamerCheckManager ile sisteme kaydedildi!");
		return true;
	}
	

}
