package gridworld.firstProject;
import gridworld.framework.actor.ActorWorld;
import gridworld.framework.actor.Bug;
import gridworld.framework.actor.Rock;

public class Backfisch {
	public static void main(String[] args) {
		ActorWorld backfischwelt = new ActorWorld();
		backfischwelt.add(new Bug());
		backfischwelt.add(new Bug());
		backfischwelt.add(new Rock());
		backfischwelt.show();
	}
}
