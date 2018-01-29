package uebung.guiFX;

public class Link {
	
	private int id;
	private Node startNode;
	private Node endNode;
	private int capacity;
	private double occupation;
	
	Link(int id, Node startNode, Node endNode, int capacity){
		this.id = id;
		this.startNode = startNode;
		this.endNode = endNode;
		this.capacity = capacity;
	}
	
	int getId(){
		return id;
	}
	
	Node getStartNode(){
		return startNode;
	}
	
	Node getEndNode(){
		return endNode;
	}
	
	int getCapacity(){
		return capacity;
	}
	
	double getOccupation(){
		return occupation;
	}
	
	void calcOccupation(int trafficVolume){
		occupation = ((double) trafficVolume)/capacity;
	}
}
