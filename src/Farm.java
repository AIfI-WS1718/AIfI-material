
public class Farm {

	public static void main(String [] args) {
		
		
		Cow cow1 = new Cow ("a");
		Cow cow2 = new Cow ("b");
		Cow cow3 = new Cow ("c");
		
		
		System.out.println("Kuh1: "+ cow1.getName() + "  Kuh2: "+ cow2.getName()+ "  Kuh3: " +  cow3.getName());
		System.out.println("Anzahl der Kühe: " + Cow.getCowCounter());
		System.out.println("Hunger: " + cow2.getHungry());
		
		System.out.println(cow1.getName() + " Hunger: "+ cow1.isHungry());
		Farmer farmer = new Farmer(); 
		farmer.feedCow(cow1); 
		System.out.println(cow1.getName() + "Hunger: " + cow1.isHungry());
		
		Calf calf1 = cow3.giveBirth("Kuh2"); 
		System.out.println(calf1.getName()); 
	}
}
