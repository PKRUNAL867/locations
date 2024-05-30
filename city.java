package location;

public class city extends state {
	private String city_name;

	public String getCity_name() {
		return city_name;
	}

	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}

	@Override
	public String toString() {
		return "country ="+getCname()+" state =" +getSname()+" city [city_name=" + city_name + "]";
	}
	
	

}
