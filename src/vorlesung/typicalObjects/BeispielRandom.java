package vorlesung.typicalObjects;

import java.util.Random;

public class BeispielRandom {

	public static void main(String[] args) {
		int offset = 100;
		
		long seed = 456;
		Random r1 = new Random(seed);
		Random r2 = new Random(seed);
		
		for (int i=0; i<offset; i++) {
			r1.nextDouble();
		}
		
		System.out.println("Zwei Zufallssequenzen, die um " + offset + " Einträge verschoben sind:");
		for (int i=0; i<10; i++) {
			System.out.println(r1.nextDouble() + ", " + r2.nextDouble());
		}
		// in diesem Fall werden je 5 Zufallszahlen erzeugt.
	}

}
