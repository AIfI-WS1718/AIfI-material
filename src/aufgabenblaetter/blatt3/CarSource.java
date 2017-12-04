package aufgabenblaetter.blatt3;

import gridworld.framework.actor.*;
import gridworld.framework.grid.*;

public class CarSource extends Actor {
	private ActorWorld world;
	private Location loc;

	public CarSource(ActorWorld world, int posx) {
		this.world = world;
		loc = new Location(posx, 1);
	}

/*	gl 4.12. Ein kleiner Verbesserungsvorschlag: Man kˆnnte die Wahrscheinlichkeit konfigurierbar machen und
 * sich dann z.B. verschiedene CarSources mit verschiedenen Auto-Hinzuf¸ge-Wahrscheinlichkeiten gleichzeitig angucken.
 */
	@Override
	public void act() {
		if (!(getGrid().get(loc) instanceof Car || getGrid().get(loc) instanceof Rock) && Math.random() * 100 > 85) { // wenn
			// frei und Zufallswert errreicht (Wahrscheinlichkeit), Auto hinzuf√ºgen
			world.add(loc, new Car());
		}
	}
}
