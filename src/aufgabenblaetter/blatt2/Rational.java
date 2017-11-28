package aufgabenblaetter.blatt2;

/*
 * Feedback gl 28.11.
 * Kurz und gut. Sauberer Stil und funktional. Leider nicht alle Aufgabenteile bearbeitet.
 */
class Rational {
	// gl 28.11. Üblicherweise sind Zähler und Nenner ganzzahlig. Also wären ganzzahlige Datentypen hier schöner.
	private double zaehler;
	private double nenner;

	public Rational(){
		zaehler = 0;
		nenner = 1;
	}
	public Rational(double zaehler, double nenner) {
		this.setNenner(nenner);
		this.setZaehler(zaehler);
	}
	
	public void printRational() {
		System.out.println(zaehler + " / " + nenner);
	}
	
	public void setZaehler(double zaehler) {
		this.zaehler = zaehler;
	}
	public void setNenner(double nenner) {
		this.nenner = nenner;
	}
	
	public static void main(String[] args) {
		Rational foo = new Rational();
		foo.setZaehler(1);
		foo.setNenner(3);
		foo.printRational();
		foo.add(new Rational(1,2));
		foo.printRational();
	}
	public void invert() {
		double temp = this.zaehler;
		this.setZaehler(this.nenner);
		this.setNenner(temp);
	}
	// gl 28.11. Bravo :-) Viele andere haben das Vorzeichen des Zählers und das des Nenners gedreht. Du hast es nicht nicht richtig ;-)
	public void negate() {
		this.setZaehler(-this.zaehler); // gl 28.11. Es geht sogar noch kürzer : this.zaehler *= -1;
	}
	public double toDouble() {
		return(zaehler/nenner);
	}
	public Rational reduce() {
		Rational reducedRational = new Rational(0,1);
		//TODO
		return(reducedRational);
	}
		
	public void add(Rational bob) {
		Rational resultRational = new Rational();
		resultRational.zaehler = this.zaehler * bob.nenner;
		resultRational.nenner = this.nenner * bob.nenner;
		resultRational.zaehler += bob.zaehler * this.nenner;
		/* gl 28.11. Schön, dass du an das Konzept der Setter gedacht hast. Allerdings verwendet 
		 * man die meist nicht innerhalb der Klasse in der man sie definiert hat, denn dort 
		 * sind sowieso alle in dieser Klasse definierten Variablen sichtbar. Anstattdessen legt
		 * man Setter an, um die Zugriffsmöglichkeiten aus anderen Klassen heraus zu regeln.
		 */
		this.setNenner(resultRational.nenner);
		this.setZaehler(resultRational.zaehler); //wtf    gl 28.11. genau, einfach hier direkt mit der Variable ohne Setter arbeiten
	}
	
}
