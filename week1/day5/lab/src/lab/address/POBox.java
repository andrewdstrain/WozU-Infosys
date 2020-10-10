package lab.address;

public class POBox extends AbstractAddress {
	private String box;

	public POBox(String box, String city, String state, int zip, int plus_four, String country) {
		super(city, state, zip, plus_four, country);
		this.box = box;
	}

	@Override
	public String getDeliveryAddress() {
		return "P.O. Box " + box;
	}

	public String getBoxNumber() {
		return box;
	}

	public void setBoxNumber(String boxNumber) {
		this.box = boxNumber;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof POBox) {
			POBox box = (POBox) obj;
			
			return super.equals(box) &&
				   this.box.equals(box.box);
		}
		
		return false;
	}
}
