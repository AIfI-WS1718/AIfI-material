package vorlesung.implementationInheritance;

public class Driver extends Adult {
	
	public Driver(int age, String employer) {
		super(age, employer);
	}
	
	public Driver(int age) {
		this(age, "");
	}

	void drive() {
		System.out.println("drive...");
	}
	
	void changeEmployerInAdult(String employer) {
		this.employer = employer;
//		super.employer = employer; // macht das gleiche, weil 'employer' in Driver, sowie Adult sichtbar ist
	}
	
}
