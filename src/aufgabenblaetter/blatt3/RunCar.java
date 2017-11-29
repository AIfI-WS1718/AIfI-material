package aufgabenblaetter.blatt3;

import gridworld.framework.actor.*;
import gridworld.framework.grid.*;

public class RunCar {

	public static void main(String[] args) {
		Location auto = new Location(0, 0);
		BoundedGrid grid = new BoundedGrid(10, 50);
		ActorWorld world = new ActorWorld(grid);
		for (int i = 0; i < 10; i++) { // CarSources hinzufügen
			Location loc = new Location(i, 0);
			world.add(loc, new CarSource(world, i));
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 50; j++) {
				if (Math.random() * 100 + j / 10 > 99) { // Car hinzufügen, wenn Zufallswert erreicht
															// (wahrscheinlichkeit)
					auto = new Location(i, j);
					Car car = new Car();
					world.add(auto, car);
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
