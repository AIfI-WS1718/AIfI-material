package uebung4;

public class Farm {
	
	

	public static void main(String[] args) {
		
		 
		
		Farmer farmer = new Farmer();
		
		Cow cow1 = new Cow("Jona");
		
		
		Cow cow2 = new Cow("Bila");
		
		Cow cow3 = new Cow("Kolja");
		
		System.out.println(cow2.hungry);
		
		farmer.feedCow(cow2);
		
		System.out.println(cow2.hungry);
		
		
		System.out.println(cow1.getName());
		System.out.println(cow2.getName());
		System.out.println(cow3.getName());
		System.out.println(Cow.getCowCounter());
		
		Calf calf1 = cow3.giveBirth("Borya");
		System.out.println(calf1.getName());
		
		Calf calf2 = cow1.giveBirth("Valera");
		System.out.println(calf2.getName());
		
		
		
		
	}
}
