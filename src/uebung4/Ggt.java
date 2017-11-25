package uebung4;

public class Ggt {
	
	 public static int ggt( int zaehler, int nenner ) {
		 while (zaehler != 0) {
			 if (nenner > zaehler) {
			       nenner = nenner - zaehler;
			     } else {
			       zaehler = zaehler - nenner;
			     }
			   }
			   return nenner;
	 }
	public static void main(String[] args) {
		int nenner = 50;
		int zaehler = 40;
		
		 int ergebnis = ggt(zaehler,nenner);
		
		   System.out.println("Der ggT von "  + nenner + 
		       " und " + zaehler + " ist: " + ergebnis);
	}

}
