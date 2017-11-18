package aufgabenblaetter.blatt1;

import java.util.Scanner; 
import java.lang.String;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO bearbeite hier die Aufgabe aus dem freiwilligen Aufgabenblatt 1 und commite deine Loesung in deinem Branch. Viel Spaß :)
		System.out.println("Gib eine Zahl größer 0 an, deren Quadratwurzel ermittlet werden soll: "); 
		Scanner scanner = new Scanner(System.in); 
		double wert = scanner.nextInt(); 
		double ergebnis = rechner(wert); 
		System.out.println("Ihr Ergebnis: "+ ergebnis);
		scanner.close();
	}
	
	public static double rechner(double wert) {
		
		double jetzt = wert; 
		double vorher = -1; 
		
		do {
			vorher = (jetzt != -1) ? jetzt : vorher; 
			jetzt = (vorher + (jetzt/vorher)) / 2; 
		} while ((vorher - jetzt) > 0.0001); 
		return jetzt; 
	}
	
	
	public static void scan() {
		Scanner scanner = new Scanner(System.in); 	
		String inputString = scanner.next(); 		
		int inputInt = scanner.nextInt(); 			
		scanner.close();								
	}

}




