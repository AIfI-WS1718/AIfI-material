package uebung9;

import java.util.ArrayList;
import java.util.List;

import gridworld.framework.actor.Actor;
import gridworld.framework.actor.Critter;
import uebung5.BabyBug;

public class Predator extends Critter {
	
	public void removeBabyBug() {
		List<Actor> neighbors = new ArrayList<>();
		for (Actor newActor : neighbors) {
			if (newActor instanceof BabyBug) {
				BabyBug victim = new BabyBug();
				victim.removeSelfFromGrid();
			}

		}

	}

}
