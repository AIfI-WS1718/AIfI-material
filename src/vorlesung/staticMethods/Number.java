package vorlesung.staticMethods;

public class Number {

	public static void main(String[] args) {
		Integer myVariable = 4;
		Long myLong = new Long (333333333); 
		System.out.println("Mein Integer: " + myVariable.toString()); //In String mit to.String() methode: 
		// System.out.println("valueOf: " + String.valueOf(myVariable)); //Value.of Methode kann auf null auch aufgerufen werden 
	
		//Value Of Methode ist statisch, mithilfe deren man String in Double umwandlen kann 
		String str = "123"; 
		Double myDouble = Double.valueOf(str); 
		System.out.println("MyDouble: " + myDouble); 
		
		//String --> Primitive umwandeln 
		String abc = "543"; 
		double bb = Double.parseDouble(abc); 
		System.out.println(abc);
	
	}
	
	//Statische Methode sind von der Instanz des Objektes unabhöngig
	
	//Konvertierung mit einem Casting, um die Datentypen anzupassen 
	// double a = 5.5; 
	// int b = (a); 
	
	
	
	
	
}
