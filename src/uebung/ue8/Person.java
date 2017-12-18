package uebung.ue8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Person {
	
	String name;
	int age;

	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	public void celebrateBirthday(){
		this.age++;
	}
	public String toString(){
		return name + " ist " + age + " Jahre alt.";
	}
	
	public static void main(String[] args) {
		List<Person> household = new ArrayList<>();

		Person p1 = new Person("Hans", 35);
		Person p2 = new Person("Gustav", 58);
		Person p3 = new Person("Guenter", 60);
		Person p4 = new Person("Johann", 40);
		household.add(p1);
		household.add(p2);
		household.add(p3);
		household.add(p4);
		for(Person p : household){
			p.celebrateBirthday();
			System.out.println(p.toString());
		}
		household.remove(2);
		for(Person p : household){
			System.out.println(p.toString());
		}
		System.out.println(household.isEmpty() );
		
		for (Person person: household){
			System.out.println(person.toString() );
		}
		System.out.println(household.size());
		
		if (household.contains(p1)){
			System.out.println(household.remove(p1));
		}
		
		int indexOfP2 = household.indexOf(p2);
		System.out.println(indexOfP2);
		household.remove(indexOfP2);
		
		for(Person person : household){
			System.out.println(person.toString());
		}
		System.out.println(household.size());
		
		System.out.println("--------");
		
		HashMap<String, Person> map = new HashMap<>();
		map.put("Hans", p1);
		map.put("Gustav", p2);
		map.put("Guenter", p3);
		map.put("Johann", p4);
		System.out.println(map.size());
		
	}
	
}
