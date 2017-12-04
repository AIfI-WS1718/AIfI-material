package aufgabenblaetter.blatt3;

import gridworld.framework.actor.Actor;
import gridworld.framework.actor.ActorWorld;
import gridworld.framework.grid.Location;

public class CarSource extends Actor {
	double spitProbability = 0.3;
	private ActorWorld welt;	
	
//	gl 4.12. vielleicht könnte man die spitProbability konfigurierbar machen, um verschiedene Wahrscheinlichkeiten zu testen.
	public CarSource(ActorWorld world) {
		this.welt = world;
		setDirection(90);
	}
//	gl 4.12. ein @Override wäre hier schön
	public void act() {
		Location selfloc = this.getLocation();
		Location spuckpos = selfloc.getAdjacentLocation(this.getDirection());
		if(super.getGrid().getEmptyAdjacentLocations(selfloc).contains(spuckpos) && Math.random()<spitProbability) {
			welt.add(spuckpos, new Car());
		}
	}
//	gl 4.12. gute Idee :-)
    public void turn()
    {
        setDirection(getDirection() + Location.HALF_RIGHT);
    }
}
