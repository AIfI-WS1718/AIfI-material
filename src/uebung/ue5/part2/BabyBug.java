package uebung.ue5.part2;

import java.awt.Color;

import gridworld.framework.actor.Actor;
import gridworld.framework.actor.Flower;
import gridworld.framework.grid.Grid;
import gridworld.framework.grid.Location;

public class BabyBug extends DisposableBug {
	
	private int flowersEaten = 0; 
	
	public BabyBug() {
		this.setColor(Color.YELLOW);
	}
	
	@Override
    public void act() {
    	super.act();
    	eatFlowerAhead();
        if (flowersEaten >= 3) {
        	Location location = getLocation();
        	Grid grid = getGrid();
        	removeSelfFromGrid();
        	if(Math.random() <= 0.5) {
        		Breeder breeder = new Breeder();
        		breeder.putSelfInGrid(grid, location);
        	} else {
        		DisposableBug bug = new DisposableBug();
        		bug.putSelfInGrid(grid, location);
        	}
        }
    }
	
	@Override
	public void move() {
		Grid<Actor> gr = getGrid();
		if (gr == null) {
			return;
		}
		Location loc = getLocation();
		Location next = loc.getAdjacentLocation(getDirection());
		if (gr.isValid(next))
			moveTo(next);
		else
			removeSelfFromGrid();
	}
	
	private void eatFlowerAhead() {
		Grid<Actor> gr = getGrid();
		if (gr == null)
			return;
		Location loc = getLocation();
		Location next = loc.getAdjacentLocation(getDirection());
		if(!gr.isValid(next))
			return;
		Actor neighbor = gr.get(next);
		if (neighbor instanceof Flower) {
			neighbor.removeSelfFromGrid();
			flowersEaten++;
		}
	}
}
