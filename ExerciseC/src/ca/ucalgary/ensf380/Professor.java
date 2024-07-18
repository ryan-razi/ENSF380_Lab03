package ca.ucalgary.ensf380;

public class Professor extends Person {
	
	private String teacherNumber;
	private double salary;
	
	// constructor for professor
	public Professor(String name, String phoneNumber, String emailAddress, Address address,
			double salary) {
		super(name, phoneNumber, emailAddress, address);
		this.teacherNumber = String.valueOf(this.getLastPersonalNumber());
		this.salary = salary;
	}
	
	// setters and getters
	public String getTeacherNumber() {
		return teacherNumber;
	}

	public void setTeacherNumber(String teacherNumber) {
		this.teacherNumber = teacherNumber;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
}
