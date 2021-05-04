
public class Main {

	public static void main(String[] args) {
		Gamer gamer1=new Gamer();
		gamer1.setId(1);
		gamer1.setName("ikbal");
		gamer1.setSurname("kýrklar");
		gamer1.setTc("22222222");
		gamer1.setDogumYýlý(2001);
		
		GamerManager gamerManager=new GamerManager( new EDevletCheck());
	    gamerManager.addGamer(gamer1);
     	gamerManager.deleteGamer(gamer1);
		gamerManager.updateGamer(gamer1);
		
	    
	    Campaign campaign1 = new Campaign();
	    campaign1.setId(001);
	    campaign1.setCampaignName("camp1");
	    campaign1.setDiscount(1);
	    
	    CampaignManager campaignManager=new CampaignManager();
	    campaignManager.addCampaign(campaign1);
	    campaignManager.deleteCampaign(campaign1);
	    campaignManager.updateCampaign(campaign1);
	    
	    
	    Game game1=new Game();
		game1.setId(01);
	    game1.setGameName("oyun1");
	    game1.setPrice(5);
	    
	    GameManager gameManager= new GameManager();
	    gameManager.sellGame(gamer1, game1, campaign1);
	    
	    GameManager gameManager2=new GameManager();
	    gameManager2.sellGame(gamer1, game1);
	    
	    
	    
	}

}
