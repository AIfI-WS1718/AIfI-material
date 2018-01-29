package uebung9;

import gridworld.framework.actor.ActorWorld;
import uebung5.BabyBug;
import uebung5.Breeder;
import uebung5.DisposableBug;

public class GridWorldPredator {
	public static void main(String[] args) {
		
		ActorWorld predatorWorld = new ActorWorld();
		predatorWorld.add(new BabyBug());
		predatorWorld.add(new BabyBug());
		predatorWorld.add(new BabyBug());
		predatorWorld.add(new Predator());
		predatorWorld.add(new DisposableBug());
		predatorWorld.add(new Breeder());
		predatorWorld.add(new Breeder());
		predatorWorld.add(new Breeder());
		predatorWorld.add(new Breeder());
		predatorWorld.show();
		
		
	}

}
