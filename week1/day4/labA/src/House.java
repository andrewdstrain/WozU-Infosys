import java.util.List;

public class House {
	private int streetNumber;
	private String street;
	private String city;
	private String state;
	private int zipcode;
	private int plusFour;
	private List<Person> people;
	
	// Prohibit default constructor
	private House() {
		super();
	}

	public House(int streetNumber, String street, String city, String state, int zipcode) {
		this();
		setAddress(streetNumber, street, city, state, zipcode);
	}

	public int getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public int getPlusFour() {
		return plusFour;
	}

	public void setPlusFour(int plusFour) {
		this.plusFour = plusFour;
	}

	public List<Person> getPeople() {
		return people;
	}

	public void setPeople(List<Person> people) {
		this.people = people;
	}
	
	public void setAddress(int streetNumber, String street, String city, String state, int zipcode) {
		this.streetNumber = streetNumber;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
}
