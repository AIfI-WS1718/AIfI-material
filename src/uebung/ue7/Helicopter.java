package uebung.ue7;

public class Helicopter implements CanMoveHorizontally, CanMoveVertically {
	double x;
	double y;
	double z;
	double verticalspeed;
	double horizontalspeed;
	double heading;
	String name;
	

	public Helicopter(String name, double x, double y, double z) {
		this.name=name;
		this.x=x;
		this.y=y;
		this.z=z;
	}

	@Override
	public void move() {
		x += Math.cos(horizontalspeed);
		y += Math.sin(horizontalspeed);
		z += verticalspeed;
		if(z<0) {
			z=0;
			verticalspeed = 0;
			horizontalspeed = 0;
			System.err.println("Helikopter " + name + " musste notlanden!");
		}
	}

	@Override
	public String getName() {

		return name;
	}

	@Override
	public void increaseVerticalSpeed(double by) {
		verticalspeed+=by;

	}

	@Override
	public void increaseHorizontalSpeed(double by) {
		horizontalspeed+=by;

	}

	@Override
	public void turnBy(double radians) {
		heading += radians;
	}
	public String toString() {
		return("Helicopter " + name + " at " + x + "/" + y + "/" + z);
	}

}
