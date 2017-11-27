package uebung.uebungsaufgaben;

public class FakultaetBerechnen {

	public static int Fakultaet (int n) {
		if (n==1){
			return 1;
		} else {
			return (Fakultaet(n-1)*n);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int eingabe = 5;
		System.out.println(Fakultaet(eingabe));
	}

}
