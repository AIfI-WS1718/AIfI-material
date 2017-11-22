package ue4;

public class Farm {
	public static void main(String[] args) {
		Cow berta = new Cow("Berta");
		Cow anton = new Cow("Anton");
		Cow jojo = new Cow("Jojo!");
		System.out.println(berta.getName() + "s Hunger:" + berta.getHungry());
		Farmer.feedCow(berta);
		System.out.println(berta.getName() + "s Hunger:" + berta.getHungry());
		Cow kind = jojo.giveBirth("Boii");
		System.out.println(kind.getName());
	}
}
