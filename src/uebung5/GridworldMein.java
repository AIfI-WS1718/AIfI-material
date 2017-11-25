package uebung5;

import gridworld.framework.actor.ActorWorld;
import gridworld.framework.actor.Rock;

public class GridworldMein {
	public static void main(String[] args) {
		
	
	ActorWorld worldNew = new ActorWorld();
	worldNew.add(new DisposableBug());
	worldNew.add(new Rock());
	worldNew.show();
	
	}
}
