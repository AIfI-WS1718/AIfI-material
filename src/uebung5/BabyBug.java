package uebung5;

import java.awt.Color;

import gridworld.framework.actor.Actor;
import gridworld.framework.actor.Flower;
import gridworld.framework.grid.Grid;
import gridworld.framework.grid.Location;

public class BabyBug extends DisposableBug {

	int flowerZaehler = 0;

	public BabyBug() {
		setColor(Color.YELLOW);

	}

	@Override
	public void move() {
		Grid<Actor> gr = getGrid();
		if (gr == null)
			return;
		Location loc = getLocation();
		Location next = loc.getAdjacentLocation(getDirection());
		if (gr.isValid(next))
			moveTo(next);
		else
			removeSelfFromGrid();

		if (flowerZaehler == 4) {
			removeSelfFromGrid();
			if (Math.random() <= 0.5) {
				DisposableBug disBug = new DisposableBug();
				disBug.putSelfInGrid(gr, loc);
			} else {
				Breeder breBug = new Breeder();
				breBug.putSelfInGrid(gr, loc);
			}
		}

	}

	@Override
	public boolean canMove() {
		Grid<Actor> gr = getGrid();
		if (gr == null)
			return false;
		Location loc = getLocation();
		Location next = loc.getAdjacentLocation(getDirection());
		if (!gr.isValid(next))
			return false;
		Actor neighbor = gr.get(next);
		if (neighbor instanceof Flower) {
			flowerZaehler++;
		}
		return (neighbor == null) || (neighbor instanceof Flower);

	}

}
