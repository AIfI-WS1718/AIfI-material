package blatt4;

import java.util.ArrayList;
import java.util.List;

public class GalaxyElement implements Comparable<GalaxyElement> {
	protected double x;
	protected double y;
	protected int size;
	protected String name;
	
	public GalaxyElement() {
		
	}
	
	public GalaxyElement(String name) {
		this.name = name;
		x = 0;
		y = 0;
		size = 2;
	}
	
	public GalaxyElement(String name, double x, double y, int size) {
		this.name = name;
		this.x = x;
		this.y = y;
		this.size = size;
	}
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name + ", Größe=" + size;
	}
	
	public int compareTo(GalaxyElement o2) {
		if (this.getSize() > o2.getSize()) {
			return 1;
		} if (this.getSize() == o2.getSize()) {
			return 0;
		} else {
			return -1;
		}
		
	}
	
}
