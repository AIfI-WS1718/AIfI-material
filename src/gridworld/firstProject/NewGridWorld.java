package gridworld.firstProject;

import gridworld.framework.actor.ActorWorld;
import gridworld.framework.actor.Bug; 
import gridworld.framework.actor.Rock; 


public class NewGridWorld {

	public static void main (String[] args) {
		
		ActorWorld world = new ActorWorld();
		world.add(new Bug());
		world.add(new Rock());
		world.show();
	}
}
