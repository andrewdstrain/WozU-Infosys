package lab.address;

public class RuralRoute extends AbstractAddress {
	private int ruralRoute;
	private String box;

	public RuralRoute(int ruralRoute, String box, String city, String state, int zip, int plus_four, String country) {
		super(city, state, zip, plus_four, country);
		this.ruralRoute = ruralRoute;
		this.box = box;
	}
	
	

	public int getRuralRoute() {
		return ruralRoute;
	}



	public void setRuralRoute(int ruralRoute) {
		this.ruralRoute = ruralRoute;
	}



	public String getBox() {
		return box;
	}



	public void setBox(String box) {
		this.box = box;
	}



	@Override
	public String getDeliveryAddress() {
		return "RR " +ruralRoute + " Box " + box;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof RuralRoute) {
			RuralRoute box = (RuralRoute) obj;
			
			return super.equals(box) &&
				   this.ruralRoute == box.ruralRoute &&
				   this.box.equals(box.box);
		}
		
		return false;
	}
}
