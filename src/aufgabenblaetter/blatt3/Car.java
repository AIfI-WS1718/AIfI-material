package aufgabenblaetter.blatt3;

import gridworld.framework.actor.*;
import gridworld.framework.grid.Location;

public class Car extends Actor {

	private int speed = 5;
	private Location location = new Location(1, 1);
	private boolean stop = false;
	private String typ;

	public Car() {
		int speed = 5;
	}

	@Override
	public void act() {
		if (!stop) { // wenn der Wagen nicht gestoppt ist
			if (speed < 5) {
				speed += 1;
			}
			if (Math.random() * 100 <=30) {
				speed -= 1;
			}
			location = getLocation();
			// System.out.println(location.toString());

			for (int i = 1; i <= speed; i++) { // for-Schleife zur Hindernis-Prüfung

				if (getLocation().getCol() + i >= 50) {
					break;
				}

				// System.out.println("i (immer:) " + i);
				Location test = new Location(getLocation().getRow(), getLocation().getCol() + i); // prüfen ob im
				// Abstand von i (maximal im Abstand der Fahrweite) "Blöcken" ein Hindernis ist.

				if (!canMove(test)) { // wenn ein Hindernis entdeckt wird:
					System.out.println("Hindernis erkannt: " + typ + ". Fahre bis zum Hindernis."); // melden
					// System.out.println(test.getCol() + " i: " + i);
					speed = i - 1; // Geschwindigkeit so setzen, dass er eins vorher ankommt.
					stop = true; // und stoppen
				}
			}
			Location newlocation = new Location(location.getRow(), location.getCol() + speed);
			if (super.getGrid().isValid(newlocation)) {
				moveTo(newlocation); // Beim aus dem Grid herausfahren gibt er eine Fehlermeldung aus. Auch wenn ich
										// moveTo() mit @Override ersetze. Daher die Lösung mit dem Entfernen bzw. an
										// den Anfang setzen.
			} else {
				this.removeSelfFromGrid();
				/*
				 * alternative: newlocation = new Location(location.getRow(), 0);
				 * moveTo(newlocation);
				 */
			}
		}
	}

	public boolean canMove(Location next) {
		if (getGrid().get(next) instanceof Rock) { // wenn daneben ein Stein ist --> melden
			typ = "Stein";
			return false;
		} 
		else if (getGrid().get(next) instanceof Car) {
			typ = "Auto";
			return false;
		}
		else {
			return true;
		}

	}
}