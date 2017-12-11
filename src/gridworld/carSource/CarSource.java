package gridworld.carSource;

/**
 * Importing needed classes from gridworld package
 */
import gridworld.car.Car;
import gridworld.framework.actor.Actor;
import gridworld.framework.actor.ActorWorld;

import gridworld.framework.grid.Grid;
import gridworld.framework.grid.Location;

import gridworld.customExceptions.NoGridException;

public class CarSource extends Actor {
    /**
     * Instantiates local variables
     */
    int speed;
    int direction;


    /**
     * Constructs a Car
     */
    public CarSource(int rows, int columns, ActorWorld world){

        try{
            Grid<Actor> grid = getCarGrid();
        }
        catch(err){
            System.out.println(err);
        }


        // with increased row, increased probability of Car spawn
        double probability = 0.1;
        for(int i=0; i < rows; i++){
            probability+= i*0.1;
            if(Math.random()<probability){
                if()
                world.add(new Location(i,1), new Car());
            }
        }


        public Grid<Actor> getCarGrid() throws RuntimeException {
            Grid<Actor> gr = getGrid();
            throw  new RuntimeException();
        }

    }

}