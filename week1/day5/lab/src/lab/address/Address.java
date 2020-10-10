package lab.address;

public interface Address {
	String getCity();

	void setCity(String city);

	String getState();

	void setState(String state);

	int getZip();

	void setZip(int zip);

	int getPlus_four();

	void setPlus_four(int plus_four);

	String getCountry();

	void setCountry(String country);

	String getDeliveryAddress();

	String getFullAddress();
}
