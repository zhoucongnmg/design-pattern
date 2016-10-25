package Test21_1;

public class Rocket {
	private String name;
	private Double apogee;
	
	public Rocket(String name,Double apogee){
		this.name = name;
		this.apogee = apogee;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getApogee() {
		return apogee;
	}

	public void setApogee(Double apogee) {
		this.apogee = apogee;
	}

	@Override
	public String toString() {
		return "Rocket [name=" + name + "]";
	}
	
}
