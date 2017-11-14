package uebung.ue2;

class TotallyOverload {

	static int add(int a, int b) {
		return a+b;
	}
	
	static int add(int a) {
		return ++a;
	}
	
	static double add(double a, double b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		int zahl = 17;
		int nocheinezahl = 12;
		double pi = Math.PI;
		double d = 5.3E2;

		// Was erzeugen die folgenden drei Ausgaben (inkl. Datentyp)?
		System.out.println(add(zahl, nocheinezahl)); // 29, int
		System.out.println(add(zahl)); // 18 int
		System.out.println(add(pi, d)); //530 +pi double

		// Fuer Spezialisten: Was kommt hier heraus?
		System.out.println(add(add(add(3) + add(4, 5), 2), 6.2)); // 22.2 double
	}

}
