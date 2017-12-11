package uebung.ue8;

import java.util.ArrayList;
import java.util.List;

public class Person {
	String name;
	int age;

	public Person(String name, int age){
		this.name = name;	
		this.age = age;	
	}
	public void celebrateBirthday(){  this.age++;  }
	public String toString(){  return name + " ist " + age + " Jahre alt.";  }

	public static void main(String[] args) {
		List<Person> household = new ArrayList<>();
		Person p1 = new Person("Peter", 45);
		Person p2 = new Person("Paula", 17);
		Person p3 = new Person("Petra", 60);
		household.add(p1);
		household.add(p2);
		household.add(p3);
		for(Person p : household){
			p.celebrateBirthday();
			System.out.println(p.toString());
		}
		System.out.println();
		household.remove(2);
		for(Person p : household){
			System.out.println(p.toString());
		}
		System.out.println();
		household.add(1, p3);
		for(Person p : household){
			System.out.println(p.toString());
		}
		System.out.println(household.size());
		System.out.println(household.isEmpty());
//		household.clear();
//		System.out.println(household.isEmpty());
		if (household.contains(p1)) {
			household.remove(p1);
		}
		
		for(Person p : household){
			System.out.println(p.toString());
		}
		System.out.println();
		
		household.remove(p1);
		if (household.contains( p1 )) {
			 System.out.println( household.remove( p1 )); // ergibt true
			// gibt false zurück, wenn p1 nicht enthalten ist
		}

		int indexOfP2 = household.indexOf(p2);
		System.out.println( indexOfP2 ); // ergibt 0
		household.remove( indexOfP2 );
		/* der doppelte Aufruf dieser Zeilen würde eine
		 * ArrayIndexOutOfBoundsException ergeben, weil indexOf(Object o)
		 * für ein nicht vorhandenes Element -1 zurückgibt */

		for (Person person : household){
			System.out.println( person.toString() );
		}
		System.out.println( household.size() ); // ergibt 2


		
	}
}
