package ue6;
import generator.NameAndBirthYearGenerator;

public class Person {
	private String firstName;
	private String lastName;
	private int age;
	
	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void getFirstName() {
		System.out.println(firstName);
	}
	public void getLastName() {
		System.out.println(lastName);
	}
	public void getAge() {
		System.out.println(age);
	}
	
	@Override
	public String toString() {
		return firstName + " " + lastName + ", " + age;
	}
}
