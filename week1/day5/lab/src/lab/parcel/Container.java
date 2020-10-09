package lab.parcel;

import lab.mail.Box;

public class Container implements Deliverable {
	private String items;

	public Container(String items) {
		this.items = items;
	}

	public String getItems() {
		return items;
	}

	@Override
	public void deliver(Box box) {
		box.getParcels().add(items);
	}

}
