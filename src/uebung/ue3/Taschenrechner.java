package uebung.ue3;

public class TaschenrechnerOL {

	public static void main(String[] args) {
		TaschenrechnerOL t = new TaschenrechnerOL();
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

	//Fehlende Methoden ergänzen:

}
