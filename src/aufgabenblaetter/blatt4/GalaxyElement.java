package aufgabenblaetter.blatt4;

public class GalaxyElement {
	String name;
	int x, y;
	double groesse;
	
	public GalaxyElement () {
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
