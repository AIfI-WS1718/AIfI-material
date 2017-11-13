package uebung.ue3;

public class Quadratwurzel {

	static double a = 36;

	public static void main(String[] args) {

		double startX = a / 2;
		double buffer;

		do {
			
			buffer = startX;
			startX = nextX(a, startX);
		
		} while ((buffer - startX) > 0.0001);

		System.out.println("The root of  " + a + " is " + startX);
	}

	private static double nextX(double a, double x0) {
		return (x0 + a / x0) / 2;
	}

}
