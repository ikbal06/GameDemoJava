
public class GamerManager implements GamerService{

	GamerCheckService gamerCheckService;
	
	public GamerManager(GamerCheckService gamerCheckService) {
		this.gamerCheckService=gamerCheckService;
	}
	@Override
	public void addGamer(Gamer gamer) {
		if (gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println(gamer.getName()+" eklendiniz ");
		}else {
			System.out.println(gamer.getName()+ " kay�t ba�ar�s�z");
		}
		
	}

	@Override
	public void deleteGamer(Gamer gamer) {
		System.out.println(gamer.getName()+" adl� oyuncu  silindi");
		
	}

	@Override
	public void updateGamer(Gamer gamer) {
		System.out.println(gamer.getName()+" adl� oyuncu g�ncelendi");
		
	}
	

}
