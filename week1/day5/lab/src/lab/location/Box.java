package lab.location;

import java.util.ArrayList;
import java.util.List;

import lab.address.Address;
import lab.parcel.Parcel;

public class Box implements Location {
	private Address address;
	private List<Parcel> parcels;
	
	public Box(Address address) {
		this.address = address;
		this.parcels = new ArrayList<>();
	}
	
	@Override
	public void receive(Parcel parcel) {
		this.parcels.add(parcel);
	}

	@Override
	public Address getAddress() {
		return address;
	}

	@Override
	public List<Parcel> getParcels() {
		return parcels;
	}
	
}
