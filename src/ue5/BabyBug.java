package ue5;

import java.awt.Color;

import gridworld.framework.actor.Actor;
import gridworld.framework.actor.Bug;
import gridworld.framework.actor.Flower;
import gridworld.framework.grid.Grid;
import gridworld.framework.grid.Location;

public class BabyBug extends DisposableBug {
	public BabyBug() {
		this.setColor(Color.YELLOW);
	}
	
	int flowers = 0;
	
	@Override
	public void act() {
		super.act();
		eatFlowerInFront();
		if(flowers >= 3) {
			Location loc = getLocation();
			Grid gr = getGrid();
			removeSelfFromGrid();
			if(Math.random() <= 0.5) {
				Breeder breeder = new Breeder();
				breeder.putSelfInGrid(gr, loc);
			} else {
				DisposableBug bug = new DisposableBug();
				bug.putSelfInGrid(gr, loc);
			}
		}
	}
	
	@Override
	public void move()
    {
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        if (gr.isValid(next))
            moveTo(next);
        else
            removeSelfFromGrid();
       
    }
	
	public void eatFlowerInFront() {
		Grid<Actor> gr = getGrid();
        if (gr == null)
            return;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        if (!gr.isValid(next))
           return;
        Actor neighbor = gr.get(next);
        if (neighbor instanceof Flower) {
        	neighbor.removeSelfFromGrid();
        	flowers++;
        }
	}
}
