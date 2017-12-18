package vorlesung.collections.sort;

public class Agent implements Comparable<Agent> {

	private int id;
	private double age;

	public Agent(int id, double age) {
		this.id = id;
		this.age = age;
	}

	public int getId() {
		return this.id;
	}

	public double getAge() {
		return this.age;
	}

	public int compareTo(Agent otherAg) {
		if (this.getId() > otherAg.getId()) {
			return 1;
		} else if (this.getId() == otherAg.getId()) {
			return 0;
		} else {
			return -1;
		}
	}

}
