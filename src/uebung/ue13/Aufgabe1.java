package uebung.ue13;

import java.util.List;

public class Aufgabe1 {
	
	private static void printPersonsList(List<Person> persons){
		for (Person p : persons){
			System.out.println("Person Id: " + p.getId());
			System.out.println("  Name: " + p.getName());
			System.out.println("  Vornamen: ");
			for (String s : p.getVornamen()){
				System.out.println("    " + s);
			}
			System.out.println("  Alter " + p.getAlter());
		}
	}
	
	public static void main(String[] args) throws Exception {

		System.out.println();
		System.out.println("csv persons reader: ");
		String personsCsvFile = "src/uebung/ue13/2014-01-21_persons.csv";
		PersonsTxtParser csvParser = new PersonsTxtParser();
		List<Person> personsCsv = csvParser.readFile(personsCsvFile);
		printPersonsList(personsCsv);
	}

}
