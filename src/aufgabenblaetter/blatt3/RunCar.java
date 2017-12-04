package aufgabenblaetter.blatt3;

import gridworld.framework.actor.*;
import gridworld.framework.grid.*;
/*
 * Feedback gl 27.11.
 * Sehr Gut! Sauberer Stil und funktional. Sogar mit passenden Bildchen :-)
 * Es gibt nur ein paar kleine Verbesserungsvorschlaege, aber die Loesung ist auch schon schoen so wie sie ist.
 */
public class RunCar {

	public static void main(String[] args) {
		Location auto = new Location(0, 0);
/*		gl 4.12. Ein kleiner Verbesserungsvorschlag: Nutze doch Variablen für die Anzahl
 * 		der Spalten und der Reihen. Dann kannst du diese auch in den for-Schleifen verwenden.
 * 		Das macht das Programm besser lesbar und leichter an andere grid-Groessen anpassbar.
 */
		BoundedGrid grid = new BoundedGrid(10, 50);
		ActorWorld world = new ActorWorld(grid);
		for (int i = 0; i < 10; i++) { // CarSources hinzufÃ¼gen
			Location loc = new Location(i, 0);
			world.add(loc, new CarSource(world, i));
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 50; j++) {
				if (Math.random() * 100 + j / 10 > 99) { // Car hinzufÃ¼gen, wenn Zufallswert erreicht
															// (wahrscheinlichkeit)
					auto = new Location(i, j);
					Car car = new Car();
					world.add(auto, car);
/*					gl 4.12. Es gibt in GridWorld auch ein paar Methoden, die eleganter feststellen können, ob ein Feld besetzt ist.
 * 					z.B. car.getGrid().getEmptyAdjacentLocations(loc)
 * 					Das hat den Vorteil, dass du nicht alle möglichen Actor-Typen hier aufzählen musst.
 * 					Auch instanceof Actor muesste gehen.
 */		
					if ((car.getGrid().get(auto) instanceof CarSource || car.getGrid().get(auto) instanceof Rock)) { // Wenn
						// Platz durch Stein oder CarSource belegt, dann entfernen
						car.removeSelfFromGrid();
					}
				}
			}
		}
		for (int i = 0; i < 5; i++) {
			world.add(new Rock());
		}

		world.show();
	}

}
