package uebung.ue7;

public class TransportSimulator {
	Movable[] passengerFleet;

	public TransportSimulator(int i) {
		passengerFleet = new Movable[i];
	}

	public static void main(String[] args) {
		TransportSimulator transsim = new TransportSimulator(60);
		for (int i = 0; i < 20; i++) {
			Elevator ele = new Elevator(("Aufzug" + i), 5.0);
			transsim.passengerFleet[i] = ele;
		}
		for (int i = 20; i < 40; i++) {
			Ship ship = new Ship(("Schiff" + i), 5.0, 60.0);
			transsim.passengerFleet[i] = ship;
		}
		for (int i = 40; i < 60; i++) {
			Helicopter hel = new Helicopter(("Helikopter" + i), 3.0, 5.0, 60.0);
			transsim.passengerFleet[i] = hel;
		}
		for (int i = 0; i < 60; i++) {
			transsim.simulate(10, transsim.passengerFleet[i]);
		}
	}

	public void increaseSpeedByRandom(Movable mov) {
		if (mov instanceof Helicopter) {
			((Helicopter) mov).increaseHorizontalSpeed(Math.random() * 100);
			((Helicopter) mov).inceraseVerticalSpeed((Math.random() * 20) - 10);
		} else if (mov instanceof Ship) {
			((Ship) mov).increaseHorizontalSpeed(Math.random() * 100);
		} else if (mov instanceof Elevator) {
			((Elevator) mov).inceraseVerticalSpeed((Math.random() * 20) - 10);
		}
	}

	public void simulate(int steps, Movable mov) {
		for (int j = 0; j < steps; j++) {
			System.out.println(mov.toString());
			increaseSpeedByRandom(mov);
			if (Math.random() * 100 < 25) {
				if (mov instanceof Helicopter) {
					((Helicopter) mov).turnBy(Math.PI / 2);
				} else if (mov instanceof Ship) {
					((Ship) mov).turnBy(Math.PI / 2);
				} else if (mov instanceof Elevator) {

				}
			}
			mov.move();
		}

	}
}