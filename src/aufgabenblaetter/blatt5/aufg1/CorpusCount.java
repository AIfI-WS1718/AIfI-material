package aufgabenblaetter.blatt5.aufg1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class CorpusCount {

	public static void main(String[] args) throws IOException {
		new CorpusCount().run();
	}

	private void run() throws IOException {
		readFile("./src/aufgabenblaetter/blatt5/aufg1/files/emma.txt");
		readFile("./src/aufgabenblaetter/blatt5/aufg1/files/sense.txt");
		readFile("./src/aufgabenblaetter/blatt5/aufg1/files/persuasion.txt");
		sort();
		write();
	}

	private void write() {
		// TODO bitte fuellen
	}

	private void sort() {
		// TODO bitte fuellen
	}

	private void readFile(String filename) throws IOException {
		FileReader fr = new FileReader(filename);
		BufferedReader br = new BufferedReader(fr);
		String line;
		while ((line = br.readLine()) != null) {
			String[] words = line.split(" +");
			for (String word : words) {
				countWord(word);
			}
		}
		br.close();
	}

	private void countWord(String word) {
		// TODO bitte fuellen
	}

	
	/**
	 * Das ist eine sogenannte innere Klasse (inner class). So kann man sich eine
	 * weitere Java-Datei sparen, wenn man ein kleines Objekt (wie diesen Entry)
	 * erstellen möchte, das man nur in dieser Klasse braucht.
	 */
	class Entry {
		String word;
		int count;
	}

}
