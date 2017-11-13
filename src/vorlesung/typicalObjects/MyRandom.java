package vorlesung.typicalObjects;

import java.util.Random;

public class MyRandom {

	public static void main(String[] args) {
		Random random = new Random();
		Random random2 = new Random();
		random.setSeed(1234);
		random2.setSeed(1234);
		
		for (int i=0; i<5; i++) {
			System.out.println("random1: " + random.nextDouble());
			System.out.println("random2: " + random2.nextDouble());
			System.out.println("random2: " + random2.nextDouble());
			System.out.println("---------------");
		}
	}

}
