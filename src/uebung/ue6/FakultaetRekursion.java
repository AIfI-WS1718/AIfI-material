package uebung.ue6;

public class FakultaetRekursion {
	public static void main (String[] args) {
		int m = 0;
		System.out.println("Das Ergbnis von " + m + "! ist " + fakultaet(m) + ".");
	}
	
	public static long fakultaet (int n) {
		if (n==1 || n==0) {
			return 1;
		}
		else {
			long erg = n * fakultaet(n-1);
			return erg;
		}
	}
}
