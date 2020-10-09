package lab.mail;

import java.util.List;

public abstract class AbstractBox implements Box {
	private String city;
	private String state;
	private int zip;
	private int plus_four;
	private String country;
	
	public AbstractBox(String city, String state, int zip, int plus_four, String country) {
		super();
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.plus_four = plus_four;
		this.country = country;
	}
	
	public abstract String getAddress();
	public abstract List<String> getParcels();
	
	@Override
	public String getFullAddress() {
		return getAddress() + ", " +
	           city + ", " +
			   state + " " +
	           zip + " " +
			   country;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof AbstractBox) {
			AbstractBox box = (AbstractBox) obj;
			
			return this.city.equals(box.city) &&
				   this.state.equals(box.state) &&
				   this.zip == box.zip &&
				   this.plus_four == box.plus_four &&
				   this.country.equals(box.country);
		}

		return false;
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

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public int getPlus_four() {
		return plus_four;
	}

	public void setPlus_four(int plus_four) {
		this.plus_four = plus_four;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
