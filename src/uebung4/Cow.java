package uebung4;

public class Cow {
	private String name;
	private static int cowCounter = 0;
	boolean hungry = true;

	
	Cow (String name) {
		
		this.name = name;
		cowCounter++;
	}
	public String getName() {
		return this.name;
	}
	public static int getCowCounter() {
		return cowCounter;
	}
	
}
	


