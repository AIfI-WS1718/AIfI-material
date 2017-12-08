package carworld;

import gridworld.framework.actor.Actor;
import gridworld.framework.grid.Grid;
import gridworld.framework.grid.Location;

public class CarSource extends Car {

	double spuckProbability = 0.7;

	public CarSource() {

		super.setDirection(Location.EAST);

	}

	public void act() {

		if (placeValid()) {
			putNewCar();
		}
	}

	public void putNewCar() {
		Grid<Actor> gr = getGrid();
		if (gr == null)
			return;
		Location loc = getLocation();
		Location next = loc.getAdjacentLocation(getDirection());
		Car newCar = new Car();
		Location nextNewCarLocation = new Location(next.getRow(), next.getCol());
		if (Math.random() <= spuckProbability) {
			newCar.putSelfInGrid(gr, nextNewCarLocation);
		}
	}

	public boolean placeValid() {
		Grid<Actor> gr = getGrid();
		if (gr == null)
			return false;
		Location loc = getLocation();
		Location next = loc.getAdjacentLocation(getDirection());
		if (!gr.isValid(next))
			return false;
		Actor neighbor = gr.get(next);
		return (neighbor == null);

	}
}
