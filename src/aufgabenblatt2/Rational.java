package aufgabenblatt2;

public class Rational {
	
	double Z�hler;
	double Nenner;
	
	public Rational() {
		this.Z�hler = 0;
		this.Nenner = 1;
	}
	
	public double printRational() {
		return Z�hler + Nenner;
	}
	
	public void setZ�hler(double Z�hler) {
		this.Z�hler = Z�hler;
	}
	
	public void setNenner(double Nenner) {
		this.Nenner = Nenner;
	}
	
	public static void main(String[] args) {
		Rational rat = new Rational();
		System.out.println("Z�hler/Nenner = " + rat.Z�hler/rat.Nenner );
	}
}