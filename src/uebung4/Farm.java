package uebung4;

public class Farm {
	
	

	public static void main(String[] args) {
		
		Farmer farmer = new Farmer();
		
		Cow cow1 = new Cow("Jon");
		
		
		Cow cow2 = new Cow("Bil");
		
		Cow cow3 = new Cow("Kolja");
		
		System.out.println(cow2.hungry);
		
		farmer.feedCow(cow2);
		
		System.out.println(cow2.hungry);
		
		
		System.out.println(cow1.getName());
		System.out.println(cow2.getName());
		System.out.println(cow3.getName());
		System.out.println(Cow.getCowCounter());
	}
}
