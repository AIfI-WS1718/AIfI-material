package vorlesung.implementationInheritance;

public class Adult extends Person {
	
	String employer;
	
	Adult(int age, String employer){
		super(age);
		this.employer = employer;
	}
	
	String getEmployer() {
		return employer;
	}
	
	@Override
	void walk() {
		System.out.println("Stillgestanden!");
	}
	
	@Override
	int getAge() {
		System.out.println("Calling Adult getAge()...");
		return super.getAge();
		// Achtung: this.getAge() oder einfach getAge() ergibt eine Endlosschleife, weil die Methode sich selbst aufruft
	}

}
