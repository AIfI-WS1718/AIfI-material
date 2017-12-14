package uebung7;

public class TestMovable {
	
	
	public static void main(String[] args) {
		Movable[] passengerFleet;
		passengerFleet = new Movable[3];
		Elevator el = new Elevator("Kuzya", 10);
		passengerFleet[0] = el;
		Ship sh = new Ship("Borya", -3, 27);
		passengerFleet[1] = sh;
		Helicopter he = new Helicopter("Roberto", -45, -7, -193);
		passengerFleet[2] = he;

	TransportSimulator trSim = new TransportSimulator(passengerFleet);
	trSim.simulate(5);
		
	}

}
