package uebung7;

public class Elevator implements CanMoveVertically {
	private double z;
	private String name;
	double verticalSpeed;
	
	Elevator (String name, double z){
		this.z = z;
		this.name = name;
	}

	@Override
	public void move() {
		z = z + verticalSpeed;
		
			
	}	

	@Override
	public String getName() {
	
		return name;
	}

	@Override
	public void increaseVerticalSpeed(double by) {
		verticalSpeed = verticalSpeed + by;
	}
	 
	public String toString() {
		String newElevatorPosition = this.getClass().getCanonicalName() + " " + name + " z = " + Math.round(z);
		return newElevatorPosition;
	}
	

}
