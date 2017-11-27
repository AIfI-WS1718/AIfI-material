package uebung04;

public class Farm {

	public static void main(String[] args) {

		Cow cow1 =new Cow ("Berta" );
		Cow cow2 =new Cow ("Hilde" );
		Cow cow3 =new Cow ("Miltank ");
		
		Calf calf1 = new Calf("Fred", cow1);
		
		System.out.println(calf1.getName());
		
		System.out.println(cow1.getName());
		System.out.println(cow2.getName());
		System.out.println(cow3.getName());
		System.out.println(Cow.getCowCount() + " K�he leben in der Farm.");
		
		System.out.println(cow1.getName() + " Hunger: " + cow1.isHungry());
		Farmer farmer = new Farmer();
		farmer.feedCow(cow1);
		System.out.println(cow1.getName() + " Hunger: " + cow1.isHungry());
	}

}
