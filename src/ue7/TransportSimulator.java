package ue7;

public class TransportSimulator {	
	Movable[] passengerFleet = new Movable[3];
	
	
	public void increaseSpeedByRandom(Movable mov) {
		if (mov instanceof CanMoveHorizontally) {
			((CanMoveHorizontally) mov).increaseHorizontalSpeed(Math.random()*100);
		}
		if (mov instanceof CanMoveVertically) {
			((CanMoveVertically) mov).increaseVerticalSpeed((Math.random()*10)-5);
		}
		
	}
	
	public void simulate(int steps) {
		for (int j= 1; j <= steps; j++) {
			for (int i = 0; i < passengerFleet.length; i++) {
				increaseSpeedByRandom(passengerFleet[i]);
			
				passengerFleet[i].move();
				
			}
		}
		
	}
	
	public void main(String[] args) {
		TransportSimulator simulator = new TransportSimulator();
		
		simulator.passengerFleet[0] = new Elevator("Fahrstuhl", 0);
		
		simulator.simulate(1);
	}
}
