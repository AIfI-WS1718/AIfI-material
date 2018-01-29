package aufgabeGalaxy;

public class GalaxyElement implements Comparable<GalaxyElement> {
	protected int x;
	protected int y;
	protected long groesse;
	protected String name;

	GalaxyElement(int x, int y, long groesse, String name) {
		this.x = x;
		this.y = y;
		this.groesse = groesse;
		this.name = name;
	}

	GalaxyElement(long groesse, String name) {
		this(0, 0, groesse, name);
	}

	GalaxyElement(int x, int y, String name) {
		this(x, y, 0, name);
	}

	GalaxyElement(String name) {
		this(0, name);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public long getGroesse() {
		return groesse;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		String string = x + " " + y + " " + groesse + " " + name;
		return string;
	}

	@Override
	public int compareTo(GalaxyElement galaxyElement) {
		if (groesse > galaxyElement.getGroesse()) {
			return -1;
		} else if (groesse == galaxyElement.getGroesse()) {
			return 0;
		} else {
			return 1;

		}
	}



}
