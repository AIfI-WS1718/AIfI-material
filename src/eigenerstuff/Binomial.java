package eigenerstuff;

public class Binomial {
	public static double binomial(int n, int k) {	
		return(fak(k) / (fak(k)*fak(n-k)));
	}

	public static double fak(int k) {
		double zaehler = 1;
		for(int i = 1;i<=k;i++) {
			zaehler = zaehler * i;
		}
		return zaehler;
	}
	
	public static void main(String[] args){
		double biko = binomial(49,6);
		System.out.println(fak(6));
		System.out.println("Der Binomialkoeffizient von 6 über 49 ist:" + biko);
	}
}
