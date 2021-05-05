package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SaleManager implements SaleService {

	@Override
	public void buy(Game game, Gamer gamer, Campaign campaign) {
		System.out.println(
				gamer.getFirtName() +  "  isimli oyunucu  "  + game.getGameName()+   "  oyununu  " + campaign.getName() + "  kampanyasý ile satýn aldý");

	}

}
