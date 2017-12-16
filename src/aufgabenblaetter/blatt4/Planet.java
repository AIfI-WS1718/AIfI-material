package aufgabenblaetter.blatt4;

public final class Planet extends GalaxyElement implements Movable {

	Sun sonne;
	double distanz;
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
		super.x = (int) ((double) sonne.getX()  + distanz);
		super.y = (int) ((double) sonne.getY()  + distanz);
	}
	
	@Override
	public void move() {
		System.out.println("move planet");
		winkelgesamt += winkel;
		super.x = (int) ((double) distanz * (Math.cos(winkelgesamt)));
		super.y = (int) ((double) distanz * (Math.sin(winkelgesamt)));
	}
	
}
