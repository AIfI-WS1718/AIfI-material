package gridworld.firstProject;

import gridworld.framework.actor.ActorWorld;
import gridworld.framework.actor.Car;

public class CarDriver {

	public static void main(String[] args) {
		ActorWorld world = new ActorWorld(); 
		world.add(new Car(0,0));
		world.show();
	}
}
