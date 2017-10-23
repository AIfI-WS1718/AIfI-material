package vorlesung.basics;

public class Scope {

	public static void main(String[] args) {
		int aa = 3;
		{
			int bb = 5;
			bb = bb + aa;
			aa = bb + aa;
		}
		System.out.println("aa: " + aa); // ok
//		System.out.println("bb: " + bb); // not ok
	}
	
}
