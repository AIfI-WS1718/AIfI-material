package aufgabenblaetter.blatt3;

import gridworld.framework.actor.Actor;
import gridworld.framework.grid.Location;

public class Car extends Actor {

	int speed = 5;
	Location location = new Location(1, 1);
	
		public Car() {
			int speed = 5;
		}
		
		@Override
		public void act() {
			location = getLocation();
			System.out.println(location.toString());
			Location newlocation = new Location(location.getRow(), location.getCol()+speed);
			if (super.getGrid().isValid(newlocation)) {
				moveTo(newlocation); // Beim aus dem Grid herausfahren gibt er eine Fehlermeldung aus. Auch wenn ich moveTo() mit @Override ersetze. Daher die Lösung mit dem Entfernen.
			}
			else {
				//alternativ:this.removeSelfFromGrid();
				newlocation = new Location(location.getRow(), 0);
				moveTo(newlocation);
			}
		}
		
}
