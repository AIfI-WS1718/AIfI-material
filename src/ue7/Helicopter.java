package ue7;

public class Helicopter implements CanMoveHorizontally, CanMoveVertically {
	String type = "Helicopter";
	String name;
	
	double x = 0;
	double y = 0;
	double z = 0;
	double speed = 0;
	double zspeed = 0;
	double direction;
	
	public Helicopter(String name, double x, double y, double z) {
		this.name = name;
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	
	@Override
	public void move() {
		if ((z + zspeed) < 0) {
			z = 0;
			speed = 0;
			zspeed = 0;
			System.err.println("Helicopter did an emergency landing");
		}
		
		x = x + Math.cos(direction) * speed;
		y = y + Math.sin(direction) * speed;
		z = z + zspeed;

	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void increaseVerticalSpeed(double by) {
		zspeed = zspeed + by;

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
