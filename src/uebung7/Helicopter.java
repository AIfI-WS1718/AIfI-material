package uebung7;

public class Helicopter implements CanMoveHorizontally, CanMoveVertically {
	
private String name;
private double x;
private double y;
private double z;
double verticalSpeed;
double horizontalSpeed;
private double angle = 0;
	
	Helicopter(String name, double x, double y, double z) {
		this.name = name;
		this.x = x;
		this.y = y;
		this.z = z;
		
	}

	@Override
	public void move() {
		x = x + Math.cos(angle)*horizontalSpeed;
		y = y + Math.sin(angle)*horizontalSpeed;
		z = z + verticalSpeed;
		if (z<0) {
			z=0;
			verticalSpeed = 0;
			horizontalSpeed = 0;
			System.err.println("\n Der Helicopter " + name + " muss notlanden!"); 
		}
	}

	@Override
	public String getName() {
		
		return name;
	}

	@Override
	public void increaseVerticalSpeed(double by) {
	verticalSpeed = verticalSpeed +by;
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
		String newHelicopterPosition = getClass().getName() + " " + name + " x = " + Math.round(x) + " y = " + Math.round(y) + " z = " + Math.round(z);
		return newHelicopterPosition;
	}

}
