package vorlesung.objectDetails;

class CallByValue {

	static void add(int aa, int bb) {
		aa = aa + bb;
	}
	
	static void add(Integer aa, Integer bb) {
		aa = aa + bb;
		// das macht das gleiche wie:
		//aa = new Integer(aa + bb);
		// d.h. es erstellt ein neues Objekt
	}
	
	static void add(String aa, String bb) {
		aa = aa + bb;
	}
	
	public static void main(String[] args) {
		System.out.println("Primitive Typen sind Call-By-Value:");
		int xInt = 3;
		int yInt = 4;
		System.out.println("xInt: " + xInt + ", yInt: " + yInt);
		add(xInt,yInt);
		System.out.println("Nach add(...): xInt: " + xInt + ", yInt: " + yInt);
		
		System.out.println("\nNumber Objekte und Strings sind Call-By-Value:");
		Integer xInteger = new Integer(3);
		Integer yInteger = new Integer(4);
		System.out.println("xInteger: " + xInteger + ", yInteger: " + yInteger);
		add(xInteger, yInteger);
		System.out.println("Nach add(...): xInteger: " + xInteger + ", yInteger: " + yInteger);
		String stringS = "s";
		String stringT = "t";
		System.out.println("stringS: " + stringS + ", stringT: " + stringT);
		add(stringS,stringT);
		System.out.println("Nach add(...): stringS: " + stringS + ", stringT: " + stringT);
	}

}
