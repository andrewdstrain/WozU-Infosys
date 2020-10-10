package lab.parcel;

import lab.address.Address;
import lab.location.Location;

public class Container implements Deliverable {
	private Address address;
	private String items;

	public Container(Address address, String items) {
		this.address = address;
		this.items = items;
	}

	@Override
	public String getMessage() {
		return items;
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
