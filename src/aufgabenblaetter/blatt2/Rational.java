package aufgabenblaetter.blatt2;

public class Rational {

	private  double zähler;
	private  double nenner;
	

	public Rational () {
		zähler = 0.0;
		nenner = 1.0;
	}
	
	public Rational (double zähler, double nenner) {
		this.zähler = zähler;
		this.nenner = nenner;
	}
	
	public static void main(String[] args) {
		
		//Konstruktor 1 ohne Argumente, mit Setter
		System.out.println("Ausgabe Konstruktor 1:");
		Rational rational1 = new Rational (); //rational1 instantiiert
		rational1.setZähler(4.0);
		rational1.setNenner(2.0);
		rational1.printRational ();
		
		
		//Konstruktor 2 mit Argumenten, ohne Setter
		System.out.println("Ausgabe Konstruktor 2:");
		Rational rational2 = new Rational (5.0, 1.0); //rational2 instantiiert
		rational2.printRational ();	
		
		//Negate
		System.out.println(" Funktion Negate");
		rational1.negate(rational1.zähler, rational1.nenner);
		rational2.negate(rational2.zähler, rational2.nenner);
		
		//System.out.println(rational1.zähler); // Kontrolle der Werte hinter zähler, nenner
		//System.out.println(rational1.nenner);
		//System.out.println(rational2.zähler);
		//System.out.println(rational2.nenner);
		
		//Invert
		System.out.println("Funktion Invert");
		rational1.invert (rational1.zähler, rational1.nenner);
		rational2.invert (rational2.zähler, rational2.nenner);
		
		//System.out.println(rational1.zähler); // Kontrolle der Werte hinter zähler, nenner
		//System.out.println(rational1.nenner);
		//System.out.println(rational2.zähler);
		//System.out.println(rational2.nenner);
		
		//toDouble
		System.out.println("Funktion toDouble");
		rational1.todouble(rational1.zähler, rational1.nenner);
		rational2.todouble(rational2.zähler, rational2.nenner);
		
		//System.out.println(rational1.zähler); // Kontrolle der Werte hinter zähler, nenner
		//System.out.println(rational1.nenner);
		//System.out.println(rational2.zähler);
		//System.out.println(rational2.nenner);
		
		// reduce
		System.out.println("Funktion Reduce");
		rational1.reduce(rational1.zähler, rational1.nenner);
		
		
		// add mit Konstruktur 3
		System.out.println("Funktion add");
		Rational rational3 = new Rational (2.5, 1.0);
		rational3.add (rational1.zähler, rational1.nenner);
	}
	
	
	public void printRational () {
		
		System.out.println("Zähler: " + zähler);
		System.out.println("Nenner: " + nenner);
	}
	
	public void setNenner(double nenner) {
		this.nenner = nenner;
	}
	
	public double getNenner() {
		return nenner;
	}
	
	public void setZähler(double zähler) {
		this.zähler = zähler;
	}
	
	public double getZähler() {
		return zähler;
	}
	
	private void negate (double zähler, double nenner) {
	
		System.out.println("Funktion Negate von Zähler: " + zähler);
		System.out.println("Funktion Negate von Nenner: " + nenner);
		
		zähler = -zähler;
		nenner = -nenner;
		
		System.out.println("Zähler: " + zähler);
		System.out.println("Nenner: " + nenner);
		return;
	}
	
	public void invert (double zähler, double nenner) {
		
		double tausch;
		System.out.println("Funktion Invert:");
		System.out.println("Zähler: "+ zähler + " Nenner: "+nenner);
		tausch = zähler;
		zähler = nenner;
		nenner = tausch;
		
		System.out.println("Zähler: " + zähler + " Nenner: " + nenner);
		return;
	}
	
		public double todouble (double zähler, double nenner) {
			double bruch;
			bruch = zähler/nenner;
			System.out.println("Bruch: " + zähler + "/" + nenner );
			return bruch;
		}
		
		public void reduce (double zähler, double nenner) {
			
			double z=zähler;
		    double n=nenner;
		   // double bruch = (zähler/z)/(nenner/n);
		    while (z!=n) {
		            if (z<n) n = n-z;
		            else z = z-n;
		    }
		    System.out.println("ggT: " + z);
		    System.out.println(zähler + "/" + nenner +  " == " + (zähler/z)+"/"+ (nenner/n));
		   // return bruch;
		  }
		
		public void add (double zähler, double nenner) {

			zähler = zähler + getZähler();
			System.out.println("addierter Zähler: " + zähler);
			nenner = nenner + getNenner();
			System.out.println("addierter Nenner: " + nenner);
			double summe;
			summe = zähler/nenner;
			System.out.println("Addition:" + zähler+ "/" + nenner + " = " + summe);
		}

	
}