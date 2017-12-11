package uebung.ue8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Aufgabe1 {
	public static void main(String[] args) {
		List<String> stringlist = new ArrayList<>();
		int n = 1000000;
		
		for(int i=0;i<10*n;i++) {
			stringlist.add("lol");
		}
		long timestamp = System.currentTimeMillis();
		System.out.println(stringlist.get(5*n));
		long diff = (System.currentTimeMillis()-timestamp);
		System.out.println(diff);
		
		timestamp = System.currentTimeMillis();
		stringlist.add(1*n, "opfer");
		stringlist.add(5*n,"opfer");
		stringlist.add(10*n-1, "täter");
		diff = System.currentTimeMillis() - timestamp;
		System.out.println(diff);
		
		System.out.println("Nun die LinkedList:");
		
		stringlist = new LinkedList<>();
		for(int i=0;i<10*n;i++) {
			stringlist.add("lol");
		}
		timestamp = System.currentTimeMillis();
		System.out.println(stringlist.get(5*n));
		diff = (System.currentTimeMillis()-timestamp);
		System.out.println(diff);
		
		timestamp = System.currentTimeMillis();
		stringlist.add(1*n, "opfer");
		stringlist.add(5*n,"opfer");
		stringlist.add(10*n-1, "täter");
		diff = System.currentTimeMillis() - timestamp;
		System.out.println(diff);
		
	}

}
