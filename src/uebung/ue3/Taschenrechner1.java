package uebung.ue3;

public class Taschenrechner1 {

	private double value = 10;

	public static void main(String[] args) {
		Taschenrechner1 t = new Taschenrechner1();
		t.add(5);
		System.out.println("Ergebnis: " + t.getResult());
		t.reset();
		System.out.println("Ergebnis: " + t.getResult());
		t.add(10);
		System.out.println("Ergebnis: " + t.getResult());
		t.substract(5);
		System.out.println("Ergebnis: " + t.getResult());
		t.fakultaet();
		System.out.println("Ergebnis: " + t.getResult());
		t.sqrt();
		System.out.println("Ergebnis: " + t.getResult());

	}

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