package UE4;

public class Farm {
	public static void main(String[] args) {
		Cow berta = new Cow("Berta");
		Cow anton = new Cow("Anton");
		Cow jojo = new Cow("Jojo!");
		System.out.println(berta.getName() + anton.getName() + jojo.getName() + Cow.getCowCount());
	}
}
