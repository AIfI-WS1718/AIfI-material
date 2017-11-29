package uebung.ue6;

//import generator.NameAndBirthYearGenerator;

public class PopulationCreator {
	static long seed;
	static String[] einwohner = new String[1000];

	PopulationCreator(long l) {
		seed = l;
	}

	public static void main(String[] args) {
		seed = 4762;
	}

	
	public static void populate() {
	//	NameAndBirthYearGenerator pop = new NameAndBirthYearGenerator(seed);
		for (int i = 0; i < 1000; i++) {
		//	einwohner[i] = pop.generateNameAndBirthYearString();
		}
	}

	public void printPersonStrings() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("Name, Geburtsjahr von Einwohner Nummer " + (i + 1) + ": " + einwohner[i]);
		}
	}
}
