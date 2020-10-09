package lab.mail;

import java.util.List;
import java.util.Vector;

public class POBox extends AbstractBox implements Receivable {
	private int boxNumber;
	private List<String> parcels;

	public POBox(int boxNumber, String city, String state, int zip, int plus_four, String country) {
		super(city, state, zip, plus_four, country);
		this.boxNumber = boxNumber;
		this.parcels = new Vector<>();
	}

	@Override
	public String getAddress() {
		return "P.O. Box " + boxNumber;
	}

	public int getBoxNumber() {
		return boxNumber;
	}

	public void setBoxNumber(int boxNumber) {
		this.boxNumber = boxNumber;
	}

	@Override
	public List<String> getParcels() {
		return parcels;
	}

	@Override
	public void receive(String parcel) {
		parcels.add(parcel);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Mailbox) {
			POBox box = (POBox) obj;
			
			return super.equals(box) &&
				   this.boxNumber == box.boxNumber;
		}
		
		return false;
	}
}
