package ue4;

public class Cow{
	private static int cowcount = 0;
	private String name;
	private int hungry = 1;
	
	Cow(String kuhname){
		setName(kuhname);
		cowcount = cowcount +1;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static int getCowCount(){
		return cowcount;
	}
	public int getHungry() {
		return this.hungry;
	}
	public void toggleHungry() {
		if(this.hungry==1) {
			this.hungry = 0;
		}
		else {
			this.hungry = 1;
		}
	}

}

