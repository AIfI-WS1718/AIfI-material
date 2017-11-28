package aufgabenblaetter.blatt2;

/*
 * Feedback gl 28.11.
 * Ganz gut. Weitgehend sauberer Stil und funktional, allerdings verwenden die Methoden nicht 
 * die Rational-Objekte, um die es eigentlich ging :-/
 */
public class Rational {

	// gl 28.11. �blicherweise sind Z�hler und Nenner ganzzahlig, also reicht hier auch ein ganzzahliger Datentyp
	private  double z�hler;
	private  double nenner;
	

	public Rational () {
		z�hler = 0.0;
		nenner = 1.0;
	}
	
	public Rational (double z�hler, double nenner) {
		this.z�hler = z�hler;
		this.nenner = nenner;
	}
	
	public static void main(String[] args) {
		
		//Konstruktor 1 ohne Argumente, mit Setter
		System.out.println("Ausgabe Konstruktor 1:");
		Rational rational1 = new Rational (); //rational1 instantiiert
		rational1.setZ�hler(4.0);
		rational1.setNenner(2.0);
		rational1.printRational ();
		
		
		//Konstruktor 2 mit Argumenten, ohne Setter
		System.out.println("Ausgabe Konstruktor 2:");
		Rational rational2 = new Rational (5.0, 1.0); //rational2 instantiiert
		rational2.printRational ();	
		
		//Negate
		System.out.println(" Funktion Negate");
		rational1.negate(rational1.z�hler, rational1.nenner);
		rational2.negate(rational2.z�hler, rational2.nenner);
		
		//System.out.println(rational1.z�hler); // Kontrolle der Werte hinter z�hler, nenner
		//System.out.println(rational1.nenner);
		//System.out.println(rational2.z�hler);
		//System.out.println(rational2.nenner);
		
		//Invert
		System.out.println("Funktion Invert");
		rational1.invert (rational1.z�hler, rational1.nenner);
		rational2.invert (rational2.z�hler, rational2.nenner);
		
		//System.out.println(rational1.z�hler); // Kontrolle der Werte hinter z�hler, nenner
		//System.out.println(rational1.nenner);
		//System.out.println(rational2.z�hler);
		//System.out.println(rational2.nenner);
		
		//toDouble
		System.out.println("Funktion toDouble");
		rational1.todouble(rational1.z�hler, rational1.nenner);
		rational2.todouble(rational2.z�hler, rational2.nenner);
		
		//System.out.println(rational1.z�hler); // Kontrolle der Werte hinter z�hler, nenner
		//System.out.println(rational1.nenner);
		//System.out.println(rational2.z�hler);
		//System.out.println(rational2.nenner);
		
		// reduce
		System.out.println("Funktion Reduce");
		rational1.reduce(rational1.z�hler, rational1.nenner);
		
		
		// add mit Konstruktur 3
		System.out.println("Funktion add");
		Rational rational3 = new Rational (2.5, 1.0);
		rational3.add (rational1.z�hler, rational1.nenner);
	}
	
	
	public void printRational () {
		
		System.out.println("Z�hler: " + z�hler);
		System.out.println("Nenner: " + nenner);
	}
	
	public void setNenner(double nenner) {
		this.nenner = nenner;
	}
	
	public double getNenner() {
		return nenner;
	}
	
	public void setZ�hler(double z�hler) {
		this.z�hler = z�hler;
	}
	
	public double getZ�hler() {
		return z�hler;
	}
	
	/* gl 28.11. Eigentlich sollte die negate Methode an einem Objekt aufgerufen werden und dieses 
	 * ver�ndern. Dann braucht man auch keine �bergabeparameter und das Objekt merkt sich die 
	 * �nderungen, sodass man diese nicht direkt mit System.out.println auf der Konsole ausgeben muss.
	 * Das ist dann auch viel weniger Tipparbeit.
	 */
	private void negate (double z�hler, double nenner) {
	
		System.out.println("Funktion Negate von Z�hler: " + z�hler);
		System.out.println("Funktion Negate von Nenner: " + nenner);
		
		// gl 28.11. Kehrt man das Vorzeichen des Z�hlers und das Vorzeichen des Nenners um, dann ist das Vorzeichen des gesamten Bruchs nicht nicht gleichgeblieben ;-)
		z�hler = -z�hler;
		nenner = -nenner;
		
		System.out.println("Z�hler: " + z�hler);
		System.out.println("Nenner: " + nenner);
		
		// gl 28.11. Das return hier st�rt nicht, ohne es funktioniert das Programm allerdings genau gleich.
		return;
	}
	
	/* gl 28.11. Eigentlich sollte die invert Methode an einem Objekt aufgerufen werden und dieses 
	 * ver�ndern. Wie bei der negate Methode.
	 */ 
	public void invert (double z�hler, double nenner) {
		
		double tausch;
		System.out.println("Funktion Invert:");
		System.out.println("Z�hler: "+ z�hler + " Nenner: "+nenner);
		tausch = z�hler;
		z�hler = nenner;
		nenner = tausch;
		
		System.out.println("Z�hler: " + z�hler + " Nenner: " + nenner);
		return;
	}
	
	/* gl 28.11. Analog zur negate Methode
	 * In Java schreibt man Methodennamen �blicherweise in camelCase. G�nne deiner toDouble Methode doch auch einen H�cker ;-)
	 * Die beiden n�chsten Methoden sind leider zu weit einger�ckt. Das kann man einfach mit Strg+i korrigieren lassen.
	 */
		public double todouble (double z�hler, double nenner) {
			double bruch;
			bruch = z�hler/nenner;
			System.out.println("Bruch: " + z�hler + "/" + nenner );
			return bruch;
		}
		
		// gl 28.11. Analog zur negate Methode. Eigentlich sollte man den gek�rzten Bruch als ein rational-Objekt zur�ckgeben.
		public void reduce (double z�hler, double nenner) {
			
			double z=z�hler;
		    double n=nenner;
		   // double bruch = (z�hler/z)/(nenner/n);
		    // gl 28.11. Sehr sch�n mit ggT implementiert.
		    while (z!=n) {
		            if (z<n) n = n-z;
		            else z = z-n;
		    }
		    System.out.println("ggT: " + z);
		    System.out.println(z�hler + "/" + nenner +  " == " + (z�hler/z)+"/"+ (nenner/n));
		   // return bruch;
		  }
		
		// gl 28.11. Analog zur negate Methode.
		public void add (double z�hler, double nenner) {
			/* gl 28.11. Sch�n, dass du an das Konzept der Getter gedacht hast. Allerdings verwendet 
			 * man die meist nicht innerhalb der Klasse in der man sie definiert hat, denn dort 
			 * sind sowieso alle in dieser Klasse definierten Variablen sichtbar. Anstattdessen legt
			 * man Getter an, um die Zugriffsm�glichkeiten aus anderen Klassen heraus zu regeln.
			 */
			z�hler = z�hler + getZ�hler();
			System.out.println("addierter Z�hler: " + z�hler);
			nenner = nenner + getNenner();
			System.out.println("addierter Nenner: " + nenner);
			double summe;
			summe = z�hler/nenner;
			System.out.println("Addition:" + z�hler+ "/" + nenner + " = " + summe);
		}

	
}