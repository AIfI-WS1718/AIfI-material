package uebung8;

import java.util.ArrayList;
import java.util.List;

public class PersonTest {
	public static void main(String[] args) {
	Person person = new Person("Petr",37);
	person.ageIncrease();
	System.out.println(person.toString());
	
	List<Person> persons = new ArrayList<>();
	for (int counter = 0; counter < 3; counter++ ) {
	persons.add(new Person("Vovka"+ counter ,45-counter));
	
}
	System.out.println(persons);
	
	for (Person person1 : persons) {
		person1.ageIncrease();
		System.out.println(person1.toString());
	}
	persons.remove(2);
	System.out.println(persons);
	
	
	}
}