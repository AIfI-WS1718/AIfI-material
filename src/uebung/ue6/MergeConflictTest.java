package uebung.ue6;

import generator.NameAndBirthYearGenerator;

public class MergeConflictTest {

	public static void main(String[] args) {
		System.out.println("Der ursprüngliche Commit. Eine Änderung im Master-Branch.");

		NameAndBirthYearGenerator myGenerator = new NameAndBirthYearGenerator(12);
		myGenerator.generateNameAndBirthYearString();

	}
}
