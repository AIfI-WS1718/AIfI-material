package vorlesung.objectDetails;

class CallByReference {
	
	static void add (ComplexNumber a, ComplexNumber b) {
		a.real = a.real + b.real;
		a.imag = a.imag + b.imag;
	}
	
	static void add (MyInteger a, MyInteger b) {
		a.value = a.value + b.value;
	}

	public static void main(String[] args) {
		System.out.println("Eigene Objekte sind Call-By-Reference:");
		ComplexNumber cn1 = new ComplexNumber(3, 4);
		ComplexNumber cn2 = new ComplexNumber(4, 66);
		System.out.println("cn1: (" + cn1.real + "," + cn1.imag + "), cn2: (" + cn2.real + "," + cn2.imag + ")");
		add (cn1, cn2);
		System.out.println("cn1 nach add(...): (" + cn1.real + "," + cn1.imag + ")");
		
		System.out.println("\nAuch wenn man primitive Typen selbst nachimplementiert hat man Call-By-Reference:");
		MyInteger myInt1 = new MyInteger(31415);
		MyInteger myInt2 = new MyInteger(27182);
		System.out.println("myInt1: " + myInt1.value + ", myInt2: " + myInt2.value);
		add(myInt1, myInt2);
		System.out.println("myInt1 nach add(...): " + myInt1.value);
	}

}
