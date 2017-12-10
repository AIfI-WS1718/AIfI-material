package gridworld.car;

import gridworld.boxBug.BoxBug;
import gridworld.framework.actor.ActorWorld;
import gridworld.framework.grid.Location;


public class CarRunner {
    public static void main(String[] args)
    {
        // create the world
        ActorWorld world = new ActorWorld();
        // create a car and add it to world
        Car volkswagenGolf = new Car();
        world.add(new Location(1,1), volkswagenGolf);
        // paint the frame
        world.show();
    }
}
