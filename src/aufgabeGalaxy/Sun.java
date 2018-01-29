package aufgabeGalaxy;

public final class Sun extends GalaxyElement {
	
	Sun(int x, int y, long groesse, String name) {
	super(x,y,groesse,name);
	}
	Sun(int x, int y, String name) {
	super(x,y,name);
	}
	Sun(long groesse, String name) {
	super(groesse,name);
	}  
	Sun(String name){
	super(name);
	}
	
	public String toString() {
	return "Sun" + " " + super.toString();
		
	}
	

}

