package gridworld.car;

/**
 * Importing needed classes from gridworld package
 */

import gridworld.framework.actor.Actor;
import gridworld.framework.grid.Grid;
import gridworld.framework.grid.Location;

import java.awt.*;

public class Car extends Actor{
    /**
     * Instantiates local variables
     */
    int speed;
    int direction;


    /**
     * Constructs a Car
     */
    public Car(){
        this.speed = 5;         // initializes it with 5
        setColor(Color.RED);    // color has to be set
        this.direction =  90;   // to the 'right' =  90 degrees

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
        if(this.speed < 5) speed++; // accelerating
        if(Math.random()<0.2) speed--;
        for(int i=0; i < this.speed; i++){
            if (canMove()) move();
            else {
                System.out.println("Cannot move!");
                this.speed = i; // overwrites the speed if braking was necessary
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
        Location next = loc.getAdjacentLocation(this.direction);
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
        Location next = loc.getAdjacentLocation(this.direction);
        if (gr.isValid(next))
            moveTo(next);
        else
            removeSelfFromGrid();   // remove itself if the grid ended
    }
}
