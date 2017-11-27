package uebung04;

public class Cow {
	
	private static int cowCounter = 0;
	private String name ;
	private boolean hungry = true;
	
	public Cow (String name) {
		this.name = name;
		cowCounter++;
	}
	
	public String getName() {
		return this.name;
	}
	
	public static int getCowCount() {
		return cowCounter;
	}
	
	public boolean isHungry() {
		return this.hungry;
	}
	
	public void toggleHungry() {
		this.hungry = !this.hungry;
	}
	public Calf giveBirth(String name) {
		Calf calf = new Calf(name, this);
		return calf;
	}
}

