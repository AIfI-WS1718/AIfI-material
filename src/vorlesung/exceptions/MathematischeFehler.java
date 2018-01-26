package vorlesung.exceptions;

public class MathematischeFehler {

	public static void main(String[] args) {
		double a = -1.;
		double b = 0.;
		System.out.println(a/b);
		System.out.println(b/b);

		int x = 1;
		int y = 0;
		System.out.println(x/Math.sqrt(y));
		System.out.println(x/y);	
	}
	
}
