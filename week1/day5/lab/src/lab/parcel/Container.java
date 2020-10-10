package lab.parcel;

import java.util.ArrayList;
import java.util.List;

import lab.address.Address;
import lab.location.Location;

public class Container implements Parcel {
	private Address address;
	private List<String> items;

	public Container(Address address) {
		this.address = address;
		this.items = new ArrayList<>();
	}
	
	public void addItem(String item) {
		this.items.add(item);
	}

	@Override
	public String getMessage() {
		return items.toString();
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
