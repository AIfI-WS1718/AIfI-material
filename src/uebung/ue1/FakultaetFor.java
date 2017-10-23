package uebung.ue1;

public class FakultaetFor {

	public static void main(String[] args) {
		int no = 20;
		long fac = 1;
		
		for (int i=1; i<=no; i++) {
			fac = i*fac;
		}
		System.out.println(fac);
	}

}
