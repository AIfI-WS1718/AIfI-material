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
/*			gl 4.12. So kann die Geschwindigkeit auch negativ werden, was die vielen Staus auslöst
 * 			und in der Simulation nicht richtig abgebildet wird (Autos bleiben stehen und fahren
 * 			nicht wie in speed angegeben rückwärts
 * 
 * 			Mit einer kleinen Fallunterscheidung kann man das ganz einfach lösen.
 */
			if (Math.random() * 100 <=30) {
				speed -= 1;
			}
			location = getLocation();
			// System.out.println(location.toString());

			for (int i = 1; i <= speed; i++) { // for-Schleife zur Hindernis-PrÃ¼fung

/*				gl 4.12. Ein kleiner Verbesserungsvorschlag: Statt die Breite 50 Spalten fest 
 * 				hineinzuschreiben, kann man sie auch mit getGrid().getNumCols() abfragen.
 */
				if (getLocation().getCol() + i >= 50) {
					break;
				}

				// System.out.println("i (immer:) " + i);
				Location test = new Location(getLocation().getRow(), getLocation().getCol() + i); // prÃ¼fen ob im
				// Abstand von i (maximal im Abstand der Fahrweite) "BlÃ¶cken" ein Hindernis ist.

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
										// moveTo() mit @Override ersetze. Daher die LÃ¶sung mit dem Entfernen bzw. an
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

//	gl 4.12. Sehr schoen :-)
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