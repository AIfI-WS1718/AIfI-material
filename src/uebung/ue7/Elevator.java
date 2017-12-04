package uebung.ue7;

public class Elevator implements CanMoveVertically {

	String name;
	double z=0, speed;

	Elevator(String name, double z) {
		this.name = name;
		this.z = z;
	}

	@Override
	public void move() {
		this.z += speed;

	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void inceraseVerticalSpeed(double by) {
		this.speed += by;
	}
	
	@Override
	public String toString() {
		return "Name: " + name + " Position: " + z;
	}

}
