package ue6;

public class Faculty {
	public static void main(String args[]) {
		System.out.println(recursiveFaculty(5));
	}
	
	public static long recursiveFaculty (int n) {
		
		if (n == 0) {
			return 1;
		} else {
			
			return recursiveFaculty(n-1)*n;
		}
	}
}
