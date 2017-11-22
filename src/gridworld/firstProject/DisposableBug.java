package gridworld.firstProject;

import java.awt.Color;

import gridworld.framework.actor.Bug;

public class DisposableBug extends Bug{
	private int cycle = 0;
	
	DisposableBug(){
		setColor(Color.BLUE);
	}
	DisposableBug(Color foo){
		this();
	}
	
	@Override
	public void act() {
		{
			if (cycle>=25) {
				if(Math.random()>0.2) {super.removeSelfFromGrid();}
				cycle = 0;
			} else {
	        if (canMove())
	            move();
	        else
	            turn();
			}
			if(Math.random()>0.6) {turn();}
			cycle = cycle +1;
	    }
	}
}
