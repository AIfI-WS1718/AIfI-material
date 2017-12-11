package uebung.ue7;

public class Plant implements Growable {
	private double height = 0;
	private double weight = 0;
	
	public void grow() {
		height++;
		weight++;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getWeight() {
		return weight;
	}
	
}
