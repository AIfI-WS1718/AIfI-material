package ue6;
import generator.NameAndBirthYearGenerator;

public class PopulationCreator {
	public static String[] population;
	NameAndBirthYearGenerator myGenerator;
	String[] person;
	
	public static void main(String[] args) {
		PopulationCreator manager = new PopulationCreator(40, 10);
		manager.populate();
		manager.printPersonStrings();
	}
	
	public PopulationCreator(int numberPerson, long seed) {
		population = new String[numberPerson];
		myGenerator = new NameAndBirthYearGenerator(seed);
	}
	
	public void populate() {
		for (int i = 1; i < population.length; i++) {
			population[i] = myGenerator.generateNameAndBirthYearString();
		}
	}
	
	public void printPersonStrings() {
		for (int i = 1; i < population.length; i++) {
			System.out.println(population[i]);
		}
	}
	
	

}
