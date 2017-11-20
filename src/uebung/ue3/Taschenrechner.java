package uebung.ue3;

public class Taschenrechner {
	
	double result =0;

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

	private double getResult() {
		return result;
	}

	private void add(int i) {
		result+=5;	
	}

	//Fehlende Methoden ergänzen:

}
