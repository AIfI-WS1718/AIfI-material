package aufgabenblaetter.blatt2;

public class ImmutableRational {
	
	public double z�hler;
	public double nenner;
	
	/* gl 28.11. Eigentlich br�cuhte man die anderen Methoden von Rational auch, damit wirklich 
	 * die gleiche Funktionalit�t bereitgestellt wird.
	 */
	public ImmutableRational () {
		z�hler = 4.0;
		nenner = 2.0;
	}

	public static void main(String[] args) {
		
		ImmutableRational immutablerational1 = new ImmutableRational ();
		System.out.println("Funktion Reduce");
		immutablerational1.reduce();
		System.out.println("Z�hler nach Reduce:" + immutablerational1.z�hler); //Check ob Wert von Z�hler/Nenner ge�ndert
		System.out.println("Nenner nach Reduce:" + immutablerational1.nenner);

	}
	
	public void reduce () {
		
		System.out.println(z�hler);
		System.out.println(nenner);
		double z=z�hler;
	    double n=nenner;
	    while (z!=n) {
	            if (z<n) n = n-z;
	            else z = z-n;
	    }
	    System.out.println("ggT: " + z);
	    System.out.println(z�hler + "/" + nenner +  " == " + (z�hler/z)+"/"+ (nenner/n));
	    z�hler = z�hler/z;
	    nenner = nenner/n;	
	   
	  }
}

