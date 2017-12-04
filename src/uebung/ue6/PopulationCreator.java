package uebung.ue6;

import generator.NameAndBirthYearGenerator;

public class PopulationCreator {
	String[] personStrings;
	Person[] persons;
	NameAndBirthYearGenerator generator;

	public static void main(String[] args) {
		PopulationCreator creator = new PopulationCreator(40, 10);
		creator.populate();
		creator.printPersonStrings();
		creator.printPersons();
	}

	public PopulationCreator(int numberPersons, long seed) {
		personStrings = new String[numberPersons];
		persons = new Person[numberPersons];
		generator = new NameAndBirthYearGenerator(seed);
	}

	private void populate() {
		for (int i=0; i < personStrings.length; i++) {
			personStrings[i] = generator.generateNameAndBirthYearString();
			persons[i] = createPersonObjectFromString(personStrings[i]);
		}
	}

	private void printPersonStrings() {
		for (int i=0; i < personStrings.length; i++) {
			System.out.println(personStrings[i]);
		}
	}
	
	private void printPersons() {
		for (int i=0; i < persons.length; i++) {
			System.out.println(persons[i]);
		}
	}
	
	private static Person createPersonObjectFromString(String personString) {
		personString = replaceGermanCharacters(personString);
		String[] splitNameAndYearStrings = personString.split(", ");
		String[] splitNameStrings = splitNameAndYearStrings[0].split(" ");
		String firstName = splitNameStrings[0];
		String lastName = splitNameStrings[1];
		int birthYear = Integer.valueOf(splitNameAndYearStrings[1]);
		int age = 2017-birthYear;
		return new Person(firstName, lastName, age);
	}
	
	private static String replaceGermanCharacters(String string) {
		string = string.replaceAll("ö", "oe");
		string = string.replaceAll("Ö", "Oe");
		string = string.replaceAll("ä", "ae");
		string = string.replaceAll("Ä", "Ae");
		string = string.replaceAll("ü", "ue");
		string = string.replaceAll("Ü", "Ue");
		string = string.replaceAll("ß", "ss");
		return string;
	}
}