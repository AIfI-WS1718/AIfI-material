package uebung.ue3;

public class Taschenrechner {

	public static void main(String[] args) {
		Taschenrechner t = new Taschenrechner();
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

	double result=0;
	
	public void reset() {
		result=0;
	}
	public void add(double l) {
		result += l;
	}
	public double getResult() {
		return result;
	}
	public void substract(double l) {
		result -= l;
	}
	public void fakultaet() {
		double j = result;
		result=1;
		for (long i=1; i <= j; i++) {
		result *=i;
	 }
	}
	public void sqrt() {
		result=Math.sqrt(result);
	}
	
	

}
