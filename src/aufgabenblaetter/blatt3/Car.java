package aufgabenblaetter.blatt3;

import java.util.ArrayList;

import gridworld.framework.actor.Actor;
import gridworld.framework.grid.Grid;
import gridworld.framework.grid.Location;

public class Car extends Actor {
	int speed = 1;
	Grid<Actor> grid = super.getGrid();
	
	public Car() {
		setDirection(90);
	}
	
	@Override
	public void act() {
		Location loc = getLocation();
		int dir = getDirection();
		Location next = loc;
//		gl 4.12. Die Prüfung des Fahrwegs in dieser for-Schleife kann man auch ganz schön mit deiner move()-Methode verbinden.
		for(int i=0;i<speed;i++) {
			next = next.getAdjacentLocation(dir);
			if(next==null) {return;}
//			gl 4.12. Warum wird hier eine Variable angelegt, die überschrieben wird, bevor sie das erste Mal ausgelesen wird?
			ArrayList<Location> liste = super.getGrid().getOccupiedLocations();
			Grid<Actor> test2 = super.getGrid();
			liste = test2.getOccupiedLocations();
			if(liste.contains(next)) {
				speed=i;
				break;
			}
		}
		moveby(speed);
//		gl 4.12. So beschleunigt das Auto wieder, auch wenn es vorher wegen einem Hindernis gebremst hat.
//		Besser das Beschleunigen und Trödeln passiert vor der for-Schleife.
		if(speed<5) {speed++;}
		if(Math.random()<0.2) {speed--;}		
	}
	
	private void moveby(int speed) {
		for(int i=0;i<speed;i++) {
			this.move();
		}
	}

	public void move() {
        Location loc = getLocation();
/*      gl 4.12. Sehr schön, dass das abgefangen wird. Später lernt ihr Fehlerbehandlung in Java,
 * 		damit sieht es eleganter aus als das return in einer void Methode. 
 */
        if(loc==null) {return;}
        Location next = loc.getAdjacentLocation(getDirection());
        grid = super.getGrid();
        if (grid.isValid(next)) {
        	moveTo(next);
        }else {
        	this.removeSelfFromGrid();
        }
	}
	
	
}
