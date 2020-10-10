package lab.parcel;

import lab.address.Address;
import lab.location.Location;

public class Letter implements Deliverable {
	private Address address;
	private String message;
	
	public Letter(Address address, String message) {
		this.address = address;
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}

	@Override
	public void deliver(Location box) {
		box.receive(this);
	}

	@Override
	public Address getAddress() {
		return address;
	}
	
	

}
