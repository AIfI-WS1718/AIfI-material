package gridworld.framework.actor;


import gridworld.framework.grid.Grid;
import gridworld.framework.grid.Location;

public class Car extends Actor {

	private int speed = 5; //Speed wird in Act Methode überschrieben  (Beschleunigen)
	private int steps = 0;
	private int sideLength; 
	
	public Car(int length, int steps) {
		this.sideLength = length; 
		this.steps = steps; 
	}
	
	
	
	public void act() { //Schnittstelle zum Framework, Kollisionsabfrage ist auch drin (BUG Z 51), in if eine for schleife mit abfrage ob etwas auf dem feld ist (reagieren und vor trödler bremsen), geschwindigkeit wird auf lauf index reduziert
		if (steps < sideLength /*&& canMove()*/)
        {
            move();
            steps++;
       }
    }
	
	//In CarSources: muss zugriff auf world haben, es ist ein eigneer Actor typ, erben vom actor (schnittstelle: act) 
	
	/*MoveTo nur einmal aufrufen --> Zielfeld
	Für jeden Schritt prüfen, ob etwas drauf ist, dann wird ichts plattgewalzt (in move Methode MoveTo aufrufen)*/
	//trödeln: Math.random(Zufall zwischen 0 und 1) im double dann speed = 1 
	public void move() {
		Grid<Actor> gr = getGrid();
        if (gr == null)
            return; //Methode soll abbrechen (BREAK)
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(90);
        if (gr.isValid(next))
            moveTo(next);
        else
            removeSelfFromGrid();
	}
	
}
