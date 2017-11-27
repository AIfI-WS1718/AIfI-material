package vorlesung.staticMethods;

public class Random {

	public static void main(String[] args) {
		for (int i=0; i<10; i++) {
			System.out.println("random: " + Math.round(Math.random()*10));
		}
	}
	
}
