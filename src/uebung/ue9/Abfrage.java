package uebung.ue9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Abfrage {

	public static void main(String[] args) {
		Person p1 = new Person("Hans", 51);
		System.out.println(p1.toString());
		p1.altern();
		System.out.println(p1.toString());

		ArrayList<Person> list = new ArrayList<>();

		Map<String, Person> persons = new HashMap<>();
		
		Person p2 = new Person("Susie", 60);
		list.add(p2);
		Person p3 = new Person("Heidi", 19);
		list.add(p3);
		Person p4 = new Person(2, "Nemo");
		list.add(p4);
		
		persons.put("Hans", p1);
		persons.put("Susie", p2);
		persons.put("Heidi", p3);
		persons.put("Nemo", p4);
		


		for (Person p : list) {
			System.out.println(p.toString());
			p.altern();
			System.out.println(p.toString());
		}

		Person p5 = new Person("Klara", 26);
		list.add(0, p5);
		persons.put("Klara", p5);
		System.out.println(list.get(0).toString());

		Person p6 = new Person("Uwe", 40);
		list.add(4, p6);
		persons.put("Uwe", p6);
		System.out.println("Größe der Liste: " + list.size());

		System.out.println("Leer? " + list.isEmpty() + ".");

		System.out.println("Größe der Map: " + persons.size());
		
		System.out.println("Heidi hungrig? " + persons.get("Heidi").hungry);
		persons.get("Heidi").setHungry(false);
		System.out.println("Heidi hungrig? " + persons.get("Heidi").hungry);

		if (list.contains(p5)) {
			list.remove(list.indexOf(p5));
		}

		if (list.contains(p5)) {
			list.remove(list.indexOf(p5));
		}
		
		System.out.println("--------");

		for (Person p : persons.values()) {
			System.out.println("Aktuelle Person: " + p.name + ". Ist " + p.name + " hungrig? " + p.hungry);
		}
		
		persons.remove("Uwe");
		
		System.out.println("Ist Uwe als Key noch vorhanden? " + persons.containsKey("Uwe"));
		
		System.out.println(persons.get("Grantelbart"));
	}
}
