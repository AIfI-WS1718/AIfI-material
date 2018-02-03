package aufgabenblaetter.blatt5.aufg2;

public class euklidischerAlgo {

	public static void main(String[] args) {
		System.out.println(ggT(80, 3));
	}
	
	public static int ggT (int z1, int z2) {
		if (z2 == 0) {
			return z1;
		} 
		int rest = z1 % z2;
		return ggT(z2,rest);
	}
	
}
