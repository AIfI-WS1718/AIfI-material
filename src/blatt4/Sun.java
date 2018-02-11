package blatt4;

public class Sun extends GalaxyElement {

	public Sun(String name) {
		super(name);
	}
	
	public Sun(String name, double x, double y, int size) {
		super(name, x, y, size);
	}
	
	@Override
	public String toString() {
		return "Sonne " + name + ", Größe=" + size;
		
	}

}
