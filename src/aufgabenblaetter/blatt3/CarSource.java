package aufgabenblaetter.blatt3;

import gridworld.framework.actor.Actor;
import gridworld.framework.actor.ActorWorld;
import gridworld.framework.grid.Location;

public class CarSource extends Actor {
	double spitProbability = 0.3;
	private ActorWorld welt;	
	
	public CarSource(ActorWorld world) {
		this.welt = world;
		setDirection(90);
	}
	public void act() {
		Location selfloc = this.getLocation();
		Location spuckpos = selfloc.getAdjacentLocation(this.getDirection());
		if(super.getGrid().getEmptyAdjacentLocations(selfloc).contains(spuckpos) && Math.random()<spitProbability) {
			welt.add(spuckpos, new Car());
		}
	}
	
    public void turn()
    {
        setDirection(getDirection() + Location.HALF_RIGHT);
    }
}
