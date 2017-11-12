package uebung.ue3;

public class Taschenrechner2 {

	private double value = 30;

	public void add(double aa) {
		value = value + aa;
	}

	public double getResult() {
		return value;
	}

	public void reset() {
		value = 0;
	}

	public void substract(double bb) {
		value = value - bb;
	}

	public void fakultaet() {
		double fac = 1;
		for (int ii = 1; ii <= value; ii++) {
			fac = fac * ii;
		}
		value = fac;
	}

	public void sqrt() {
		value = Math.sqrt(value);
	}
}
