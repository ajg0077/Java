package employee1_normal;

public class Director {

	private String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public void address() {
		System.out.println("Address "+getCity());
	}
}
