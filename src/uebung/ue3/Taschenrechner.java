package uebung.ue3;

import java.util.Scanner;

public class Taschenrechner {

	public static void main(String[] args) {
		/*Taschenrechner t = new Taschenrechner();
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
		System.out.println("Ergebnis: " + t.getResult());*/
		
		TaschenrechnerCommandLine t = new TaschenrechnerCommandLine(); 
		Scanner scanner = new Scanner (System.in); 
		System.out.println("Gib die durchzuführende Rechenoperation an('+', '-', '!', 'sqrt', 'close' oder 'reset'): ");
		String operation = scanner.next();
		switch(operation) {
		case "+":	System.out.println("Gib die zu addierende Zahl an:" );
					t.add(scanner.nextInt());
					break; 
		case "-": 	System.out.println("Gibt die zu subtrahierende Zahl an:");
					t.subtract(scanner.nextInt());
					break; 
		case "!": 	t.fakultaet();
					break; 
		case"reset":t.reset(); 
					break; 
		case "sqrt":	t.sqrt(); 
					break; 
		case "clear": t.clear(); 
					break; 
		default: 	System.out.println("Keine gültige Operation: ");
					break; 
		}
		
		System.out.println("Ergebnis: " + t.getResult());
		scanner.close(); 
	}

	//Fehlende Methoden ergänzen:
	
	double result = 0.0; 
	
	public void reset() {
		this.result = 0; 
	}
	
	public double getResult() {
		return this.result; 
	}
	
	public void add(double a) {
		this.result += a; 
	}
	
	public void subtract(double b) {
		this.result -= b; 
	}
	
	public void sqrt(double c) {
		this.result = Math.sqrt(c); 
	}
	
	public void fakultaet() {
		double j = this.result; 
		this.result = 1; 
		for(long i = 1; i <= j; i++) {
			this.result *= i; 
		}
	}
}
