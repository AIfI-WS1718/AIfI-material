package uebung5;

public class Fakultaet {

	public static void main( String[] args) {
		System.out.println(fak(3));
	}

	
	public static int fak(int x) {
		
		if (x == 0) {
			return 1; 
		}else {
			return x*fak(x-1);
		}
	}
}
