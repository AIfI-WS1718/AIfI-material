package uebung.ue7.transportSimulator;

public interface CanMoveHorizontally extends Movable {
	
	void increaseHorizontalSpeed(double by);
	void turnBy(double radians);
	
}


