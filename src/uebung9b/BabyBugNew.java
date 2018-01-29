package uebung9b;

import gridworld.framework.actor.Critter;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import gridworld.framework.actor.Actor;
import gridworld.framework.actor.Flower;

import gridworld.framework.grid.Grid;
import gridworld.framework.grid.Location;
import uebung5.Breeder;
import uebung5.DisposableBug;

public class BabyBugNew extends Critter {

	int flowerZaehler = 0;
	Location loc;

	public BabyBugNew() {
		setColor(Color.YELLOW);
	}

	@Override
	public void act() {
		if (getGrid() == null)
			return;
		ArrayList<Actor> actors = getActors();
		processActors(actors);
		ArrayList<Location> moveLocs = getMoveLocations();
		Location loc = selectMoveLocation(moveLocs);
		this.loc = loc;
		makeMove(loc);
	}

	public void processActors(ArrayList<Actor> actors) {
		for (Actor a : actors) {
			if (a instanceof Flower) {
				List<Flower> flowers = new ArrayList<>();
				flowers.add((Flower) a);
				Flower firstFlower = flowers.get(0);
				firstFlower.removeSelfFromGrid();
				flowerZaehler++;
			}
			Grid<Actor> gr = getGrid();
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

	}

}
