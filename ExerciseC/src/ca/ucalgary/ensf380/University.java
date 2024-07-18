package ca.ucalgary.ensf380;

public class University {

	public static void main(String[] args) {
		
		// create a professor 
		Address address = new Address("University Dr.", "Calgary", "AB", "T5R 7Y7", "Canada");
		Professor professor = new Professor("John Cena", "555-1234", "john.cena@outlook.com", address, 400000);
		
		// print out his number and name
		System.out.println("Profesors name: " + professor.getName());
		System.out.println("Profesors personal number: " + professor.getTeacherNumber());
		
		// increment the personal number by 5 for the next person and print it to the screen
		short num = 5;
		System.out.println(Person.nextPersonalNumber(num));
		System.out.println();
		
		// create a student with proper postal code		
		Address anotherAddress = new Address("Kincora", "Calgary", "AB", "T3R 9H2", "Canada");
		Student student1 = new Student("Ryan Razi", "403-777-8888", "ryan.razi@outlook.com", anotherAddress, professor, 90);
		
		// print out his number and name
		System.out.println("student1 name: " + student1.getName());
		System.out.println("student1 personal number: " + student1.getStudentNumber());
		
		// increment the personal number by 7 for the next person and print it to the screen
		num = 7;
		System.out.println(Person.nextPersonalNumber(num));
		System.out.println();
		
		// create student without proper postal code
		Address yetAnotherAddress = new Address("Brentwood", "Calgary", "AB", "X1Y 2Z", "Canada");
		Student student2 = new Student("LeBron James", "987-654-3210", "lebroon@gmail.com", yetAnotherAddress, professor, 100);
		
		// print out his number and name
		System.out.println("student2 name: " + student1.getName());
		System.out.println("student2 personal number: " + student2.getStudentNumber());
		
		// increment the personal number by 12 for the next person and print it to the screen
		num = 12;
		System.out.println(Person.nextPersonalNumber(num));
		System.out.println();
		
		// print out student1 eligibility to enroll
		System.out.println("Student 1 eligibility: " + student1.isEligibleToEnroll());
				
		// print out student1 address to see his postal code
		System.out.println("Student 1 address: " + student1.getAddress().outputAsLabel());
		System.out.println();
		
		
		// print out student2 eligibility to enroll
		System.out.println("Student 2 eligibility: " + student2.isEligibleToEnroll());
		
		// print out student2 address to see his postal code is missing a character
		System.out.println("Student 2 address: " + student2.getAddress().outputAsLabel());
		System.out.println();
		
		// change his address to be valid
		student2.getAddress().setPostalCode("X1Y 2Z3");
		
		// print out his new eligibility
		System.out.println("Student 2 new eligibility: " + student2.isEligibleToEnroll());
		
		// print out his new address
		System.out.println("Student 2 new address: " + student2.getAddress().outputAsLabel());
	}

}
