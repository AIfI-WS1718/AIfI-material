package vorlesung.staticMethods;

public class FunctionOverloading {

	static double add(double x, double y) {
		return x+y;
	}
	
	static int add(int x, int y) {
		return x+y;
	}
	
	public static void main(String[] args) {
		int a = 2;
		int b = 4;
		double c = 2.0;
		double d = Math.PI;
		
		System.out.println("a+b = " + add(a,b));
		System.out.println("c+d= " + add(c,d));
		System.out.println("a+c= " + add(a,c));
	}

}
