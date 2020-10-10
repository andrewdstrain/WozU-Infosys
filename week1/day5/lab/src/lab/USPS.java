package lab;

import java.util.ArrayList;
import java.util.List;

import lab.address.Address;
import lab.address.POBox;
import lab.address.RuralRoute;
import lab.address.StreetAddress;
import lab.location.Box;
import lab.location.Location;
import lab.parcel.Container;
import lab.parcel.Parcel;
import lab.parcel.Letter;

public class USPS implements Runnable {
	@Override
	public void run() {
		// Addresses
		System.out.print("Creating addresses...");
		Address andy = new POBox("10", "New York", "NY", 12345, 1234, "US");
		Address adam = new StreetAddress(123, "Main St", "Chicago", "IL", 54321, 4321, "US");
		Address anne = new RuralRoute(2468, "42Aß", "Springfield", "IL", 24680, 8642, "US");
		System.out.println("done");
		
		System.out.print("Creating parcels...");
		List<Parcel> parcels = new ArrayList<>();
		parcels.add(new Letter(andy, "Please respond to this immediately"));
		parcels.add(new Letter(adam, "Lazing around on a Friday afternoon."));
		parcels.add(new Letter(anne, "This is the life."));
		Container container = new Container(anne);
		container.addItem("Forks");
		container.addItem("Spoons");
		container.addItem("Knives");
		parcels.add(container);
		System.out.println("done");
		
		System.out.print("Creating locations...");
		List<Location> locations = new ArrayList<>();
		locations.add(new Box(andy));
		locations.add(new Box(adam));
		locations.add(new Box(anne));
		System.out.println("done");
		
		System.out.print("Delivering mail...");
		for (Location location : locations) {
			for (Parcel parcel : parcels) {
				if (parcel.getAddress().equals(location.getAddress())) {
					parcel.deliver(location);
				}
			}
		}
		System.out.println("done");
		
		System.out.println();
		System.out.println("Mail call:");
		System.out.println("----------");
		for (Location location : locations) {
			System.out.println(location.getAddress().getFullAddress() + ":");
			for (Parcel parcel : location.getParcels()) {
				System.out.println("\t" + parcel.getMessage());
			}
		}
	}
}
