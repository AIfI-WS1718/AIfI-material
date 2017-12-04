package uebung.ue4;

public class Farm {

	public static void main(String[] args) {
		Cow[] cows = new Cow[5];
		cows[0] = new Cow ("Berta" );
		cows[1] = new Cow ("Hilde" );
		cows[2] = new Cow ("Miltank ");
		
		for(int i = 0; i < cows.length; i++) {
			if(cows[i] != null) {
				System.out.println(cows[i].getName());
			}
		}
		System.out.println(Cow.getCowCount() + " Kühe leben in der Farm.");
		
		System.out.println(cows[0].getName() + " Hunger:" + cows[0].isHungry());
		Farmer farmer = new Farmer();
		farmer.feedCow(cows[0]);
		System.out.println(cows[0].getName() + " Hunger:" + cows[0].isHungry());
	}

}
