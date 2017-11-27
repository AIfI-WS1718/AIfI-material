package aufgabenblaetter.blatt1;

import java.util.Scanner; 
import java.lang.String;

/* 
 * Feedback, gl, 27.11.: 
 * Sauberer Stil, liefert aber leider aufgrund eines Fehlers falsche Ergebnisse und beinhaltet eine ungenutzte Methode. 
 */
public class SquareRoot {

	public static void main(String[] args) {
		// TODO bearbeite hier die Aufgabe aus dem freiwilligen Aufgabenblatt 1 und commite deine Loesung in deinem Branch. Viel SpaÃŸ :)
		//  gl, 27.11. Gute Idee, das Programm mit dem Scanner interaktiver zu gestalten.
		System.out.println("Gib eine Zahl grÃ¶ÃŸer 0 an, deren Quadratwurzel ermittlet werden soll: "); 
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
			vorher = (jetzt != -1) ? jetzt : vorher; // gl, 27.11. Wie bei der Lösung von Josh, die deiner erstaunlich ähnlich sieht: Einerseits ist es schön, dass du den Fragezeichenoperator richtig verwendest. Andererseits ginge es noch eleganter, wenn du "jetzt" oben auch mit dem Anfangswert initialisierst und dir so die Abfrage hier ganz sparst und stattdessen: vorher=jetzt setzst.
			jetzt = (vorher + (jetzt/vorher)) / 2; // gl, 27.11. Hier ist der Fehler, es müsste hier stehen: jetzt = (vorher + (wert/vorher)) / 2;
		} while ((vorher - jetzt) > 0.0001); 
		return jetzt; 
	}
	
	// gl, 27.11. Leider wird diese Methode überhaupt nicht benutzt. Anstattdessen befindet sich eine Kopie in der main-Methode.
	public static void scan() {
		Scanner scanner = new Scanner(System.in); 	
		String inputString = scanner.next(); 		
		int inputInt = scanner.nextInt(); 			
		scanner.close();								
	}

}




