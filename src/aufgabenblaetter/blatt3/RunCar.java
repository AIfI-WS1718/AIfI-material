package aufgabenblaetter.blatt3;

import gridworld.framework.actor.ActorWorld;

public class RunCar {

	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();
		world.add(new Car());
		world.show();
	}
	
}
