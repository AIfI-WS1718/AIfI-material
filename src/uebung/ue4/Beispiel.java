package uebung.ue4;

public class Beispiel {

	public static void main(String[] args) {
		//Erzeuge drei Objekte
		BeliebigeKlasse hans = new BeliebigeKlasse();
		BeliebigeKlasse peter = new BeliebigeKlasse();
		BeliebigeKlasse ina = new BeliebigeKlasse();
		// Gebe die Zahl der Objekte aus
		System.out.println (hans.getZahl());
		System.out.println (peter.getZahl());
		System.out.println (ina.getZahl());
		// Gebe die anzahl der Objekte aus
		System.out.println (BeliebigeKlasse. wieVieleObjecte());
	}
}
