package uebung.ue5;

public class Farm {

	public static void main(String[] args) {
//		Cow berta = new Cow();
//		berta.name = "Berta";
//		Cow helga = new Cow();
//		helga.name = "Helga";
//		Cow heidi = new Cow();
//		heidi.name = "Heidi";
		int cowcounter = 0;
		Cow berta = new Cow("Berta", cowcounter);
		Cow helga = new Cow("Helga", cowcounter);
		Cow heidi = new Cow("Heidi", cowcounter);
		Calf marie = heidi.giveBirth("Marie", "Heidi");
		System.out.println("Namen: " + berta.getName() + ", " + helga.getName() + " und " + heidi.getName() + ".");
		System.out.println( Cow.cowcounter +  " K�he vorhanden.");
		System.out.println("Kind von Heidi: "+  marie.getName());
	}

}
