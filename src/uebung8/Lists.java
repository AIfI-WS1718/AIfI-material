package uebung8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists {
   
	public static void main(String[] args) {
	int n = 1000;	
	List<String> myArrayList = new ArrayList<>();
	//List<String> myArrayList = new LinkedList<>();
	
	for (int counter = 1; counter < n*10; counter++) {
		myArrayList.add("string");
	}
	long start = System.currentTimeMillis();
	myArrayList.get(5*n);
	long finish = System.currentTimeMillis();
	long timeDifference = finish - start;
	System.out.println(timeDifference);
	
	start = System.currentTimeMillis();
	myArrayList.add(n, "string2");
	myArrayList.add(5*n, "string2");
	myArrayList.add(9*n, "string2");
	finish = System.currentTimeMillis();
	timeDifference = finish - start;
	System.out.println(timeDifference);
}
}
