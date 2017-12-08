package uebung6;

public class PopulationTest {
	public static void main(String[] args) {

		PopulationCreator pop = new PopulationCreator();
		pop.populate();
		pop.printPersonStrings();
		pop.ersetzen();
//		pop.createPersonObjectFromString();

	}
}