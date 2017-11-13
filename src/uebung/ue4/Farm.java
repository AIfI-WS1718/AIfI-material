package uebung.ue4;

class Cow {
	static int cowCounter = 0;
	private String name;
	Cow(String str){
		this.name=str;
		cowCounter++;
	}
	public String getx(){
		return name;
	}
}
	
public class Farm {
	
	public static void main(String[] args){
		Cow cow1 = new Cow ("Frank");
		Cow cow2 = new Cow ("Manfred");
		Cow cow3 = new Cow ("Peter");
		System.out.println(cow1.getx() + " " + cow2.getx() + " " + cow3.getx() + "\nNumber of Cows = " + Cow.cowCounter);
	
}
}
