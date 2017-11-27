package aufgabenblaetter.blatt2;

/* 
 * Feedback, gl, 27.11.: 
 * Gut! Sauberer Stil, Code meist funktional aber manchmal l�nger als n�tig und manchmal falscher R�ckgabetyp
 */
class Rational {
	
	public static void main(String[] args) {
		Rational r = new Rational();
		r.setzaehler(10);
		r.setnenner(20);
		r.printRational();
		r.toDouble();
		r.add(10, 20);
		Rational rl = new Rational(3,6);
		rl.printRational();
		r.reduce();
		r.invert();
		r.printRational();
		r.negate();
		r.printRational();
		
	}

	// gl 27.11. private w�re sch�ner
	int zaehler;
	int nenner;
	

	public Rational () {
		this.zaehler=0;
		this.nenner=1;
	}
	public Rational (int z, int n) {
		this.zaehler=z;
		this.nenner=n;
	}
	public void printRational() {
	System.out.println(zaehler + "/" + nenner);
	}
	// gl 27.11. Auch f�r Setter benutzt man in Java camelCase, also setZaehler und setNenner.
	public void setnenner(int nenner) {
		this.nenner=nenner;
	}
	public void setzaehler(int zaehler) {
		this.zaehler=zaehler;
	}
	// gl 27.11. Wenn man beide Vorzeichen umkehrt, hebt sich das wieder auf. Besser: Nur im Z�hler negative Vorzeichen erlauben und nur dort umkehren.
	public void negate() {
		this.nenner = -this.nenner;
		this.zaehler = -this.zaehler;
	}
	// gl 27.11. gut!
	public void invert() {
		int u;
		u = this.nenner;
		this.nenner = this.zaehler;
		this.zaehler = u;
	}
	public void toDouble() {
		// gl 27.11. Du brauchst Z�hler und Nenner nicht in neue Variablen zu kopieren, wert = this.zaehler/this.nenner reicht v�llig aus. Diese Berechnung ver�ndert zaehler und nenner nicht.
		double da;
		double db;
		double wert;
		da = this.zaehler;
		db = this.nenner;
		wert = da/db;
		System.out.println("Doublewert: " + wert); // gl 27.11. In diesem Fall sollte der double wert als double zur�ckgegeben werden. Damit kann man besser weiterrechnen als mit der Ausgabe auf die Konsole.
	}
	public void reduce () {
		int a,b;
		a=this.zaehler;
		b=this.nenner;
		if (a<b && b%a == 0) {
			b=b/a;
			a=a/a;
		}
		else if (a>b && a%b == 0) {
			a=a/b;
			b=b/b;
		}
		// gl 27.11. Hier m�sste man theoretisch alle nat�rlichen zahlen <a/2 und <b/2 ausprobieren, um wirklich alle Br�che richtig k�rzen zu k�nnen. Das ginge mit ggT nat�rlich besser.
		else if (a%2 == 0 && b%2 ==0) {
			a=a/2;
			b=b/2;
		}
		
		System.out.println("Gekürtzt: " + a + "/" + b); // gl 27.11. Sch�ner w�re es, wenn man den gek�rzten Bruch auch als Bruch-Objekt zur�ckgibt.
	}
	public void add(int v, int w) { // gl 27.11. Eigentlich sollte ein Rational-Objekt �bergeben werden und nicht einzelne Z�hler und Nenner.
		this.zaehler += v;
		this.nenner += w;
		System.out.println("Add: " + this.zaehler + "/" + this.nenner);
	}
}
