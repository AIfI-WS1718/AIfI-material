package vorlesung.implementationInheritance;

public class Child extends Person {

	String school;
	
	Child(){
		super();
	}
	
	String getSchool() {
		return school;
	}
	
	int getAgeInMonth() {
		// Achtung: Auch super.age geht nicht, weil age hier nicht sichtbar ist (private)
		return 12 * super.getAge();
	}
	
}
