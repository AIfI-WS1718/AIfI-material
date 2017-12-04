package uebung.ue7.transportSimulator;

public class Ship implements CanMoveHorizontally{
	private String name;
	private double horizontalSpeed = 0;
	private double directionInRadians = 0;
	private double x, y;

	public Ship(String name, double x, double y){
		this.name = name;
		this.x = x;
		this.y = y;
	}
	public String getName() {
		return name;
	}
	@Override
	public void move() {
		x = x + Math.cos(directionInRadians) * horizontalSpeed;
		y = y + Math.sin(directionInRadians) * horizontalSpeed;
	}
	@Override
	public void increaseHorizontalSpeed(double by) {
		horizontalSpeed = horizontalSpeed + by;		
	}
	@Override
	public void turnBy(double radians) {
		directionInRadians = directionInRadians + radians;
	}
	@Override
	public String toString() {
		return "Ship " + name + " x=" + Math.round(x) +", y=" +
				Math.round(y);
	}
}

