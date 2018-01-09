package aufgabenblaetter.blatt4;

/*
 * Feedback gl 9.1.
 * Ok, ein paar Fehler. Und das int<->double hin- und hercasten ist etwas unschoen, weil es
 * viele unnoetige Rundungsfehler bewirkt. 
 */
public final class Planet extends GalaxyElement implements Movable {

	Sun sonne;
	double distanz;
//	gl 9.1. Namen von Konstanten sollen nach Konvention GROSS geschrieben werden.
	static final double winkel = Math.PI / 4.0;
	double winkelgesamt = 0;
	
	public Planet(String name, Sun sonne) {
		this.sonne = sonne;
		this.name = name;
	}
	
	public Planet(String name, Sun sonne, double groesse, double distanz) {
		this.name = name;
		this.sonne = sonne;
		this.groesse = groesse;
		this.distanz = distanz;
/*		gl 9.1. Wenn sich der Planet im festgelegten Abstand rechts von der Sonne befinden soll, 
 * 		muesste die y Komponente 0 sein. man könnte auch die Positionsberechnung in eine Methode 
 * 		auslagern und sowohl hier als auch in der move() Methode aufrufen.
 */
		super.x = (int) ((double) sonne.getX()  + distanz);
		super.y = (int) ((double) sonne.getY()  + distanz);
	}
	
	@Override
	public void move() {
		System.out.println("move planet");
		winkelgesamt += winkel;
/*		gl 9.1. Leider hast du hier vergessen, dass sich der Planet um seine Sonne drehen soll.
 * 		Das "(double)" braucht man hier nicht, weil distanz bereits ein double ist.
 */
		super.x = (int) ((double) distanz * (Math.cos(winkelgesamt)));
		super.y = (int) ((double) distanz * (Math.sin(winkelgesamt)));
	}
	
}
