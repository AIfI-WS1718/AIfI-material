package aufgabenblatt2;

public class Rational {
	
	static int Zähler;
	static int Nenner;
	static int temp;
	
	Rational() {
		Zähler = 0;
		Nenner = 1;
	}
	
	public static String printRational() {
		return Zähler + "/" + Nenner;
	}
	
	void setZähler(int tempZähler) {
		Zähler = tempZähler;
	}
	
	void setNenner(int tempNenner) {
		Nenner = tempNenner;
	}
	
	public static void main(String[] args) {
		Rational rat = new Rational();
		rat.setZähler(6);
		rat.setNenner(3);
		System.out.println("Zähler/Nenner = " + printRational() );
		negate();
		System.out.println("Mit Umgekehrtem Vorzeichen =" + printRational());
		invert();
		System.out.println("Kehrwert ="+ printRational());
		System.out.println("Als Double =" + toDouble());
		System.out.println("Reduce =" + reduce(Zähler, Nenner));
		System.out.println("Addition eines Weiteren Rationals =" + add(1));
	}
	
	Rational(int tempoZähler, int tempoNenner){
		Zähler = tempoZähler;
		Nenner = tempoNenner;
	}
	
	public static void negate() {
		Zähler = -1*Zähler;
	}
	
	public static void invert() {
		temp = Zähler;
		Zähler = Nenner;
		Nenner = temp;
	}
	
	public static double toDouble() {
        return (double) Zähler/Nenner;
	}
	
	public static String reduce(int vorZähler, int vorNenner){
		int g = gcd(vorZähler, vorNenner);
		Zähler = vorZähler / g;
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