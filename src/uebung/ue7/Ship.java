package uebung.ue7;

public class Ship implements CanMoveHorizontally {
	String name;
	double x;
	double speed=0;
	double y;
	double heading=0;

	public Ship(String name, double x, double y) {
		this.name=name;
		this.x=x;
		this.y=y;// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		x += speed * Math.cos(heading);
		y += speed * Math.sin(heading);
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void increaseHorizontalSpeed(double by) {
		speed += by;
	}

	@Override
	public void turnBy(double radians) {
		heading += radians;
	}
	public String toString() {
		return("Ship " + name + " at " + x + "/" + y);
	}

}
