package ue8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class lists {
	
	public static void main(String[] args) {
		List<String> strings = new ArrayList<String>();
		
	
		int n = 10000;
		
		for (int i = 0; i < 10 * n; i++) {
			strings.add("Nummer " + i);
		}
		
		
		
		long startTime = System.currentTimeMillis();
		System.out.println(strings.get(n*5-1));
		long endTime = System.currentTimeMillis();
		
		long timeResulting = endTime - startTime;
		System.out.println(timeResulting + " milliseconds elapsed");
	}
	
	
	

}

