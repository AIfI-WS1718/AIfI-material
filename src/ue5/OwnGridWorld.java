package ue5;

import gridworld.framework.actor.ActorWorld;
import gridworld.framework.actor.Bug;
import gridworld.framework.actor.Rock;




public class OwnGridWorld {
	public static void main(String args[]) {
		ActorWorld world = new ActorWorld();
		
		world.add(new BabyBug());
		world.add(new Rock());
		
		world.show();
		
	}
}
