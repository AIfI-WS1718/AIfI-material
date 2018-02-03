package uebung.ue10;

public class MyWurzel {

	public static String sqrt(int n) {
		int sqr = 0;
		int result = 0;
//			for (; result < n; sqr++) {
//			result = sqr * sqr;
//		}
		do {
			sqr++;
			result = sqr * sqr;
		   }
		while (result < n);
		if (result == n) {
			return "Die Wurzel aus " + n + " ist " + sqr;
		} else {
			return "Keine Wurzel f�r " + n + " gefunden. Die n�chst gr��ere Zahl mit einer "
					+ "Wurzel in den nat�rlichen Zahlen ist " + result + ". Die Wurzel ist " + sqr;
		}
	}
}
