package aufgabenblatt2;

public class Rational {
	
	static int Z�hler;
	static int Nenner;
	static int temp;
	
	Rational() {
		Z�hler = 0;
		Nenner = 1;
	}
	
	public static String printRational() {
		return Z�hler + "/" + Nenner;
	}
	
	void setZ�hler(int tempZ�hler) {
		Z�hler = tempZ�hler;
	}
	
	void setNenner(int tempNenner) {
		Nenner = tempNenner;
	}
	
	public static void main(String[] args) {
		Rational rat = new Rational();
		rat.setZ�hler(6);
		rat.setNenner(3);
		System.out.println("Z�hler/Nenner = " + printRational() );
		negate();
		System.out.println("Mit Umgekehrtem Vorzeichen =" + printRational());
		invert();
		System.out.println("Kehrwert ="+ printRational());
		System.out.println("Als Double =" + toDouble());
		System.out.println("Reduce =" + reduce(Z�hler, Nenner));
		System.out.println("Addition eines Weiteren Rationals =" + add(1));
	}
	
	Rational(int tempoZ�hler, int tempoNenner){
		Z�hler = tempoZ�hler;
		Nenner = tempoNenner;
	}
	
	public static void negate() {
		Z�hler = -1*Z�hler;
	}
	
	public static void invert() {
		temp = Z�hler;
		Z�hler = Nenner;
		Nenner = temp;
	}
	
	public static double toDouble() {
        return (double) Z�hler/Nenner;
	}
	
	public static String reduce(int vorZ�hler, int vorNenner){
		int g = gcd(vorZ�hler, vorNenner);
		Z�hler = vorZ�hler / g;
		Nenner = vorNenner / g;
		return printRational();
	}
	
	public static double add(double weitererRational) {
		return weitererRational = toDouble() + weitererRational;
	}

	private static int gcd(int m, int n) {
        if (m < 0) m = -m;
        if (n < 0) n = -n;
        if (0 == n) return m;
        else return gcd(n, m % n);
	}
}