package uebung.ue6;

public class Person {
	private String firstName, lastName;
	private int age;
	Person (String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getAge() {
		return age;
	}
	
	public static void main(String[] args) {
		
	}

	@Override
	public String toString() {
		return this.getFirstName() + " " + this.getLastName() + "," + this.getAge();
		
	}
}
