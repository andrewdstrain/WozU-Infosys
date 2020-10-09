package lab.mail;

import java.util.ArrayList;
import java.util.List;

public class Mailbox extends AbstractBox implements Receivable {
	private int streetNumber;
	private String street;
	private List<String> parcels;

	public Mailbox(int streetNumber, String street, String city, String state, int zip, int plus_four, String country) {
		super(city, state, zip, plus_four, country);
		this.streetNumber = streetNumber;
		this.street = street;
		this.parcels = new ArrayList<String>();
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
	public void receive(String parcel) {
		parcels.add(parcel);
	}

	@Override
	public String getAddress() {
		return streetNumber + " " + street;
	}

	@Override
	public List<String> getParcels() {
		return parcels;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Mailbox) {
			Mailbox box = (Mailbox) obj;
			
			return super.equals(box) &&
				   this.streetNumber == box.streetNumber &&
				   this.street.equals(box.street);
		}
		
		return false;
	}
}
