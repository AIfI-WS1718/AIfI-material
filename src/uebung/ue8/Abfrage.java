package uebung.ue8;

import java.util.ArrayList;

public class Abfrage {

	public static void main(String[] args) {
		Person p1 = new Person("Hans", 51);
		System.out.println(p1.toString());
		p1.altern();
		System.out.println(p1.toString());
		
		ArrayList<Person> list = new ArrayList<>();
		
		Person p2 = new Person("Susie", 60);
		list.add(p2);
		Person p3 = new Person("Heidi", 19);
		list.add(p3);
		Person p4 = new Person(2, "Nemo");
		list.add(p4);
		
		for (Person p:list) {
			System.out.println(p.toString());
			p.altern();
			System.out.println(p.toString());
		}
		
		Person p5 = new Person("Klara", 26);
		list.add(0, p5);
		System.out.println(list.get(0).toString());
		
		Person p6 = new Person("Uwe", 40);
		list.add(4, p6);
		System.out.println(list.size());
		
		System.out.println("Leer? " + list.isEmpty() + ".");
		
		if (list.contains(p5)) {
			list.remove(list.indexOf(p5));
		}
		
		if (list.contains(p5)) {
			list.remove(list.indexOf(p5));
		}
		
		
		
		
	}
}
