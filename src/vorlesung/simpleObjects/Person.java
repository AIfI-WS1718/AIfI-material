package vorlesung.simpleObjects;

class Person {

	/* (Objekt-) Variablen */
	private double age;
	private String name;
	
	/* Konstruktoren */
	Person() {
		age = -1;
		name = "NoName";
	}
	
	Person(double tmp) {
		age = tmp;
		name = "NoName";
	}
	
	Person(String str) {
		age = -1;
		name = str;
	}
	
	Person(String str, double tmp) {
		age = tmp;
		name = str;
	}
	
	/* Getter und Setter */
	public double getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	void setAge(double tmp) {
		age = tmp;
	}
	
	private void setName(String name) {
		this.name = name;
	}

	/* Andere (Objekt-) Methoden */
	private void walk() {
		System.out.println("walk...");
	}
	
	/* Main-Methode */
	public static void main(String[] args) {
		Person meier = new Person();
		meier.age = 30;
		System.out.println("Alter von meier: " + meier.age);
		
		meier.walk();
		
		meier.setName("meier");
		System.out.println("Name von meier: " + meier.getName());
		
		Person mueller = new Person(3.6);
		System.out.println(mueller.getAge());
		System.out.println(mueller.getName());
	}

}
