package blatt4;

public class Planet extends GalaxyElement implements Moveable {
	
	private Sun parentSun;
	private int distance;
	
	public Planet(String name, Sun parentSun) {
		this.name = name;
		this.parentSun = parentSun;
		this.x = parentSun.getX() + 5;
	}

	public Planet(String name, Sun parentSun, int distance) {
		this.parentSun = parentSun;
		this.x = parentSun.getX() + distance;
	}
	
	@Override
	public String toString() {
		return "Sonne " + name + ", Größe=" + size + ", x=" + x + ", y=" + y + ", distance=" + distance;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

}
