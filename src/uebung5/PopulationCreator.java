package uebung5;

import generator.NameAndBirthYearGenerator;

public class PopulationCreator {

	String[] person;
	NameAndBirthYearGenerator = generator; 
	
	public static void main(String[] args) {
		
	}
	
	
	public void populate() {
		
		for(int i = 0; i <= person.length; i++) {
			person[i] = generator.NameAndBirthYearGString();
		}
	}
	
	public void printPersonStrings() {
		
		for(int i = 0; i <= person.length; i++) {
			System.out.println(person[i]);
		}
	}
}
