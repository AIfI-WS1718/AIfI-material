package uebung.ue7;

public class Elevator {
	double z = 0;
	double verticalspeed = 0;
	String name;
	
	public Elevator(String name, double z) {
		this.name = name;
		this.z = z;
	}
	public void increaseVerticalSpeed(double by) {
		verticalspeed += by;
	}
	public void move(){
		z += verticalspeed;
	}
	public String toString() {
		return("Elevator " + name + " at " + z);
	}
	public String getName() {
		return(name);
	}
}
