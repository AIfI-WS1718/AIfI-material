package aufgabenblaetter.blatt4;
/*
 * Feedback gl 9.1.
 * ein inhaltlicher Fehler sonst in Ordnung. An das final wurde gedacht :-)
 */
public final class SpaceShip extends GalaxyElement implements Movable, Destroyable {

	int speed;
	double energy = 100.0;

	public SpaceShip(int x, int y, String name, double groesse, int speed) {
		super(x, y, name, groesse);
		this.speed = speed;
	}

	public SpaceShip(String name) {
/*		gl 9.1. "(int) Math.random() * 100" bewirkt leider, dass erst das Ergebnis von
 * 		Math.random(), also ein Wert 0<=x<1 zu int gecastet, das heißt auf 0 abgerundet, wird 
 * 		und danach erst mit 100 multipliziert wird. Deshalb starten alle SpaceShips bei 
 * 		x=0, y=0. In der Galaxy Klasse wurde das richtig geloest und eingeklammert.
 * 		(int) (Math.random() * 100)
 */
		super((int) Math.random() * 100, (int) Math.random() * 100, name, Math.random() * 100);
		this.speed = 5;
	}

	@Override
	public void move() {

		this.x += speed;
		this.y += speed;
		System.out.println("move space ship");

	}

	@Override
	public void hit(double power) {
		energy -= power;
		System.out.println("Das SpaceShip hat noch eine Energie von: " + energy);
		String a;
		if (isDestroyed()) {
			a = "";
		}
		else {
			a = "nicht ";
		}
		System.out.println("Das Raumschiff ist " + a + "zerst" + (char) 246 + "rt.");
	}

	@Override
	public boolean isDestroyed() {
		if (energy <= 0) {
			return true;
		} else {
			return false;
		}
	}

}
