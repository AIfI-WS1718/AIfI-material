package uebung5;

import java.awt.Color;

public class DisposableBug extends gridworld.framework.actor.Bug {

	public int zyklusZaehler = 0;

	public DisposableBug() {
		super(Color.BLUE);
	}

	public void act() {

		if (Math.random() < 0.6 && canMove())
			move();

		else
			turn();
		zyklusZaehler++;

		if (zyklusZaehler >= 25)

		{

			deadBug();

		}
	}

	public void deadBug() {

		if (Math.random() > 0.2) {
			removeSelfFromGrid();

		}
	}
}
