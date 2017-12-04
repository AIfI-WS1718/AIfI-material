package ue7;

public class Ship implements CanMoveHorizontally {
	String type = "Ship";
	String name;
	
	double x;
	double y;
	double z = 0;
	double speed = 0;
	double direction;
	
	public Ship(String name, double x, double y) {
		this.name = name;
		this.x = x;
		this.y = y;
	}
	
	@Override
	public void move() {
		x = x + Math.cos(direction) * speed;
		y = y + Math.sin(direction) * speed;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void increaseHorizontalSpeed(double by) {
		speed = speed + by;
	}

	@Override
	public void turnBy(double radians) {
		this.direction = radians;
	}
	
	public String toString() {
		return type + name + "(" + x + "," + y + "," + z + ")"; 
	}

}
