package uebung.ue4;

public class Farm {

	public static void main(String[] args) {
//		Cow berta = new Cow();
//		berta.name = "Berta";
//		Cow helga = new Cow();
//		helga.name = "Helga";
//		Cow heidi = new Cow();
//		heidi.name = "Heidi";
		int cowcounter = 0;
		Cow berta = new Cow("Berta");
		Cow helga = new Cow("Helga");
		Cow heidi = new Cow("Heidi");
		System.out.println("Namen: " + berta.getName() + ", " + helga.getName() + " und " + heidi.getName() + ".");
		System.out.println( Cow.getCowCount()+  " Kuehe vorhanden.");
	}

}
