package vorlesung.basics;

public class Schleifen {

	public static void main(String[] args) {
		// while schleife
		int ii = 0;
		while (ii < 10) {
			System.out.println("ii " + ii);
			ii++;
		}
		
		// do-while schleife
		int jj = 0;
		do {
			System.out.println("jj " + jj);
			jj++;
		} while (jj < 10);
		
		// for schleife
		for (int kk=0; kk<10; kk++) {
			System.out.println("kk ist " + kk);
		}
		
		// for schleife ohne argumente (endlosschleife)
		for ( ; ; ) {
			System.out.println("Hallo");
		}
	}

}
