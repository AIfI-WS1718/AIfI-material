package aufgabenblatt2;

public class Rational {
	private static Rational zero = new Rational(0,1);
	
	private int Zähler;
	private int Nenner;
	
	Rational() {
		Zähler = 0;
		Nenner = 1;
	}

	void printRational() {
		System.out.println("Zähler " + "Nenner");
	}
}
