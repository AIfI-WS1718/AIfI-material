package ue4;

public class Cow {
	protected String name;
	private static int cowCounter = 0;
	boolean hungry = true;
	
	public Cow (String name) {
		this.name = name;
		cowCounter++;
	}
	
	public String getName() {
		return this.name;
	}
	
	public static int getCount() {
		return cowCounter;
	}
	
	public void toggleHungry() {
		if (hungry == false) {
			hungry = true;
		} else {
			hungry = false;
		}
	}
	
	public Calf giveBirth(String name) {
		return new Calf(name, this);
	}

}