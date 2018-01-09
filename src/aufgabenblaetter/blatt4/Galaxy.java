package aufgabenblaetter.blatt4;

import java.util.ArrayList;
import java.util.Iterator;
/*
 * Feedback gl 9.1.
 * Insgesamt in Ordnung. Ein paar inhaltliche Fehler, aber gut lesbarer Code 
 * (ausser dieser main Methode hier). Dazu habe ich noch ein paar Verbesserungsvorschläge /
 * Hinweise geschrieben.
 * Aufgabe 1.4 und 1.5 fehlen.
 */
public class Galaxy {

	public static void main(String[] args) {
		GalaxyElement ele1 = new GalaxyElement();
		GalaxyElement ele2 = new GalaxyElement(10, 43, "Teil der Galaxy II", 50.0);
		System.out.println(ele1.toString());
		ele1.groesse = 40.0;
		ele1.x = 37;
		ele1.y = 522;
		ele1.name = "Nicht Teil der Galaxy";
		System.out.println(ele1.toString());

		System.out.println(ele2.toString());

//		gl 9.1. F\u00FCr die Umlaute kann man auch Unicode-Zeichen verwenden. Das scheint verbreiteter zu sein.
		System.out.println("Gr" + (char) 246 + (char) 223 + ": " + ele2.getGroesse());
		System.out.println("x-Postion: " + ele2.getX());
		System.out.println("y-Position: " + ele2.getY());
		System.out.println("Name: " + ele2.getName());

		ArrayList<GalaxyElement> galaxy = new ArrayList<>();

		for (int i = 0; i < 25; i++) {
			Sun sun = new Sun(i, i * 5, "Sonne" + i, (double) i * Math.random() * 100);
			galaxy.add(sun);
		}

		for (int i = 25; i < 50; i++) {
			Planet pl = new Planet("Planet" + i, (Sun) galaxy.get(i - 25), (double) i * Math.random() * 100, i);
			galaxy.add(pl);
		}

		for (int i = 50; i < 62; i++) {
			SpaceShip sp = new SpaceShip("SpaceShip" + i);
			galaxy.add(sp);
		}

		for (int i = 62; i < 75; i++) {
			SpaceShip sp = new SpaceShip(i, i, "SpaceShip" + i, (double) i * Math.random() * 100,
					(int) (Math.random() * 100));
			galaxy.add(sp);
		}

		for (int i = 0; i < 5; i++) {
			for (Iterator<GalaxyElement> it = galaxy.iterator(); it.hasNext();) {
				GalaxyElement g = it.next();
				if (g instanceof SpaceShip) {
					((SpaceShip) g).hit(Math.random() * 25);
					if (((SpaceShip) g).isDestroyed()) {
						it.remove();
					}
				}
			}
		}

		for (int i = 0; i < galaxy.size(); i++) {
			System.out.println(galaxy.get(i).toString());
			if (galaxy.get(i) instanceof Movable) {
				Movable mov = (Movable) galaxy.get(i);
				mov.move();
			}
		}

		for (int i = 0; i < galaxy.size(); i++) {
			System.out.println(galaxy.get(i).toString());
			if (galaxy.get(i) instanceof Movable) {
				Movable mov = (Movable) galaxy.get(i);
				mov.move();
			}
		}

		for (int i = 0; i < galaxy.size(); i++) {
			System.out.println(galaxy.get(i).toString());
			if (galaxy.get(i) instanceof Movable) {
				Movable mov = (Movable) galaxy.get(i);
				mov.move();
			}
		}
	}

}
