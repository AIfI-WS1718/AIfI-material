package uebung.ue4;

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
}
