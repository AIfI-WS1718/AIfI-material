package gridworld.car;

/**
 * Importing needed classes from gridworld package
 */

import gridworld.framework.actor.Actor;
import gridworld.framework.actor.Flower;
import gridworld.framework.grid.Grid;
import gridworld.framework.grid.Location;

public class Car extends Actor{
    /**
     * Instanciates local variables
     */
    int speed;


    /**
     * Constructs a Car
     */
    public Car(){
        this.speed = 5;
    }

    /**
     * Is called in the step() function in ActorWorld
     * at every iteration of the cycle
     <code>
     for (Actor a : actors)
     {
     // only act if another actor hasn't removed a
     if (a.getGrid() == gr)
     a.act();
     }
     }
     </code>
     */
    @Override public void act()
    {
        for(int i=0; i < speed; i++){
            if (canMove()){
                move();
            }
        }
    }

    /**
     * Tests whether this car can move forward into a location that is empty
     * @return true if this Car can move.
     */
    public boolean canMove()
    {
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return false;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        if (!gr.isValid(next))
            return false;
        Actor neighbor = gr.get(next);
        return (neighbor == null);
    }

    /**
     * Moves the Car forward.
     */
    public void move()
    {
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        if (gr.isValid(next))
            moveTo(next);
        else
            removeSelfFromGrid();
    }
}
