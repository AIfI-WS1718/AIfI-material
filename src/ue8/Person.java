package ue8;

import java.util.ArrayList;
import java.util.List;

public class Person {
	String name;
	double age;
	static List<String> names = new ArrayList<>();
	
	public Person(String name, double age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName(Person person) {
		return person.name;
	}
	
	public String toString(Person person) {
		return person.name + ", " + person.age + " Jahre alt";
	}
	
	public void incrementAge(Person person) {
		person.age++;
	}
	
	
	
	public static void main(String[] args) {
		
		
		for (int i = 0; i < 3; i++) {
			Person person = new Person("Person " + i, Math.random()*80);
			names.add(person.toString());
		}
		
		for (String person : names) {
			System.out.println(person);
		}
		
		Person neuePerson = new Person ("Hurz", 48);
		names.add(0, neuePerson);
		
		System.out.println(names.size());
		
	}
}
