package uebung.ue8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists {

	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<>();
		List<String> linkedList = new LinkedList<>();
		int n = 1000000;
		
		System.out.println("AwwayList");
		long lastTimeMillis = System.currentTimeMillis();
		for(int i=0; i<10*n; i++){
			arrayList.add("Keks");
		}
		System.out.println("10*n Eintraege anlegen: " + (System.currentTimeMillis()  - lastTimeMillis) + "ms");
		lastTimeMillis = System.currentTimeMillis();
		
		arrayList.get(5 * n);
		System.out.println("5*n. Element ausgeben: " + (System.currentTimeMillis() - lastTimeMillis) + "ms");
		lastTimeMillis = System.currentTimeMillis();
		
		arrayList.add(0, "Waffel");
		System.out.println("Neues Element am Anfang anlegen: " + (System.currentTimeMillis() - lastTimeMillis) + "ms");
		lastTimeMillis = System.currentTimeMillis();
		
		arrayList.add(n, "Schockowaffel");
		System.out.println("Neues Element an Platz n anlegen: " + (System.currentTimeMillis() - lastTimeMillis) + "ms");
		lastTimeMillis = System.currentTimeMillis();
		
		arrayList.add(10*n, "Kokoswaffel");
		System.out.println("Neues Element am Ende anlegen: " + (System.currentTimeMillis() - lastTimeMillis) + "ms");
		lastTimeMillis = System.currentTimeMillis();
		
	}

}
