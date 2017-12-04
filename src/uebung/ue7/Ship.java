package uebung.ue7;

public class Ship implements CanMoveHorizontally {
	String name;
	double x, y, speed = 0, radians = 0;

	Ship(String name, double x, double y) {
		this.name = name;
		this.x = x;
		this.y = y;
	}

	@Override
	public void move() {
		this.x += speed * Math.sin(radians);
		this.y += speed * Math.cos(radians);
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void increaseHorizontalSpeed(double by) {
		this.speed += by;
	}

	@Override
	public void turnBy(double radians) {
		this.radians += radians;

	}
	
	@Override
	public String toString() {
		return "Name: " + name + " Position (x): " + x + " Position (y): " + y;
	}

}
