package uebung.ue3;

public class Taschenrechner {
	double ergebnis = 0;
	public static void main(String[] args) {
		Taschenrechner t = new Taschenrechner();
		t.add(5);
		System.out.println("Ergebnis: " + t.getResult());
		t.reset();
		System.out.println("Ergebnis: " + t.getResult());
		t.add(10);
		t.substract(5);
		System.out.println("Ergebnis: " + t.getResult());
		t.reset();
		t.add(3);
		t.fakultaet();
		System.out.println("Ergebnis: " + t.getResult());
		t.reset();
		t.add(9);
		t.sqrt();
		System.out.println("Ergebnis: " + t.getResult());
	}



	private void sqrt() {
		// TODO Auto-generated method stub
		ergebnis=Math.sqrt(ergebnis);
	}



	private void fakultaet() {
		// TODO Auto-generated method stub
		if (ergebnis==0) {
			ergebnis =1; 
		}
		else {
			double temp;
			temp = 1;
			for (int j=1; j<=ergebnis; j++) {
			temp = temp * j;
			}
			ergebnis = temp;
		}
	}



	private void substract(int i) {
		// TODO Auto-generated method stub
		ergebnis = ergebnis - 5;
	}

	private double getResult() {
		// TODO Auto-generated method stub
		return ergebnis;
	}

	private void reset() {
		// TODO Auto-generated method stub
		ergebnis = 0;
	}

	private void add(int i) {
		// TODO Auto-generated method stub
		ergebnis = ergebnis + i;
		
	}


}
