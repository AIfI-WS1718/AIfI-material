package ue4;

public class Farm {
	public static void main(String[] args) {
		
		
		Cow cow1 = new Cow("Ulyssos");
		Cow cow2 = new Cow("Maximus");
		Cow cow3 = new Cow("Mao");
		
		
		
		System.out.println(cow1.getName());
		System.out.println(cow2.getName());
		System.out.println(cow3.getName());
		
		
		
		System.out.println(Cow.getCount() + " Kühe in der Farm");
		
		
		System.out.println(cow1.hungry);
		System.out.println(cow2.hungry);
		System.out.println(cow3.hungry);
		
		Farmer farmer = new Farmer();
		
		farmer.feedCow(cow1);
		farmer.feedCow(cow2);
		farmer.feedCow(cow3);
		
		System.out.println(cow1.hungry);
		System.out.println(cow2.hungry);
		System.out.println(cow3.hungry);
		
		
	}
}

