package uebung6;

public class Split {
	public static void main(String[] args) {
		String my = "w,13,35,y6,vv";
		String[] splitted = my.split(",");
		System.out.println(splitted[3]); // trennt einen Eintag von den anderen (hier 3.)

	}
	
}
