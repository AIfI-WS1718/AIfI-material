package gridworld.customExceptions;
import gridworld.framework.grid.Grid;
import gridworld.framework.actor.Actor;


public class NoGridException extends Exception {
    public String NoGridException(Grid<Actor> grid){
        if (grid == null) return "No grid specified";
        else return "Grid is not null. Unspecified error occured.";
    }
}
