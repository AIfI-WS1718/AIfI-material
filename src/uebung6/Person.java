package uebung6;

public class Person {
	String firstName;
	String lastName;
	int age;

	Person(String firstName, String lastName, int age) {
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

	public String toString() {
		return firstName + " " + lastName + " " + age;
	}

}