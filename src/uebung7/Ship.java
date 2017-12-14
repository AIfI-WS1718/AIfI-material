package uebung7;

public class Ship implements CanMoveHorizontally {
	private String name;
	private double x;
	private double y;
	double horizontalSpeed;
	private double angle = 0;
	
	Ship(String name, double x, double y) {
		this.name = name;
		this.x = x;
		this.y = y;	
	}
	
	@Override
	public void move() {
		x = x + Math.cos(angle)*horizontalSpeed;
		y = y + Math.sin(angle)*horizontalSpeed;
	}

	@Override
	public String getName() {
		
		return name;
	}

	@Override
	public void increaseHorizontalSpeed(double by) {
		horizontalSpeed = horizontalSpeed + by;
	}

	@Override
	public void turnBy(double radians) {
		angle = angle + radians;

	}
	public String toString() {
		String newShipPosition = getClass().getName() + " " + name + " x = " + Math.round(x) + " y = " + Math.round(y);
		return newShipPosition;
	}
}
