package uebung.ue5;

import gridworld.framework.actor.*;

public class DisposableBug extends Bug {
	private int steps = 0;
		@Override
		public void act() {
			if (canMove() && steps <=25) {
	            move();
				steps = 0;
			}
	        else 
	            turn();
			}
}