package aufgabenblaetter.blatt1;

/* 
 * Feedback, gl, 27.11.: 
 * Kurz und gut! Funktionaler Code. 
 * Bei der Länge der Variablennamen musst du nicht sparen ;) Sonst ärgert man sich, wenn das Programm größer geworden ist und man nach 2 Jahren nicht mehr weiß wofür die Variable e verwendet wird und was dieses b dort tut...
 */
public class SquareRoot {

	public static void main(String[] args) {
		final double a = 25;
		double b = a/2;
		double f = 0.0001;
		double e = 0; // gl 27.11. Eigentlich braucht man hier keinen Wert zuweisen, er wird sowieso sofort überschrieben.
		double d = a;
		
/*		gl 27.11. 
 * 		Die eigentliche Berechnung der Wurzel kann man auch gut in eine gesonderte Methode auslagern.
 * 		Noch schöner wird es, wenn die vielen Zwischenergebnisse nicht angezeigt werden und so nicht vom Endergebnis ablenken. Stell dir vor der Computer wäre sehr langsam. Dann sieht man dem letzten Ergebnis gar nicht an, ob es noch ein Zwischenergebnis ist und das Endergebnis vielleicht erst später kommt.
 */
		while(d > f) {
			e = (b + (a/b)) / 2;
			System.out.println("Das Ergebnis lautet: " + e);
			d = Math.abs(e - b); // gl, 27.11. So eine kurze Berechnung kann auch gut in die Bedingung der while-Schleife verlagert werden. Das ist übersichtlicher.
			b = e;
		}
	}

}
