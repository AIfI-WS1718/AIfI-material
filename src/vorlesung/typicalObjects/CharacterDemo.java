package vorlesung.typicalObjects;

public class CharacterDemo {

	public static void main(String[] args) {
		Character a = new Character('a');
		Character a2 = new Character('a');
		Character b = new Character('b');
		
		if (a == a2) { //Nützlich für primitive Datentypen, equals ist für kompliziertere Datentypen, da equals tatsächlich den Wert des Char vergleicht 
			System.out.println("a == a2");
		} else {
			System.out.println("a != a2");
		}
		
		if (a.equals(a2)) {			//Equals funktioniert fpr alle Objekte 
			System.out.println("a equals a2");
		} else {
			System.out.println("a not equals a2");
		}
		
		int difference = a.compareTo(b); //CompareTo Methode lexikografischer Vergleich wenn der eine Char vor dem anderen im Alphabet vor dem anderen steht, kommt ein bestimmter Wert zurück. ANhand dessen ist es möglich die differenz von werten zu vergleichen 
		if (difference == 0) {			//Funktioniert auch für Strings
			System.out.println("a is equal to b.");
		} else if (difference < 0) {
			System.out.println("a is less than b.");
		} else if (difference > 0) {
			System.out.println("a is greater than b.");
		}
	}

}
