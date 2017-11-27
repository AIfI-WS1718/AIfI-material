package aufgabenblaetter.blatt1;

import java.util.Scanner;

/* 
 * Feedback, gl, 27.11.: 
 * Perfekt! Sauberer Stil, funktionaler Code und sogar an Sonderfälle wurde gedacht :)
 */
public class SquareRoot {

	public static void main(String[] args) {
		calculate();
	}

	private static void calculate() {
//		gl, 27.11. Sehr schön! Nicht nur Eingabe über Kommandozeile, sondern auch mehrere Anfragen hintereinander möglich.
		Scanner scanner = new Scanner(System.in);

		while (true) {
			int exitCode = 0;
			System.out.println("Please give a positive number (or 0 for exit):");
			int inputNumber = scanner.nextInt();
//			gl, 27.11. Sehr gut mitgedacht und Sonderfälle abgefangen. Später lernt ihr mit try/catch elegantere Methoden zur Fehlerbehandlung.
			if (inputNumber < 0) {
				System.out.println("Error.");
				continue;
//			gl, 27.11. Sehr schön, das Programm kann sich auch selbst schließen.
			} else if (inputNumber == exitCode) {
				break;
			}

			double value = Double.valueOf(inputNumber);
			double startX = value / 2; // gl, 27.11. Schön, dass double für höhere Genauigkeit verwendet wurde. 
			double buffer; // gl, 27.11. Vielleicht gäbe es hier andere Variablennamen, die etwas klarer aussagen, wie diese Variable verwendet wird.

			do {

				buffer = startX;
				startX = nextX(value, startX);

			} while ((buffer - startX) > 0.0001);
//			gl, 27.11. Einen Tippfehler hast du gut bei der sonst sehr schönen Lösung ;-)
			System.out.println("The squeare root of " + value + " is " + startX);
		}
//		gl, 27.11. Sehr gut, der Scanner wird auch wieder geschlossen. 
		scanner.close();
	}

//	gl, 27.11. Bei so einer kurzen Berechnung kann man sich überlegen, ob man diese wirklich in eine gesonderte Methode auslagern möchte. Vermutlich hätte man eher die gesamte Wurzelberechnung ausgelagert (alles innerhalb der do/while Schleife).
	private static double nextX(double a, double x0) {
		return (x0 + a / x0) / 2;
	}

}
