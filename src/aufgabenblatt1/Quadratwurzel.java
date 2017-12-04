package aufgabenblatt1;

public class Quadratwurzel {

	public static void main(String[] args) {
		double a = 120;
		double x0 = a;
		int versuche = 0;
		double epsilon = 0.0001;
		
		do {
			x0=(x0+a/x0)/2;
			versuche++;
		} while (x0*x0-a > epsilon);
		System.out.println("Ergebnis :" + x0);
		System.out.println("Versuche :" + versuche);
		System.out.println("Zum Vergleich mit Math.sqrt(a): " + Math.sqrt(a));
	}
}
