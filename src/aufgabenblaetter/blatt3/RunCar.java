package aufgabenblaetter.blatt3;

import gridworld.framework.actor.ActorWorld;
import gridworld.framework.grid.BoundedGrid;
import gridworld.framework.grid.Location;

public class RunCar {

	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();
		
		for(int i=0;i<world.getGrid().getNumCols();i++) {
			Location pos = new Location(i,0);
			world.add(pos,new CarSource(world));
		}
		
		world.show();
		
		
	}
	
}
