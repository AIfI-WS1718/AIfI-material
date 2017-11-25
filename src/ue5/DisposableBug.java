package ue5;

import gridworld.framework.actor.Bug;
import java.awt.Color;

public class DisposableBug extends Bug {
	private int cycle = 0;
	
	public DisposableBug() {
		super(Color.BLUE);
	}
	
	@Override
	public void act() {
		if (Math.random() <= 0.4) {
			this.turn();
		} 
		if (Math.random() <= 0.8 && cycle > 25) {
			this.removeSelfFromGrid();
		}
		else {
			super.act();
			cycle++;
		}
	}
	
	
}

