package aufgabenblaetter.blatt4;

public final class Planet extends GalaxyElement {

	Sun sonne;
	double distanz;
	 
	public Planet(String name, Sun sonne) {
		this.sonne = sonne;
		this.name = name;
	}
	
	public Planet(String name, Sun sonne, double groesse, double distanz) {
		this.name = name;
		this.sonne = sonne;
		this.groesse = groesse;
		this.distanz = distanz;
		super.x = (int) ((double) sonne.getX()  + distanz);
		super.y = (int) ((double) sonne.getY()  + distanz);
	}
	
}
