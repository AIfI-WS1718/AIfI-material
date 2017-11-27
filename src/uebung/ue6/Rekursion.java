package uebung.ue6;

public class Rekursion {

	public static void main(String[] args) {
		System.out.println(factorial(10));
	}
		
	public static long factorial(int n) {
		if (n ==0) {
			return 1;
		} else {
			return factorial(n-1) * n;
		}
	}

}
