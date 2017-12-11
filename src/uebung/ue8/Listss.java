package uebung.ue8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Listss {

	public static void main(String[] args) {

		List<String> arraylist = new ArrayList<>();
		List<String> linkedlist = new LinkedList<>();

		long n = 465000;
		for (long l = 0; l < 10 * n; l++) {
			arraylist.add("aString" + l);
			linkedlist.add("lString" + l);
			System.out.println("Aktuelle Position: " + l);
		}

		double t1 = System.currentTimeMillis();
		System.out.println(arraylist.get((int) (5 * n)));

		double t2 = System.currentTimeMillis();
		System.out.println("ArrayList: Die Abfrage dauerte " + (int) (t2 - t1) + " ms.");

		t1 = System.currentTimeMillis();
		System.out.println(linkedlist.get((int) (5 * n)));

		t2 = System.currentTimeMillis();
		System.out.println("LinkedList: Die Abfrage dauerte " + (int) (t2 - t1) + " ms.");

		t1 = System.currentTimeMillis();
		arraylist.add((int) (2 * n), "AAnfang");
		t2 = System.currentTimeMillis();
		System.out.println("ArrayList: Das Hinzufügen dauerte (Anfang) " + (int) (t2 - t1) + " ms.");

		t1 = System.currentTimeMillis();
		arraylist.add((int) (5 * n), "AMitte");
		t2 = System.currentTimeMillis();
		System.out.println("ArrayList: Das Hinzufügen dauerte (Mitte) " + (int) (t2 - t1) + " ms.");

		t1 = System.currentTimeMillis();
		arraylist.add((int) (10 * n), "AEnde");
		t2 = System.currentTimeMillis();
		System.out.println("ArrayList: Das Hinzufügen dauerte (Ende) " + (int) (t2 - t1) + " ms.");

		t1 = System.currentTimeMillis();
		linkedlist.add((int) (2 * n), "LAnfang");
		t2 = System.currentTimeMillis();
		System.out.println("LinkedList: Das Hinzufügen dauerte (Anfang) " + (int) (t2 - t1) + " ms.");

		t1 = System.currentTimeMillis();
		linkedlist.add((int) (5 * n), "LMitte");
		t2 = System.currentTimeMillis();
		System.out.println("LinkedList: Das Hinzufügen dauerte (Mitte) " + (int) (t2 - t1) + " ms.");

		t1 = System.currentTimeMillis();
		linkedlist.add((int) (10 * n), "LEnde");
		t2 = System.currentTimeMillis();
		System.out.println("LinkedList: Das Hinzufügen dauerte (Ende) " + (int) (t2 - t1) + " ms.");

	}

}
