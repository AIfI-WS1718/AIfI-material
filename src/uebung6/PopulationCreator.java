package uebung6;

import com.sun.beans.editors.StringEditor;

import generator.NameAndBirthYearGenerator;

public class PopulationCreator {

	String[] myArray;
	NameAndBirthYearGenerator andy;

	public void populate() {
		myArray = new String[10];
		andy = new NameAndBirthYearGenerator(50);

		for (int counter = 0; counter < myArray.length; counter++) {
			myArray[counter] = andy.generateNameAndBirthYearString();
		}

	}

	public void printPersonStrings() {

		for (int counter = 0; counter < myArray.length; counter++) {
			System.out.println(myArray[counter]);
		}
	}

	public void createPersonObjectFromString() {
		for (int counter = 0; counter < myArray.length; counter++) {
			String[] splitted = myArray[counter].split(" ");
			int age = 2017 - Integer.parseInt(splitted[2]);
			Person person = new Person(splitted[0], splitted[1], age);
			System.out.println(person.toString());
		}
		
	}

	public void ersetzen() {
		for (int counter = 0; counter < myArray.length; counter++) {
			String string1 = myArray[counter];
		string1 = string1.replace("ü", "ue");
		string1 = string1.replace("Ü", "Ue");
		
		string1 = string1.replace("ö", "oe");
		string1 = string1.replace("Ö", "Oe");
		string1 = string1.replace("ä", "ae");
		string1 = string1.replace("Ä", "Ae");
		string1 = string1.replace("ß", "ss");
		System.out.println(string1);
		}
		
	}

}
