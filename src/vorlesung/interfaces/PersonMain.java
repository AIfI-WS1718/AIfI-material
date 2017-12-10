package vorlesung.interfaces;

import vorlesung.interfaces.ohneVererbung.PersonI;
import vorlesung.interfaces.ohneVererbung.PersonImpl1;

public class PersonMain {
	
	public static void main(String[] args) {
//		PersonI person = new PersonI(); //does not compile!
		PersonI person = new PersonImpl1();
		person.setAge(20);
		
		System.out.println(PersonI.DRIVING_AGE);
	}

}
