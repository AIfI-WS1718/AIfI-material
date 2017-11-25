package uebung4;

public class Rational {
	private int zaehler;
	private int nenner;
	

	Rational() {
		zaehler = 0;
		nenner = 1;
	}

	Rational(int zaehler, int nenner) {
		this.zaehler = zaehler;
		this.nenner = nenner;

	}

	public void printRational() {
		System.out.println(zaehler + "/" + nenner);

	}

	public void setZaehler(int zaehler) {
		this.zaehler = zaehler;
	}

	public void setNenner(int nenner) {
		this.nenner = nenner;
	}

	public void negate() {
		zaehler = -1 * zaehler;
	}

	public void invert() {
		int buffer = zaehler;
		zaehler = nenner;
		nenner = buffer;
	}

	public double toDouble() {
		double zaehlerD = Double.valueOf(zaehler);
		double nennerD = Double.valueOf(nenner);
		return zaehlerD / nennerD;
	}

	public void reduce() {
		int copyZaehler = Math.abs(this.zaehler);
		int copyNenner = Math.abs(this.nenner);
		while (copyZaehler != 0) {
			if (copyNenner > copyZaehler) {
				copyNenner = copyNenner - copyZaehler;
			} else {
				copyZaehler = copyZaehler - copyNenner;
			}
		}
		int result = copyNenner;
		this.zaehler = this.zaehler / result;
		this.nenner = this.nenner / result;
	

	}
	public void add(int zaehler2, int nenner2) {
		this.zaehler = zaehler2*this.nenner + this.zaehler*nenner2;
		this.nenner = this.nenner*nenner2;
		System.out.println(this.zaehler + "/" + this.nenner);
		
	}

}
