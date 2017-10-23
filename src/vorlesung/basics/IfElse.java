package vorlesung.basics;

public class IfElse {

	public static void main(String[] args) {
		int aa = 5;
		if (aa >= 10) {
			System.out.println("aa groesser gleich 10");
		} else {
			System.out.println("aa kleiner als 10");
		}
		
		if (aa < 10) {
			System.out.println("kleiner 10");
		} else if (aa < 20) {
			System.out.println("kleiner 20, nicht kleiner 10");
		} else {
			System.out.println("groesser 20");
		}
	}

}
