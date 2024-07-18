package ca.ucalgary.ensf380;

public class Student extends Person {
	
	private String studentNumber;
	private Professor supervisor;
	private double averageMark;
	
	// constructor
	public Student(String name, String phoneNumber, String emailAddress, Address address, Professor supervisor, double averageMark) {
		super(name, phoneNumber, emailAddress, address);
		this.supervisor = supervisor;
		this.averageMark = averageMark;
		studentNumber = String.valueOf(this.getLastPersonalNumber());
		
	}
	
	// method to see if student it eligible to enroll
	public boolean isEligibleToEnroll() {
		if (address.validate() == true) {
			return true;
		} else {
			return false;
		}
	}
	
	
	// getters and setters
	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public Professor getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(Professor supervisor) {
		this.supervisor = supervisor;
	}

	public double getAverageMark() {
		return averageMark;
	}

	public void setAverageMark(double averageMark) {
		this.averageMark = averageMark;
	}
	
	
	
}
