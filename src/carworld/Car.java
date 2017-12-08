package carworld;

import gridworld.framework.actor.Actor;
import gridworld.framework.actor.Rock;
import gridworld.framework.grid.Grid;
import gridworld.framework.grid.Location;

public class Car extends Actor {
	private int speed = 4;

	public void act() {
		acceleration();
		accidentlySpeedDown();
		speedDown();
		move();

	}

	public void move() {
		Grid<Actor> gr = getGrid();
		if (gr == null) {
			return;
		}
		Location loc = getLocation();
		Location next = new Location(loc.getRow(), loc.getCol() + speed);

		if (gr.isValid(next)) {
			moveTo(next);
		} else {
			removeSelfFromGrid();
		}
	}

	public void speedDown() {
		Grid<Actor> gr = getGrid();
		if (gr == null)
			return;
		Location loc = getLocation();
		// Location next = new Location(loc.getRow(), loc.getCol() + speed);
		// if (!gr.isValid(next))
		// return;
		for (int i = 1; i <= speed; i++) {
			Location locVirtual = new Location(loc.getRow(), loc.getCol() + i);
			if (!gr.isValid(locVirtual)) {
				break;
			}
			Actor neighbor = gr.get(locVirtual);

			if (neighbor instanceof Rock || neighbor instanceof Car) {
				speed = i-1;
				break;
			}
			
		}

	}
	public void acceleration() {
		if (speed<5) {
			speed++;
		}
	}
	public void accidentlySpeedDown() {
		if (Math.random() <=0.2) {
			speed--;
		}
	}

}
