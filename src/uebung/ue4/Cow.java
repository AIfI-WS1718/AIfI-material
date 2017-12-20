package uebung.ue4;

public class Cow {
	private String name;
	private boolean hungry = false;
	private static int cowcounter = 0;
	Cow(String name) {
		this.name = name;
		cowcounter++;
		
	}
	
	public void toggle() {
		if (!hungry) {
			hungry=true;
		}
		else {
			hungry = false;
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public static int getCowCount() {
		return cowcounter;
	}
}

