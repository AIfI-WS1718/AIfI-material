package uebung.guiFX;

public class Node {
	
	private int id;
	private int coordinateX;
	private int coordinateY;
	
	Node(int id, int x, int y){
		this.id = id;
		this.coordinateX = x;
		this.coordinateY = y;
	}

	int getId(){
		return id;
	}
	
	int getCoordinateX(){
		return coordinateX;
	}
	
	int getCoordinateY(){
		return coordinateY;
	}
}
