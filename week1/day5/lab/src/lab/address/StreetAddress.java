package lab.address;

public class StreetAddress extends AbstractAddress {
	private int streetNumber;
	private String street;

	public StreetAddress(int streetNumber, String street, String city, String state, int zip, int plus_four,
			String country) {
		super(city, state, zip, plus_four, country);
		this.streetNumber = streetNumber;
		this.street = street;
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

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof StreetAddress) {
			StreetAddress box = (StreetAddress) obj;

			return super.equals(box) &&
				   this.streetNumber == box.streetNumber &&
				   this.street.equals(box.street);
		}

		return false;
	}

	@Override
	public String getDeliveryAddress() {
		return streetNumber + " " + street;
	}
}
