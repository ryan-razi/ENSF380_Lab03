package ca.ucalgary.ensf380;

public abstract class Person {
	
	protected String name;
	protected String phoneNumber;
	protected String emailAddress;
	protected Address address;
	private static int lastPersonalNumber = 1;
	
	// constructor to create the person
	public Person(String name, String phoneNumber, String emailAddress, Address address) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
		this.address = address;
	}
	
	// method to calculate the next personal number
	protected static String nextPersonalNumber (short num) {
		
		lastPersonalNumber += num;
		return "next personal number is " + lastPersonalNumber;
		
	}
	
	// method to see if person has valid address
	public boolean hasValidAddress() {
		
		if (address.validate() == true) {
			return true;
		} else {
			return false;
		}
		
	}
	
	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public static int getLastPersonalNumber() {
		return lastPersonalNumber;
	}

	public static void setLastPersonalNumber(int lastPersonalNumber) {
		Person.lastPersonalNumber = lastPersonalNumber;
	}
	
	
	
}

