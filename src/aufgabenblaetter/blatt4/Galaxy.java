package aufgabenblaetter.blatt4;

import java.util.ArrayList;

public class Galaxy {

	public static void main(String[] args) {
		GalaxyElement ele1 = new GalaxyElement();
		GalaxyElement ele2 = new GalaxyElement(10, 43, "Teil der Galaxy II", 50.0);
		System.out.println(ele1.toString());
		ele1.groesse = 40.0;
		ele1.x = 37;
		ele1.y = (int) 'ß';
		ele1.name = "Nicht Teil der Galaxy";
		System.out.println(ele1.toString());

		System.out.println(ele2.toString());

		System.out.println("Gr" + (char) 246 + (char) 223 + ": " + ele2.getGroesse());
		System.out.println("x-Postion: " + ele2.getX());
		System.out.println("y-Position: " + ele2.getY());
		System.out.println("Name: " + ele2.getName());

		ArrayList<GalaxyElement> elements = new ArrayList<>();

		for (int i = 0; i < 25; i++) {
			Sun sun = new Sun(i, i * 5, "Sonne" + i, (double) i * Math.random() * 100);
			elements.add(sun);
		}

		for (int i = 25; i < 50; i++) {
			Planet pl = new Planet("Planet" + i, (Sun) elements.get(i - 25), (double) i * Math.random() * 100, i);
			elements.add(pl);
		}
		
		for (int i = 50; i < 62; i++) {
			SpaceShip sp = new SpaceShip("SpaceShip" + i);
			elements.add(sp);
		}
		
		for (int i = 62; i < 75; i++) {
			SpaceShip sp = new SpaceShip(i, i, "SpaceShip" + i, (double) i * Math.random() * 100, (int) (Math.random() * 100));
			elements.add(sp);
		}

		for (int i = 0; i < 75; i++) {
			System.out.println(elements.get(i).toString());
			if (elements.get(i) instanceof Movable) {
				Movable mov = (Movable) elements.get(i);
				mov.move();
			}
		}
		
		for (int i = 0; i < 75; i++) {
			System.out.println(elements.get(i).toString());
			if (elements.get(i) instanceof Movable) {
				Movable mov = (Movable) elements.get(i);
				mov.move();
			}
		}
		
		for (int i = 0; i < 75; i++) {
			System.out.println(elements.get(i).toString());
			if (elements.get(i) instanceof Movable) {
				Movable mov = (Movable) elements.get(i);
				mov.move();
			}
		}
	}

}
