package lab;

import lab.mail.Box;
import lab.mail.Mailbox;
import lab.mail.POBox;
import lab.parcel.Container;
import lab.parcel.Deliverable;
import lab.parcel.Letter;

public class USPS implements Runnable {
	@Override
	public void run() {
		// Recipients
		System.out.print("Creating boxes...");
		Box andy = new POBox(10, "New York", "NY", 12345, 1234, "US");
		Box adam = new Mailbox(123, "Main St", "Chicago", "IL", 54321, 4321, "US");
		Box anne = new Mailbox(2468, "Maven Ave", "Springfield", "IL", 24680, 8642, "US");
		System.out.println("done");
		
		System.out.print("Creating parcels...");
		Deliverable urgent = new Letter("Please respond to this immediately");
		Deliverable lazy = new Letter("Lazing around on a Friday afternoon.");
		Deliverable utensils = new Container("Forks/Spoons/Knives");
		System.out.println("done");
		
		System.out.print("Delivering mail...");
		urgent.deliver(anne);
		urgent.deliver(adam);
		lazy.deliver(andy);
		utensils.deliver(adam);
		System.out.println("done");
		
		System.out.println();
		System.out.println("Mail call:");
		System.out.println("----------");
		Box[] boxes = {andy, adam, anne};
		for (Box box : boxes) {
				System.out.println(box.getFullAddress() + ": " + box.getParcels());
		}
	}
}
