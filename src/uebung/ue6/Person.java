package uebung.ue6;

public class Person {
	private String firstName;
	private String lastName;
	private int age;
	
	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	public String getfirstName() {
		return firstName;
	}
	
	public String getlastName() {
		return lastName;
	}
	
	public int getage() {
		return age;
	}
	
	@Override
	public String toString() {
		return firstName + " " + lastName + " (" + age + " Jahre)";
	}
}