package lab.location;

import java.util.List;

import lab.address.Address;
import lab.parcel.Deliverable;

public interface Location {
	Address getAddress();
	List<Deliverable> getParcels();
	void receive(Deliverable parcel);
}
