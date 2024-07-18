package ca.ucalgary.ensf380;

public class Address {
	
	private String street;
	private String city;
	private String state;
	private String postalCode;
	private String country;
	
	// constructor
	public Address(String street, String city, String state, String postalCode, String country) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
		this.country = country;
	}

	
	// method to validate if the postal code is in the right format
	public boolean validate() {

		String postalCodeFormat = "^[A-Z]\\d[A-Z]\\s\\d[A-Z]\\d$";
		
		if (postalCode.matches(postalCodeFormat)) {
			return true;
		} else {
			return false;
		}
		
	}
	
	// output method
	public String outputAsLabel() {
		return street + ", " + city + ", " + state + ", "  + postalCode + ", "  + country;
	}
	
	// getters and setters
	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getPostalCode() {
		return postalCode;
	}


	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
}
