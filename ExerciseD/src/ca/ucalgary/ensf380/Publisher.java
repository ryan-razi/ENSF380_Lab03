package ca.ucalgary.ensf380;

public class Publisher {
	
	private String name;
	private String address;
	private Classic[] classicsCatalogue;

	public Publisher(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public String printLetterHead() {
		return "Method printLetterHead called from Publisher";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Classic[] getClassicsCatalogue() {
		return classicsCatalogue;
	}

	public void setClassicsCatalogue(Classic[] classicsCatalogue) {
		this.classicsCatalogue = classicsCatalogue;
	}
	
	

}
