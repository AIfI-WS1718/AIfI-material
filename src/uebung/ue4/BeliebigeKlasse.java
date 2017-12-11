package uebung.ue4;

public class BeliebigeKlasse {
	// Eine statische Variable
	private static int anzahlDerObjekte = 0;
	// Eine nicht statische Variable
	private int zahl = 0;
	// Der Konstruktor
	public BeliebigeKlasse (){
		anzahlDerObjekte ++;
		this.zahl ++;
	}
	// Eine statische Methode
	public static int wieVieleObjecte (){
		return anzahlDerObjekte ;
	}
	// Eine nicht statische Methode
	public int getZahl (){
		return this.zahl ;
	}
}
