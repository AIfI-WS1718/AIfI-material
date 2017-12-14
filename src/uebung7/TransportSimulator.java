package uebung7;

public class TransportSimulator {
	Movable[] passengerFleet;

	public TransportSimulator(Movable[] passengerFleet) {
		this.passengerFleet = passengerFleet;

	}

	public void increaseSpeedByRandom(Movable mov) {
		if (mov instanceof CanMoveHorizontally) {
			CanMoveHorizontally movHorizontal = (CanMoveHorizontally) mov;
			movHorizontal.increaseHorizontalSpeed(Math.random() * 100 - Math.random() * 10);
		}
		if (mov instanceof CanMoveVertically) {
			CanMoveVertically movVertical = (CanMoveVertically) mov;
			movVertical.increaseVerticalSpeed(Math.random() * 100 - Math.random() * 10);	
		}
	}

	public void simulate(int steps) {
		for (int counter = 0; counter < steps; counter++) {
			for (int i = 0; i < passengerFleet.length; i++) {
				increaseSpeedByRandom(passengerFleet[i]);
				if (passengerFleet[i] instanceof CanMoveHorizontally) {
					if (Math.random() <= 0.25) {
						CanMoveHorizontally passFleetHorizontal = (CanMoveHorizontally) passengerFleet[i];
						passFleetHorizontal.turnBy((Math.PI) / 2);

					}
				}
				passengerFleet[i].move();
				 String aa = passengerFleet[i].toString();
				 System.out.println(aa);
				
			}
                  System.out.println("____________________________________");
		}

	}

}
