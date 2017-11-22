package aufgabenblaetter.blatt2;

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
		a.setZaehler((-1)*a.zaehler);
	}
	
	public static void invert(Rational a) {
		double b,c;
		b = a.nenner;
		c = a.zaehler;
		a.setZaehler(b);
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

	// TODO bearbeite hier die Aufgabe 1.1 aus dem freiwilligen Aufgabenblatt 2 und commite+pushe deine Loesung in deinem Branch. Viel Spaß!
	
	}
}