package uebung.ue7;

public class Helicopter implements CanMoveHorizontally, CanMoveVertically {
	String name;
	double x, y, z, speedxy = 0, speedz = 0, radians = 0;

	Helicopter(String name, double x, double y, double z) {
		this.name = name;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	@Override
	public void move() {
		if (z+speedz < 0) {
			z = 0;
			System.err.println("Achtung: Notlandung auf Meereshöhe! Stoppe.");
			speedz = 0;
		}
		else {
			this.x += speedxy * Math.sin(radians);
			this.y += speedxy * Math.cos(radians);
			this.z += speedz;
		}

	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void inceraseVerticalSpeed(double by) {
		this.speedz += by;
	}

	@Override
	public void increaseHorizontalSpeed(double by) {
		this.speedxy += by;

	}

	@Override
	public void turnBy(double radians) {
		this.radians += radians;

	}
	
	@Override
	public String toString() {
		return "Name: " + name + " Position (x): " + x + " Position (y): " + y + " Höhe " + z;
	}

}
