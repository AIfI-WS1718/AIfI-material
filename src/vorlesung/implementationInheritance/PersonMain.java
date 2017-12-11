package vorlesung.implementationInheritance;

public class PersonMain {

	public static void main(String[] args) {
		Child daughter = new Child();
		Adult mother = new Adult(45, "TU Berlin");
		
		System.out.println(daughter.getAge());
		System.out.println(daughter.getAgeInMonth());
		
		System.out.println("........");
		System.out.println(mother.getAge());
		
		System.out.println("........");
		daughter.walk();
		mother.walk();
		
		System.out.println("........");
		Driver driver = new Driver(33, "DHL");
		driver.drive();
		driver.walk();
		driver.changeEmployerInAdult("Clever Shuttle");
		System.out.println("driver arbeitet bei " + driver.employer);
		
		System.out.println("........");
		Person myPerson = new Child();
		if (myPerson instanceof Adult) {
			((Adult) myPerson).getEmployer();
		}
		System.out.println(myPerson.toString());
	}

}
