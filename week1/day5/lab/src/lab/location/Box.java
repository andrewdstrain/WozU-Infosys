package lab.location;

import java.util.ArrayList;
import java.util.List;

import lab.address.Address;
import lab.parcel.Deliverable;

public class Box implements Location {
	private Address address;
	private List<Deliverable> parcels;
	
	public Box(Address address) {
		this.address = address;
		this.parcels = new ArrayList<>();
	}
	
	@Override
	public void receive(Deliverable parcel) {
		this.parcels.add(parcel);
	}

	@Override
	public Address getAddress() {
		return address;
	}

	@Override
	public List<Deliverable> getParcels() {
		return parcels;
	}
	
}
