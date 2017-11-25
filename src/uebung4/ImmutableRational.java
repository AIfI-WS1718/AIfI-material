package uebung4;



public class ImmutableRational {
	final private int zaehler;
	final private int nenner;
	


	ImmutableRational(int zaehler, int nenner) {
		this.zaehler = zaehler;
		this.nenner = nenner;

	}

	public void printRational() {
		System.out.println(zaehler + "/" + nenner);

	}

	
	public ImmutableRational negate() {
		ImmutableRational immR = new ImmutableRational(-zaehler, nenner);
		return immR;
	}
	

	public ImmutableRational invert() {
		ImmutableRational immR = new ImmutableRational(nenner, zaehler);
		return immR;
	}

	public double toDouble() {
		double zaehlerD = Double.valueOf(zaehler);
		double nennerD = Double.valueOf(nenner);
		return zaehlerD / nennerD;
	}

	public ImmutableRational reduce() {
		
		int copyZaehler = Math.abs(zaehler);
		int copyNenner = Math.abs(nenner);
		while (copyZaehler != 0) {
			if (copyNenner > copyZaehler) {
				copyNenner = copyNenner - copyZaehler;
			} else {
				copyZaehler = copyZaehler - copyNenner;
			}
		}
		int result = copyNenner;
		ImmutableRational immR = new ImmutableRational(zaehler / result, nenner / result);
		return immR;

	}
	public ImmutableRational add(int zaehler, int nenner) {
		int zaehlerNew = zaehler*this.nenner + this.zaehler*nenner;
		int nennerNew = this.nenner*nenner;
		ImmutableRational immR = new ImmutableRational(zaehlerNew, nennerNew);
		return immR; 
		
	}



}
