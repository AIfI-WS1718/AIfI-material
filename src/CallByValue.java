
public class CallByValue {

	static void add (int aa, int bb) {
		aa = aa + bb; 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 3; 
		int y = 4; 
		add(x,y);
		System.out.println("x = " + x + ", y = " + y); //X ist weiterhin unverändert, da primitiven Typen nur die Kopie des Wertes übergeben bekommen 
	}

}
