package uebung.ue9.aufgabe1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Person {

	private String name;
	private int age;

	// alle Personen sollen standardmäßig hungrig sein
	private boolean hungry = true;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return this.name + ", " + this.age;
	}

	private void increaseAge() {
		this.age++;
	}

	public void setHungry(boolean hungry) {
		this.hungry = hungry;
	}

	public static void main(String[] args) {

		// 1a

		Person karl = new Person("Karl", 43);
		Person lutz = new Person("Lutz", 12);
		Person lotta = new Person("Lotta", 39);

		List<Person> household = new ArrayList<>();
		household.add(karl);
		household.add(lutz);
		household.add(lotta);

		Map<String, Person> persons = new HashMap<>();
		persons.put("Karl", karl);
		persons.put("Lutz", lutz);
		persons.put("Lotta", lotta);

		// Iteriere über alle Personen der Map -> über alle Values
		System.out.println("Personen in Map, iteriert über values():");
		for (Person p : persons.values()) {
			System.out.println(p);
		}

		// Alternativ iterieren über alle Entrys
		System.out.println("Personen in Map, iteriert über entryset():");
		for (Entry<String, Person> entry : persons.entrySet()) {
			System.out.println(entry.getValue());
		}

		// Zugriff auf eine Person über get(*key*)
		persons.get("Karl").setHungry(false);

		// Personen sind mit keiner erkennbaren Ordnung in der Map
		for (Person p : persons.values()) {
			System.out.println(p + " ist hungrig: " + p.hungry);
		}
		
		persons.remove("Karl");
		System.out.println("Karl nach remove enthalten?" + persons.containsKey("Karl"));
		
		//Alles O.K., keine exception. get() gibt an dieser Stelle null zurück
		System.out.println(persons.get("Grantelbart"));
		
		//Zugriff auf null-Objekt würde exception werfen
//		persons.get("Grantelbart").increaseAge();
		
		//boolean kann hier nicht als primitiver Datentyp benutzt werden
		// -> Objektorientierter Gegenpart Boolean (großgeschrieben)
		Map<String, Boolean> personsHungryMap = new HashMap<>();
		personsHungryMap.put(karl.name, karl.hungry);
		personsHungryMap.put(lutz.name, lutz.hungry);
		personsHungryMap.put(lotta.name, lotta.hungry);
		

	}

}
