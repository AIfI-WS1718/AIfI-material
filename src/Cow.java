
public class Cow {

	private String name; 
	private static int cowCounter = 0;
	private boolean hungry = false; 
	
	//Konstruktor 
	public Cow (String name) {
		this.name = name; 
		this.cowCounter ++; 
	}
	
	public boolean getHungry() {
		return this.hungry; 
	}
	
	public static int getCowCounter() {
		return cowCounter; 
	}
	
	
	public String getName() {
		return name; 
	}
	
	protected void setName(String name) {
		this.name = name; 
	}
	
	public boolean isHungry() {
		return this.hungry; 
	}
	
	public void toddleHungry() {
		this.hungry =! this.hungry; 
	}
	
	public Calf giveBirth(String name) {
		return baby = new Calf; 
	}
}
