package aufgabenblaetter.blatt2;

public class ImmutableRational {
	
	public double zähler;
	public double nenner;
	
	/* gl 28.11. Eigentlich bräcuhte man die anderen Methoden von Rational auch, damit wirklich 
	 * die gleiche Funktionalität bereitgestellt wird.
	 */
	public ImmutableRational () {
		zähler = 4.0;
		nenner = 2.0;
	}

	public static void main(String[] args) {
		
		ImmutableRational immutablerational1 = new ImmutableRational ();
		System.out.println("Funktion Reduce");
		immutablerational1.reduce();
		System.out.println("Zähler nach Reduce:" + immutablerational1.zähler); //Check ob Wert von Zähler/Nenner geändert
		System.out.println("Nenner nach Reduce:" + immutablerational1.nenner);

	}
	
	public void reduce () {
		
		System.out.println(zähler);
		System.out.println(nenner);
		double z=zähler;
	    double n=nenner;
	    while (z!=n) {
	            if (z<n) n = n-z;
	            else z = z-n;
	    }
	    System.out.println("ggT: " + z);
	    System.out.println(zähler + "/" + nenner +  " == " + (zähler/z)+"/"+ (nenner/n));
	    zähler = zähler/z;
	    nenner = nenner/n;	
	   
	  }
}

