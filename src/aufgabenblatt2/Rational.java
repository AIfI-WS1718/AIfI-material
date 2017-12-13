package aufgabenblatt2;

public class Rational {
	
	double Zähler;
	double Nenner;
	
	public Rational() {
		this.Zähler = 0;
		this.Nenner = 1;
	}
	
	public double printRational() {
		return Zähler + Nenner;
	}
	
	public void setZähler(double Zähler) {
		this.Zähler = Zähler;
	}
	
	public void setNenner(double Nenner) {
		this.Nenner = Nenner;
	}
	
	public static void main(String[] args) {
		Rational rat = new Rational();
		System.out.println("Zähler/Nenner = " + rat.Zähler/rat.Nenner );
	}
}