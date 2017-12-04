package uebung.ue4;

public class CallByValue {
	int a;
	
	CallByValue (int a) {
		this.a = a;
	}

	public static void main(String[] args) {
		int x = 1;
		int y = 2;
		add(x, y);
		CallByValue a = new CallByValue(1);
		CallByValue b = new CallByValue(2);
		add(a, b);
		System.out.println(x);
		System.out.println(a.a);
	}

	static void add(int zahl1, int zahl2) {
		zahl1 = zahl1 + zahl2;
	}
	static void add(CallByValue zahl1, CallByValue zahl2) {
		zahl1.a = zahl1.a + zahl2.a;
	}
}
