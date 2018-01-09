package aufgabenblaetter.blatt4;

public class GalaxyElement {
	String name;
	/*
	 * gl 9.1. Die meisten haetten hier vermutlich double statt int gewaehlt.
	 * Dann muesstest du spaeter auch nicht mehr nach double und zurueck
	 * zu int casten.
	 */
	int x, y;
	double groesse;
	
	/*
	 * gl 9.1. "Ein GalaxyElement soll bei Erstellung mindestens einen Namen bekommen" in der
	 * Aufgabenstellung kann man so verstehen, dass man dem Konstruktor immer einen Namen übergeben
	 * soll und nur der rest über Defaults gefüllt wird. Macht keinen grossen Unterschied ;-)
	 */
	public GalaxyElement () {
/*
 * 		gl 9.1. Man kann hier auch einfach auf den anderen Konstruktor verweisen:
 *		this(0, 0, "Teil der Galaxy", 10.0);
*/
		name = "Teil der Galaxy";
		x = 0;
		y= 0;
		groesse = 10.0;
	}

	public GalaxyElement(int x, int y, String name, double groesse) {
		this.x = x;
		this.y = y;
		this.groesse = groesse;
		this.name = name;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public String getName() {
		return this.name;
	}

	public double getGroesse() {
		return this.groesse;
	}

	@Override
	public String toString () {
			return "Name: " + this.name + "; Gr" + (char) 246 + (char) 223 + "e: " + this.groesse + "; x-Position: " + this.x + "; y-Position: " +  this.y;
	}

}
