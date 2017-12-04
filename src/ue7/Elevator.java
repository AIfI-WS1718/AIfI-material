package ue7;

public class Elevator implements CanMoveVertically {
	String type = "Elevator";
	String name;
	
	double x = 0;
	double y = 0;
	double z;
	double zspeed = 0;
	
	public Elevator(String name, double z) {
		this.name = name;
		this.z = z;
	}
	
	@Override
	public void move() {
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

	public String toString() {
		return type + name + "(" + x + "," + y + "," + z + ")"; 
	}
}
