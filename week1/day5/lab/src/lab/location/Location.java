package lab.location;

import java.util.List;

import lab.address.Address;
import lab.parcel.Parcel;

public interface Location {
	Address getAddress();
	List<Parcel> getParcels();
	void receive(Parcel parcel);
}
