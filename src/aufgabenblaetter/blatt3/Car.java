package aufgabenblaetter.blatt3;

import java.util.ArrayList;

import gridworld.framework.actor.Actor;
import gridworld.framework.grid.Grid;
import gridworld.framework.grid.Location;

public class Car extends Actor {
	int speed = 1;
	Grid<Actor> grid = super.getGrid();
	
	public Car() {
		setDirection(90);
	}
	
	@Override
	public void act() {
		Location loc = getLocation();
		int dir = getDirection();
		Location next = loc;
		for(int i=0;i<speed;i++) {
			next = next.getAdjacentLocation(dir);
			if(next==null) {return;}
			ArrayList<Location> liste = super.getGrid().getOccupiedLocations();
			Grid<Actor> test2 = super.getGrid();
			liste = test2.getOccupiedLocations();
			if(liste.contains(next)) {
				speed=i;
				break;
			}
		}
		moveby(speed);
		if(speed<5) {speed++;}
		if(Math.random()<0.2) {speed--;}		
	}
	
	private void moveby(int speed) {
		for(int i=0;i<speed;i++) {
			this.move();
		}
	}

	public void move() {
        Location loc = getLocation();
        if(loc==null) {return;}
        Location next = loc.getAdjacentLocation(getDirection());
        grid = super.getGrid();
        if (grid.isValid(next)) {
        	moveTo(next);
        }else {
        	this.removeSelfFromGrid();
        }
	}
	
	
}
