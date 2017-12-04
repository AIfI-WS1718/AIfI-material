package uebung.ue7.transportSimulator;

public class TransportSimulator {

	Movable[] passengerFleet = new Movable[6];

	public static void main(String[] args) {
		TransportSimulator mySim = new TransportSimulator();
		mySim.passengerFleet[0] = (new Elevator("SG 4.1 Fahrstuhl", 0));
		mySim.passengerFleet[1] = (new Elevator("MAR 1", 0));
		mySim.passengerFleet[2] = (new Helicopter("Polizei D-132", 0, 0, 0));
		mySim.passengerFleet[3] = (new Helicopter("Guardia Costiera I-17", 100, 400, 20));
		mySim.passengerFleet[4] = (new Ship("Costa Concordia", 100, 400));
		mySim.passengerFleet[5] = (new Ship("Titanic", 500, 400));

		mySim.simulate(100);
	}

	private static void increaseSpeedByRandom(Movable machine){
		if(machine instanceof CanMoveHorizontally){
			CanMoveHorizontally horizMovingM = (CanMoveHorizontally) machine;
			horizMovingM.increaseHorizontalSpeed(Math.random()*100);
		}
		if(machine instanceof CanMoveVertically){
			CanMoveVertically verticMovingM = (CanMoveVertically) machine;
			verticMovingM.increaseVerticalSpeed(Math.random()*10-5);
		}
	}

	private void simulate(int steps) {
		for(int i = 1; i <= steps; i++){
			for(int j = 0; j < passengerFleet.length; j++){
				increaseSpeedByRandom(passengerFleet[j]);
				if(passengerFleet[j] instanceof CanMoveHorizontally && Math.random() < 0.1){
					CanMoveHorizontally horizMovingM = (CanMoveHorizontally) passengerFleet[j];
					horizMovingM.turnBy(Math.random());
				}
				passengerFleet[j].move();
			}
			if(i%10 == 0){
				System.out.println("\nTransport Simulation, Step " + i);
				for(int j = 0; j < passengerFleet.length; j++){
					System.out.println(passengerFleet[j]);
				}
			}
		}
	}
}


