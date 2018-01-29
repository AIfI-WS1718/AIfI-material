package uebung9b;

import gridworld.framework.actor.ActorWorld;
import gridworld.framework.actor.Flower;

public class GridWorldMeinNew {
	public static void main(String[] args) {
		ActorWorld actorWorldNewb = new ActorWorld();
		actorWorldNewb.add(new BabyBugNew());
		actorWorldNewb.add(new BabyBugNew());
		actorWorldNewb.add(new Flower());
		actorWorldNewb.add(new Flower());
		actorWorldNewb.add(new Flower());
		actorWorldNewb.add(new Flower());
		actorWorldNewb.add(new Flower());
		actorWorldNewb.add(new Flower());
		actorWorldNewb.add(new Flower());
		actorWorldNewb.add(new Flower());
		actorWorldNewb.add(new Flower());
		actorWorldNewb.show();
	}

}
