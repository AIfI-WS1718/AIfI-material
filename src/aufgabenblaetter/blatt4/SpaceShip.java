package aufgabenblaetter.blatt4;

public final class SpaceShip extends GalaxyElement implements Movable {

	int speed;
	
	public SpaceShip(int x, int y, String name, double groesse, int speed) {
		super(x,y,name,groesse);
		this.speed = speed;
	}
	
	public SpaceShip(String name) {
		super((int) Math.random() * 100, (int) Math.random() * 100, name, Math.random() * 100);
		this.speed = 5;
	}
	
	@Override
	public void move() {
		
		this.x += speed;
		this.y += speed;
		System.out.println("move space ship");
		
	}

}
