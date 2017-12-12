package uebung.ue5;

import gridworld.framework.actor.ActorWorld;

public class MyGridWorld {
	
	public static void main(String[] args) {
		
		ActorWorld world = new ActorWorld();
		world.add(new Breeder());
		world.add(new DisposableBug());
		world.add(new DisposableBug());
		
		world.show();
		
	}

}
