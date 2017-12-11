package gridworld.car;

import gridworld.framework.actor.ActorWorld;
import gridworld.framework.grid.Location;
import gridworld.framework.grid.BoundedGrid;


public class CarRunner {
    public static void main(String[] args)
    {
        int rows = 10, columns = 50;

        // create the world
        ActorWorld world = new ActorWorld(new BoundedGrid<>(rows, columns));
        // create a car and add it to world




        // paint the frame
        world.show();
    }
}
