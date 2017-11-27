package uebung.ue3;

public class TaschenrechnerLsg {

	private double result = 0;

	private void reset() {
		this.result = 0;
	}

	private double getResult() {
		return this.result;
	}


	private void add(double l) {
		this.result += l;
	}
	private void substract(double l) {
		this.result -= l;
	}

	
	private void sqrt(){
		this.result = Math.sqrt(this.result);
	}
	private void fakultaet() {
		double value = this.result;
		this.result = 1;
		for (long i=1; i <= value; i++) {
			this.result *= i;
		}


	}

	public static void main(String[] args) {
		TaschenrechnerLsg t = new TaschenrechnerLsg();
		t.add(5);
		System.out.println("Ergebnis: " + t.getResult());
		t.reset();
		System.out.println("Ergebnis: " + t.getResult());
		t.add(10);
		t.substract(5);
		System.out.println("Ergebnis: " + t.getResult());
		t.fakultaet();
		System.out.println("Ergebnis: " + t.getResult());
		t.sqrt();
		System.out.println("Ergebnis: " + t.getResult());
	}

}
