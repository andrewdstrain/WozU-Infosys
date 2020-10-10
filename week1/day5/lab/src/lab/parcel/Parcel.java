package lab.parcel;

import lab.address.Address;
import lab.location.Location;

public interface Parcel {
	Address getAddress();
	String getMessage();
	void deliver(Location location);
} 