package lab.address;

public abstract class AbstractAddress implements Address {
	private String city;
	private String state;
	private int zip;
	private int plus_four;
	private String country;

	public AbstractAddress(String city, String state, int zip, int plus_four, String country) {
		super();
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.plus_four = plus_four;
		this.country = country;
	}

	@Override
	public String getFullAddress() {
		return getDeliveryAddress() + ", " +
	           city + ", " +
			   state + " " +
	           zip + " " +
			   country;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof AbstractAddress) {
			AbstractAddress box = (AbstractAddress) obj;
			
			return this.city.equals(box.city) &&
				   this.state.equals(box.state) &&
				   this.zip == box.zip &&
				   this.plus_four == box.plus_four &&
				   this.country.equals(box.country);
		}

		return false;
	}

	@Override
	public String getCity() {
		return city;
	}

	@Override
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String getState() {
		return state;
	}

	@Override
	public void setState(String state) {
		this.state = state;
	}

	@Override
	public int getZip() {
		return zip;
	}

	@Override
	public void setZip(int zip) {
		this.zip = zip;
	}

	@Override
	public int getPlus_four() {
		return plus_four;
	}

	@Override
	public void setPlus_four(int plus_four) {
		this.plus_four = plus_four;
	}

	@Override
	public String getCountry() {
		return country;
	}

	@Override
	public void setCountry(String country) {
		this.country = country;
	}
}
