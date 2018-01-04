package uebung.ue9.aufgabe2;

import java.util.ArrayList;

import gridworld.framework.actor.Actor;
import gridworld.framework.actor.Critter;

public class Predator extends Critter {
	
	@Override
	public void processActors(ArrayList<Actor> actors) {
		
		for(Actor actor: actors) {
			if(actor instanceof BabyBug) {
				actor.removeSelfFromGrid();
				break;
			}
		}
	}
}
