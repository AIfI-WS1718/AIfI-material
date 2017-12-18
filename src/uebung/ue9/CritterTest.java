package uebung.ue9;

import gridworld.framework.actor.ActorWorld;
import gridworld.framework.actor.Bug;
import gridworld.framework.actor.Critter;

public class CritterTest {

	public static void main(String[] args) {
			
		ActorWorld world = new ActorWorld();
		world.add(new Critter());
		world.add(new Bug());
		world.show();
		
	}

}
