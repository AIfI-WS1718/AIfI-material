package carworld;

import gridworld.framework.actor.ActorWorld;
import gridworld.framework.actor.Rock;
import gridworld.framework.grid.Grid;
import gridworld.framework.grid.Location;

public class CarRunner {

	public static void main(String[] args) {

		ActorWorld worldNew = new ActorWorld();
		Location loc = new Location(4, 5);
		worldNew.add(new Car());
		worldNew.add(new Rock());
		worldNew.add(new Rock());
		worldNew.add(loc, new Rock());
		addCarSorce(worldNew);

		// addCarSorce(worldNew);

		worldNew.show();

	}

	public static void addCarSorce(ActorWorld worldNew) {
		Grid gr = worldNew.getGrid();
		int rows = gr.getNumRows();
		int rowNumber;
		for (rowNumber = 0; rowNumber < rows; rowNumber++) {
			Location locCarSorce = new Location(rowNumber, 0);
			worldNew.add(locCarSorce, new CarSource());
		}
	}

}
