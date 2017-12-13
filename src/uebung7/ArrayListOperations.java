package uebung7;

import java.util.ArrayList;
import java.util.List; 
import java.util.LinkedList; 

public class ArrayListOperations {
	
	public static void main(String [] args) {
		
		List<String> arrayList = new ArrayList<>();
		List<String> linkedList = new LinkedList<>();
	
		int n = 4;
		System.out.println("Arraylist");
		long lastTimeMillis = System.currentTimeMillis();
		
		for(int i = 0; i < Math.pow(10, n); i++) {
			linkedList.add("Keks");
		}
		
		System.out.println("10*n Einträge anlegen: " +(System.currentTimeMillis() - lastTimeMillis) + "ms");
		
		lastTimeMillis = System.currentTimeMillis(); 
		linkedList.get(5*n);
		
		System.out.println("5*n Element ausgeben: " + (System.currentTimeMillis() - lastTimeMillis) + "ms");
		lastTimeMillis = System.currentTimeMillis();
		
		linkedList.add(0, "Schokowaffel");
		System.out.println("Neues Element am Anfang legen: " + (System.currentTimeMillis()- lastTimeMillis) + "ms");
		lastTimeMillis = System.currentTimeMillis();
		
		linkedList.add(n, "Kokoseis");
		System.out.println("Neues Element an n-te Stelle legen: " + (System.currentTimeMillis()- lastTimeMillis) + "ms");
		lastTimeMillis = System.currentTimeMillis();
	
	}
}
