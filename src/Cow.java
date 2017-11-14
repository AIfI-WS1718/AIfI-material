
public class Cow {

	private String name; 
	private static int cowCounter = 0;
	private boolean hungry = false; 
	
	//Konstruktor 
	public Cow (String name) {
		this.name = name; 
		this.cowCounter ++; 
		this.hungry =! this.hungry; 
	}
	
	public boolean getHungry() {
		return hungry; 
	}
	
	public static int getCowCounter() {
		return cowCounter; 
	}
	
	/*public static void setCowCounter(int cowCounter) {
		this.cowCounter ++; 
	}*/
	
	public String getName() {
		return name; 
	}
	
	protected void setName(String name) {
		this.name = name; 
	}
}
