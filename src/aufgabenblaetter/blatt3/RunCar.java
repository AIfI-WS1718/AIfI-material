package aufgabenblaetter.blatt3;

import gridworld.framework.actor.*;
import gridworld.framework.grid.*;

public class RunCar {

	public static void main(String[] args) {
		BoundedGrid grid = new BoundedGrid(1,50);
		ActorWorld world = new ActorWorld(grid);
		world.add(new Car());
		world.add(new Rock());
		world.show();
	}
	
}
