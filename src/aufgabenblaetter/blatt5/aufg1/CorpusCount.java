package aufgabenblaetter.blatt5.aufg1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

class CorpusCount {

	Map<String,Integer> words = new TreeMap<>();
	
	
	public static void main(String[] args) throws IOException {
		new CorpusCount().run();
	}

	private void run() throws IOException {
		readFile("./src/aufgabenblaetter/blatt5/aufg1/files/text.txt");
		//sort();
		write();
	}

	private void write() {
		for (Map.Entry<String, Integer> w : words.entrySet()) {
			System.out.println(w.getKey() + w.getValue());
		}
	} 

	/*private void sort() {
					
		
	}*/
	
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
		// Map mit <Wort,Anzahl> füllen
		
		if (words.containsKey(word)) {
			int count = words.get(word);
			words.put(word, count+1);
			
		} else {
			words.put(word, 1);
		}
	}

	
	/**
	 * Das ist eine sogenannte innere Klasse (inner class). So kann man sich eine
	 * weitere Java-Datei sparen, wenn man ein kleines Objekt (wie diesen Entry)
	 * erstellen mÃ¶chte, das man nur in dieser Klasse braucht.
	 */
	class Entry {
		String word;
		int count;
	}

}
