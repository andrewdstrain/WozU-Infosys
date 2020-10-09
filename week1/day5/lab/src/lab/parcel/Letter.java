package lab.parcel;

import lab.mail.Box;

public class Letter implements Deliverable {
	private String message;
	
	public Letter(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	@Override
	public void deliver(Box box) {
		box.getParcels().add(message);
	}
	
	

}
