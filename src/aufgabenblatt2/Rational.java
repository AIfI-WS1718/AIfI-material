package aufgabenblatt2;

public class Rational {
	
	double Zähler;
	double Nenner;
	
	public Rational() {
		this.Zähler = 0;
		this.Nenner = 1;
	}
	
	public void printRational() {
		System.out.println("Nenner = " + Zähler + " ,Nenner = " + Nenner);
	}
	
	public void setZähler(double Zähler) {
		this.Zähler = 0;
	}
	
	public void setNenner(double Nenner) {
		this.Nenner = 1;
	}
	
	public static void main(String[] args) {
		Rational rat = new Rational();
		System.out.println("Zähler/Nenner = " + rat.Zähler/rat.Nenner );
	}
}