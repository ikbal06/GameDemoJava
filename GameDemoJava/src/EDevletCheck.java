
public class EDevletCheck implements GamerCheckService{

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		System.out.println("Doğrulandı");
		return true;
	}
	

}
