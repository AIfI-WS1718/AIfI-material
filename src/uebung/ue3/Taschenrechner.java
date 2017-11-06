package uebung.ue3;

public class Taschenrechner {
	private double result = 0;
	
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

	//Fehlende Methoden ergänzen:
	private void add(double zahl) {
		result = result + zahl;
	}
	
	private void reset(){
		result=0;
	}
	
	private void substract(double zahl){
		result = result-zahl;
	}
	private void sqrt() {
		result= Math.sqrt(result);
	}
	private void fakultaet() {
		double temp =1;
		for(int i=1;i<=result;i++) {
			temp = temp * i;
		}
		result = temp;		
	}
	public double getResult() {
		return result;
	}

}
