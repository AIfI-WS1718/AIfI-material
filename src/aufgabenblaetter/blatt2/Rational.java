package aufgabenblaetter.blatt2;

/*
 * Feedback gl 27.11.
 * Gut! Sauberer Stil und funktional so weit die Aufgaben bearbeitet wurden.
 * Leider nur Aufgabe 1.1.1 bis 1.1.8 bearbeitet.
 */
class Rational {
	
	public double zaehler, nenner;
	Rational() {
		this.zaehler = 0.0;
		this.nenner = 1.0;
	}
	
	Rational(double a, double b) {
		this.zaehler = a;
		this.nenner = b;
	}
	
	public double printRational() {
		return zaehler/nenner;
	}
	
	public void setZaehler(double a) {
		zaehler = a;
	}
	
	public void setNenner(double a) {
		nenner = a;
	}
	
	public static void negate(Rational a) {
		a.setZaehler((-1)*a.zaehler); // gl 27.11.: Es geht sogar noch kürzer: a.zaehler = -a.zaehler; Den Setter benutzt man eher von außerhalb dieser Klasse.
	}
	
	public static void invert(Rational a) {
		double b,c;
		b = a.nenner;
		c = a.zaehler;
		a.setZaehler(b); // gl 27.11. Die Setter benutzt man meißt nur, wenn man von anderen Klassen ausgehend auf Variablen dieser Klasse zugreifen möchte.
		a.setNenner(c);
	}
	
	public static void main (String[] args) {
		Rational zahl = new Rational();
		zahl.setNenner(8);
		zahl.setZaehler(2);
		System.out.println("zahl: " + zahl.printRational());
		negate(zahl);
		System.out.println("zahl negativ: " + zahl.printRational());
		invert(zahl);
		System.out.println("zahl invertiert: " + zahl.printRational());

	// TODO bearbeite hier die Aufgabe 1.1 aus dem freiwilligen Aufgabenblatt 2 und commite+pushe deine Loesung in deinem Branch. Viel SpaÃŸ!
	
	}
}