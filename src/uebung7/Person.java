package uebung7;

import java.util.ArrayList;
import java.util.List;

public class Person {
	
	String name; 
	int alter; 
	
	public Person (String name, int alter) {
		this.name = name; 
		this.alter = alter; 
	}
	
	public String toString() {
		return ("Name: " + name + ", Alter: " + alter); 
	}
	
	public void alterErhoehen() {
		this.alter++; 
	}
	
	
	
	public static void main(String [] args) {
		List<Person> arrayList = new ArrayList<>(); 
		Person p1 = new Person("Hans", 24); 
		Person p2 = new Person("Helena", 20); 
		Person p3 = new Person("Nina", 14);
		Person p4 = new Person("Andi", 20); 
		
		arrayList.add(p1); 
		arrayList.add(p2); 
		arrayList.add(p3);
		arrayList.add(0, p4);
		
		for (Person p: arrayList) {
			p.alterErhoehen(); 
			System.out.println(p.toString()); 
		}
		
		arrayList.remove(2);

		
		for (Person p : arrayList) {
			System.out.println(p.toString());
		}
		
		
	
	}
}
