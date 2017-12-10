package uebung.ue5.part2;

import gridworld.framework.actor.ActorWorld;
import gridworld.framework.actor.Bug;
import gridworld.framework.actor.Rock;

public class BugsRunner {
	
    public static void main(String[] args) {
        ActorWorld world = new ActorWorld();
        
        world.add(new Bug());
        world.add(new DisposableBug());
        world.add(new Breeder());
        world.add(new Rock());
        world.show();
    }
}
