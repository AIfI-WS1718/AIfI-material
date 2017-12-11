package uebung.ue6.aufg2;

import generator.NameAndBirthYearGenerator;

public class PopulationCreator2 {
	String[] personStrings;
	NameAndBirthYearGenerator generator;
	
	public static void main (String[] args) {
		PopulationCreator2 manager = new PopulationCreator2(40, 10);
		manager.populate();
		manager.printPersonStrings();
	}
	
	public PopulationCreator2(int numberPersons, long seed) {
		personStrings = new String[numberPersons];
		generator = new NameAndBirthYearGenerator(seed);
	}
	
	private void populate() {
		for (int i = 0; i < personStrings.length; i++) {
			personStrings[i] = generator.generateNameAndBirthYearString();
		}
	}
	
	private void printPersonStrings() {
		for (int i = 0; i < personStrings.length; i++) {
			System.out.println(personStrings[i]);
		}
	}
}
