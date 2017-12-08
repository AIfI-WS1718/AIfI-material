package uebung6;

public class Recursive {

	public static void main(String[] args) {
		int fac = recursiveMethode(10);
		// recursiveMethode(5);
		// recursiveMethode(4);
		// recursiveMethode(3);
		// recursiveMethode(2);
		// recursiveMethode(1);

		System.out.println(fac);

	}

	static int recursiveMethode(int n) {
		if (n == 0 || n == 1) {
			return 1;
		} else {
			int facTeil = (n - 1);
			int res = recursiveMethode(facTeil);
			return res * n;
		}
	}

}
