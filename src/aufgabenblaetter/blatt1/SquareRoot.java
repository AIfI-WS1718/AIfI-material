package aufgabenblaetter.blatt1;

public class SquareRoot {

	public static void main(String[] args) {
		final double a = 25;
		double b = a/2;
		double f = 0.0001;
		double e = 0;
		double d = a;
		
		while(d > f) {
			e = (b + (a/b)) / 2;
			System.out.println("Das Ergebnis lautet: " + e);
			d = Math.abs(e - b);
			b = e;
		}
	}

}
