package uebung8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonTest {
	public static void main(String[] args) {
	Person personPetr = new Person("Petr",37);
	personPetr.ageIncrease();
	System.out.println(personPetr.toString());
	
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
	
	Person personSvetka = new Person("Svetka", 13);
	persons.add(0,personSvetka);
     System.out.println(persons);
     Person personKatka = new Person ("Katka", 87);
	persons.add(3, personKatka);
	System.out.println(persons);
	System.out.println(persons.size()); 
//	persons.clear();
	System.out.println(persons.isEmpty()); 
	
	System.out.println(persons.contains(personSvetka));
	//persons.remove(personSvetka);
	System.out.println(persons);
	//persons.remove(personPetr);
	
	Map<String ,Person> personMap  = new HashMap<>();
	personMap.put("Svetka", personSvetka);
	personMap.put("Katka", personKatka);
	personMap.put("Petr", personPetr);
	
	personSvetka.setHungry(true);
	personKatka.setHungry(true);
	personPetr.setHungry(true);
	
	System.out.println(personMap.size());
	
	personMap.get("Svetka").setHungry(false);
	
	for (Person einePerson : personMap.values()) {
		System.out.println(einePerson.name);
		System.out.println(einePerson.hungry);
	}
	personMap.remove("Petr");
	System.out.println(personMap.containsKey("Petr"));
	
	
	}
}