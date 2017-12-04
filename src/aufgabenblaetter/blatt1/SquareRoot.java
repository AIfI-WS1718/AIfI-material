package aufgabenblaetter.blatt1;

/* 
 * Feedback, gl, 27.11.: 
 * Kurz und gut! Funktionaler Code. 
 * Bei der L�nge der Variablennamen musst du nicht sparen ;) Sonst �rgert man sich, wenn das Programm gr��er geworden ist und man nach 2 Jahren nicht mehr wei� wof�r die Variable e verwendet wird und was dieses b dort tut...
 */
public class SquareRoot {

	public static void main(String[] args) {
		final double a = 25;
		double b = a/2;
		double f = 0.0001;
		double e = 0; // gl 27.11. Eigentlich braucht man hier keinen Wert zuweisen, er wird sowieso sofort �berschrieben.
		double d = a;
		
/*		gl 27.11. 
 * 		Die eigentliche Berechnung der Wurzel kann man auch gut in eine gesonderte Methode auslagern.
 * 		Noch sch�ner wird es, wenn die vielen Zwischenergebnisse nicht angezeigt werden und so nicht vom Endergebnis ablenken. Stell dir vor der Computer w�re sehr langsam. Dann sieht man dem letzten Ergebnis gar nicht an, ob es noch ein Zwischenergebnis ist und das Endergebnis vielleicht erst sp�ter kommt.
 */
		while(d > f) {
			e = (b + (a/b)) / 2;
			System.out.println("Das Ergebnis lautet: " + e);
			d = Math.abs(e - b); // gl, 27.11. So eine kurze Berechnung kann auch gut in die Bedingung der while-Schleife verlagert werden. Das ist �bersichtlicher.
			b = e;
		}
	}

}
