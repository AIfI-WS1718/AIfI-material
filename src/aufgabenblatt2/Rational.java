package aufgabenblatt2;

public class Rational {
	private static Rational zero = new Rational(0,1);
	
	private int Z�hler;
	private int Nenner;
	
	Rational() {
		Z�hler = 0;
		Nenner = 1;
	}

	void printRational() {
		System.out.println("Z�hler " + "Nenner");
	}
}
