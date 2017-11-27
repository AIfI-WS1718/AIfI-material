package uebung.uebung05;

public class fakulaet {
	public static void main(String[] args) {
		System.out.println(fak(5));
	}


	public static long fak(long zahl) {
		if (zahl==0) {
			return 1;
		}
		else {
			return fak(zahl-1)*zahl;
		}
	}
}