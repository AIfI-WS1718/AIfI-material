package vorlesung.typicalObjects;

public class NumberKonvertierung {

	public static void main(String[] args) {
		// Number Objekte erzeugen:
		Integer myInteger = new Integer(3);
		Long myLong = new Long(3333333);
		
		// Number, Objects -> String
		String IntegerToString = myInteger.toString();
		String IntegerValueOf = String.valueOf(myInteger);
		System.out.println("myInteger toString: " + IntegerToString);
		System.out.println("myInteger valueOf: " + IntegerValueOf);
		
		// String, primitive Types, ... -> Number
		String str = "123";
		Double myDouble1 = new Double(str);
		Double myDouble2 = Double.valueOf(str);
		System.out.println("MyDouble Konstruktor: " + myDouble1);
		System.out.println("MyDouble valueOf: " + myDouble2);
		
		// Number -> primitive Type
		double primitiveDouble = myDouble1.doubleValue();
		long primitiveLong = myDouble1.longValue();
		System.out.println("primitiveDouble: " + primitiveDouble + ", primitiveLong: " + primitiveLong);
		
		// String -> primitive Type
		String str2 = "4567";
		double parseDouble = Double.parseDouble(str2);
//		str2.doubleValue(); // geht nicht!!
		
		// casting (Alternative zum Konvertieren, macht aber nicht immer das Gewünschte)
		double dbl = 3.5;
		int val = (int) dbl;
	}

}
