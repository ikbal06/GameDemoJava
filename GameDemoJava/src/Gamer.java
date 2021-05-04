

public class Gamer {
	private int id;
	private String tc;
	private String name;
	private String surname;
	private double dogumYılı;
	
	public Gamer() {
		
	}

	public Gamer(int id, String tc, String name, String surname, double dogumYılı) {
		super();
		this.id = id;
		this.tc = tc;
		this.name = name;
		this.surname = surname;
		this.dogumYılı = dogumYılı;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTc() {
		return tc;
	}

	public void setTc(String tc) {
		this.tc = tc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public double getDogumYılı() {
		return dogumYılı;
	}

	public void setDogumYılı(double dogumYılı) {
		this.dogumYılı = dogumYılı;
	}
	
}