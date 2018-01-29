package aufgabeGalaxy;

public final class SpaceShip extends GalaxyElement implements Movable, Destroyable {

	final int speed = 600;
	double energy = 10;

	SpaceShip(String name, int x, int y) {
		super(x, y, name);
	}

	SpaceShip(String name) {
		super(0, 0, name);
	}

	@Override
	public void move() {
		this.x = x + speed;
		this.y = y + speed;
		System.out.println("The spaceship " + name +  " has moved.");
	}

	public void hit(double power) {
		energy = energy - power;
		System.out.println("The energy is reduced to " + energy + ".");
	}

	public boolean isDestroyed() {
		return energy <= 0;
//		if (energy <= 0) {
//			return true;
//		} else {
//			return false;
//		}

	}
}
