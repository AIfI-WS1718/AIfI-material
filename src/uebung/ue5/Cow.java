package uebung.ue5;

public class Cow {
	private String name;
	private boolean hungry = false;
	static int cowcounter = 0;
	Cow(String tmp, int count) {
		name = tmp;
		count++;
		cowcounter++;
		
	}
	
	public void toggle () {
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
	public void setName(String tmp) {
		name = tmp;
	}
	
	public static int getCows () {
		return cowcounter;
	}
	
	public Calf giveBirth(String name, String namemother) {
		Calf calf = new Calf(name, namemother);
		return calf;
	}
}

