package uebung.ue8;

import java.util.ArrayList;
import java.util.List;

public class Aufgabe2 {
	public static void main(String[] args) {
		Person bob = new Person("bob",14);
		System.out.println(bob.toString());
		bob.incrementAge();
		System.out.println(bob.toString());
		
		List<Person> personengruppe = new ArrayList<>();
		
		Person bob1 = new Person("Bob1",1);
		personengruppe.add(bob1);
		personengruppe.add(new Person("Bob2",2));
		personengruppe.add(new Person("Bob3",3));
		
		for(Person mustermann: personengruppe) {
			mustermann.incrementAge();
		}
		
		personengruppe.remove(1);
		System.out.println("Ende:");
		for(Person mustermann: personengruppe) {
			System.out.println(mustermann.toString());
		}
		
		// AT b)
		
		personengruppe.add(0,new Person("derneueBob",5));
		System.out.println("<Personengruppe>");
		for(Person mustermann: personengruppe) {
			System.out.println(mustermann.toString());
		}
		System.out.println("<|Personengruppe>");
		

		System.out.println(personengruppe.size());

		// AT c)
		//personengruppe.clear();
		if(personengruppe.contains(bob1)) {
			//personengruppe.remove(bob1);
		}
		personengruppe.remove(new Person());
		
		int hisindex = personengruppe.indexOf(bob1);
		personengruppe.remove(hisindex);
		

		
	}
}
