package uebung5;

import java.awt.Color;

public class DisposableBug extends gridworld.framework.actor.Bug {

	public int zyklusZaehler = 0;

	public DisposableBug() {
		super(Color.BLUE);
	}

	@Override
	public void act() {
		if (Math.random() <= 0.4) {
			turn();
		}
		if (zyklusZaehler >= 25 && Math.random() >= 0.2) {
			removeSelfFromGrid();
		}

		else {
			super.act();
			zyklusZaehler++;
		}

	}

}
