package Assignments.lesson3.Question4;

public class Address {
	private String zipcode;
	private String city;
	private String state;
	private String street;
	public String getZipcode() {
		return zipcode;
	}
	@Override
	public String toString() {
		return "Address [zipcode=" + zipcode + ", city=" + city + ", state=" + state + ", street=" + street + "]";
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Address(String zipcode, String city, String state, String street) {
		super();
		this.zipcode = zipcode;
		this.city = city;
		this.state = state;
		this.street = street;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
}
