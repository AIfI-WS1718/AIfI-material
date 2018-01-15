package uebung.ue13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class PersonsTxtParser {

	public List<Person> readFile(String csvFilename) throws Exception {
		File inputFile = new File(csvFilename);
		FileReader fr = new FileReader(inputFile);
		BufferedReader in = new BufferedReader(fr);
		List<Person> personList = new ArrayList<Person>();
		String line = in.readLine(); // skip header
		while ((line = in.readLine()) != null) {
			String[] entries = line.split(";");
			String id = entries[0];
			String name = entries[1];
			String vorname = entries[2];
			int alter = Integer.parseInt(entries[3]);
			Person p = new Person(id);
			p.setName(name);
			p.addVorname(vorname);
			p.setAlter(alter);
			personList.add(p);
		}
		in.close();
		return personList;
	}
	
}
