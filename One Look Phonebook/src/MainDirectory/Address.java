package MainDirectory;

public class Address {

	private String street1;
	private String city;
	private String state;
	private String zipCode;

	public Address() {}
	public Address(String street1, String city, String state, String zipCode) {
		this.street1 = street1;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		}
	public String getStreet1() {
		return this.street1;
	}
	public void setStreet1(String street1) {
		this.street1 = street1;
	}
	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return this.state.toUpperCase();
	}
	public void setState(String state) {
		this.state = state.toUpperCase();
	}
	public String getZipCode() {
		return this.zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	@Override
	public String toString() {
		return "\r\n" + street1 + "\r\n" + city + ", " + state + " " + zipCode;
	}
}

