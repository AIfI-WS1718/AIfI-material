package aufgabenblaetter.blatt4;

public final class Planet extends GalaxyElement {

	String sonne;
	double distanz;
	final int X = 0;
	final int Y = 0;
	 
	public Planet(String name, String sonne) {
		this.sonne = sonne;
		this.name = name;
	}
	
	public Planet(String name, String sonne, double groesse, double distanz) {
		this.name = name;
		this.sonne = sonne;
		this.groesse = groesse;
		this.distanz = distanz;
	}
	
}
