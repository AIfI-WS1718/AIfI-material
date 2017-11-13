package vorlesung.typicalObjects;

public class CharacterDemo {

	public static void main(String[] args) {
		Character a = new Character('a');
		Character a2 = new Character('a');
		Character b = new Character('b');
		
		if (a == a2) {
			System.out.println("a == a2");
		} else {
			System.out.println("a != a2");
		}
		
		if (a.equals(a2)) {
			System.out.println("a equals a2");
		} else {
			System.out.println("a not equals a2");
		}
		
		int difference = a.compareTo(b);
		if (difference == 0) {
			System.out.println("a is equal to b.");
		} else if (difference < 0) {
			System.out.println("a is less than b.");
		} else if (difference > 0) {
			System.out.println("a is greater than b.");
		}
	}

}
