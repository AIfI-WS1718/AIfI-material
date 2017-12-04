package uebung.ue7;

public class TransportSimulator {
	Movable agenten[] = new Movable[3];
	agenten[0] = new Ship("BoatyMcBoatface",1.2,2.6);
	agenten[1] = new Helicopter("FlyerMcFlyface",4.1,6.0,8.9);
	agenten[2] = new Elevator("ElevatyMcElevateface",90.2);

	
	public TransportSimulator() {
	}
	
	public void increaseSpeedByRandom(Movable mov) {
		if(mov instanceof CanMoveHorizontally){
			((CanMoveHorizontally) mov).increaseHorizontalSpeed((Math.random()*100));
		}
		if(mov instanceof CanMoveVertically) {
			((CanMoveVertically) mov).increaseVerticalSpeed(Math.random()*10-5);
		}
	}
	public void simulate(int steps) {
		for(int j=0;j<steps;j++) {
			for(int i=0;i<agenten.length;i++) {
				increaseSpeedByRandom(agenten[i]);
				if(agenten[i] instanceof CanMoveHorizontally && Math.random()<0.25) {
					((CanMoveHorizontally) agenten[i]).turnBy(Math.PI/4);
				}
				agenten[i].move();
				System.out.println(agenten[i].toString());
			}
		}
	}
	
	public static void main(String[] args) {
		TransportSimulator fahrzeuge = new TransportSimulator();

	}

}
