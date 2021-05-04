
public class GameManager implements GameService{

	@Override
	public void sellGame(Gamer gamer, Game game, Campaign campaign) {
		System.out.println(gamer.getName()+"isimli oyuncunun "+ game.getPrice()+"isimli oyununun"+ game.getPrice()+" tl iken"+ campaign.getCampaignName()+"bu kampanya ile"+ game.getPriceAfterDiscount()+"tl ye oyunun fiyatý düþmüþtür.");
		
	}

	@Override
	public void sellGame(Gamer gamer, Game game) {
		System.out.println(gamer.getName() + " isimli oyuncu" +" " + game.getGameName() + " oyunu"+ " " 
				+ game.getPrice() +  " Tl' ye satýn almýþtýr");
		
	}
	

}
