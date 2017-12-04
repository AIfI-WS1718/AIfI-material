package aufgabenblaetter.blatt3;

import gridworld.framework.actor.ActorWorld;
import gridworld.framework.grid.BoundedGrid;
import gridworld.framework.grid.Location;

/*
 * Feedback gl 4.12.
 * Ok. Sauberer Stil und weitgehend funktional. Ein paar kleine Fehler haben sich aber eingeschlichen.
 */
public class RunCar {

	public static void main(String[] args) {
/*		gl 4.12. Um zu testen, ob alles auch gut funktioniert, wäre hier ein größeres Grid nützlich:
 * 		BoundedGrid myGrid = new BoundedGrid(10, 50);
 * 		ActorWorld world = new ActorWorld(myGrid);
 */
		ActorWorld world = new ActorWorld();	
/*		gl 4.12. Wenn die Autos von links nach rechts fahren, dann musst du eigentlich
 * 		die erste Spalte mit CarSources füllen und entsprechend folgende Bedingung einsetzen
 * 		i<world.getGrid().getNumRows()
 * 		Das hat nur funktioniert, weil das DefaultGrid zufälligerweise quadratisch und damit 
 * 		getNumCols() == getNumRows() ist.
 */
		for(int i=0;i<world.getGrid().getNumCols();i++) {
			Location pos = new Location(i,0);
			world.add(pos,new CarSource(world));
		}
		
		world.show();
		
		
	}
	
}
