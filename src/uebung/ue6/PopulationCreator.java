package uebung.ue6;

import generator.NameAndBirthYearGenerator;

public class PopulationCreator {

	public static void main(String[] args) {

		NameAndBirthYearGenerator myGenerator = new NameAndBirthYearGenerator(12);
		myGenerator.generateNameAndBirthYearString();

	}

}
