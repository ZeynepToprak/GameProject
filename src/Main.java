
import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.SaleManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		
		GamerManager gamerManager=new GamerManager(new MernisServiceAdapter());
		GameManager gameManager=new GameManager();
		CampaignManager campaignManager=new CampaignManager();
		SaleManager saleManager=new SaleManager();
		
		Gamer gamer=new Gamer();
		gamer.setId(1);
		gamer.setFirtName("Elif Zeynep");
		gamer.setLastName("Toprak");
		gamer.setDateOfBirth(2001);
		gamer.setNationalityId("10000000");
		
		gamerManager.save(gamer);
		
		Game game=new Game();
		game.setId(9);
		game.setGameName("Lol");
		game.setPrice(150);
		
		gameManager.add(game);
		
		Campaign campaign =new Campaign();
		campaign.setId(5);
		campaign.setName("Altýn hafta");
		
		campaignManager.add(campaign);
		
		saleManager.buy(game, gamer, campaign);
		
		
		
	}

}
