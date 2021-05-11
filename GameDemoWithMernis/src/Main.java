import java.time.LocalDate;

import abstracts.GamerCheckService;
import adapters.MernisServiceAdapter;
import concretes.GameSaleManager;
import concretes.GamerCheckManager;
import concretes.GamerManager;
import entities.Campaign;
import entities.Game;
import entities.Gamer;

public class Main {

	public static void main(String[] args) {
		Gamer gamer1 = new Gamer("Engin","Demiroð",28861499108L,LocalDate.of(1985,6,1));
		GamerManager gameManager1 = new GamerManager(new MernisServiceAdapter());
		gameManager1.register(gamer1);
		
		System.out.println("\n----\n");
		
		GamerManager gameManager2 = new GamerManager(new MernisServiceAdapter());
		gameManager2.register(new Gamer("Engin","Demiroð",28861499108L,LocalDate.of(1987,6,1)));
		
		System.out.println("\n----\n");
		
		GamerManager gameManager3 = new GamerManager(new GamerCheckManager());
		gameManager3.register(new Gamer("Engin","Demiroð",28861499108L,LocalDate.of(1985,6,1)));
		
		Game game1 = new Game("GTA V",500,"Grand Theft Auto 5");
		Campaign campaign1 = new Campaign("%50 Ýndirim", "Bahar Ýndirimi",50);
		
		GameSaleManager gameSaleManager = new GameSaleManager(new MernisServiceAdapter());
		gameSaleManager.sell(game1, gamer1,campaign1);
		
	}

}
