package aufgabenblaetter.blatt1;

import java.util.Scanner; 
import java.lang.String;

 //Ist noch nicht fertig, aber ich komm mit der Konsoleneingabe nicht weiter....
public class SquareRoot {

	public static void main(String[] args) {
		// TODO bearbeite hier die Aufgabe aus dem freiwilligen Aufgabenblatt 1 und commite deine Loesung in deinem Branch. Viel Spaß :)
		Scanner scanner = new Scanner(System.in); 
		double wert; // Wie sag ich ihm dass es der Wert sein soll den der user eingibt? 
		System.out.println("Gib eine Zahl größer 0 an, deren Quadratwurzel ermittlet werden soll: "); 
		double ergebnis = Rechner(wert); 
		System.out.println("Ihr Ergebnis: "+ ergebnis);
	}
	
	//Rechner Klasse, die die eigentliche Schätzung durchführt. 
	public static double Rechner(double wert) {
		double jetzt = wert; 
		double vorher = -1; 
		if ((vorher - jetzt) > 0.0001) {
			jetzt = (vorher + jetzt/2) / 2; 
			return jetzt; 
		}else{
			return jetzt; 
		}
		
	}
	
	
	public static void scan() {
		Scanner scanner = new Scanner(System.in); 	//öffnet einen Eingabestrom
		String inputString = scanner.next(); 		//nächste Eingabe als String speichern
		int inputInt = scanner.nextInt(); 			//nächste Eingabe als Int speichern
		scanner.close();								//Eingabestrom schließen
	}

}




