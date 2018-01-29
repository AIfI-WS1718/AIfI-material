package aufgabeGalaxy;

public final class Planet extends GalaxyElement implements Movable {
	Sun mySun;
	int distanze;
	final double grad  = Math.PI/4;
	double angleCounter =0;

	Planet( String name, Sun sun, int distanze, long groesse) {
		super(sun.getX() + distanze, sun.getY(), groesse, name);
		mySun = sun;
		this.distanze = distanze;
		this.x = sun.getX() + distanze;
		this.y = sun.getY();
		
	}
	Planet(String name, Sun sun) {
		this(name,sun,0,0);
	}
	public String toString() {
			return "Planet " + super.toString() + " " + mySun;
		}
	public void move() {
		angleCounter = angleCounter + grad;
		x = (int) (distanze * Math.cos(angleCounter));
		y = (int) (distanze * Math.sin(angleCounter));
		System.out.println("The planet " + name +  " has moved."); 
		
	}
		

}
