package aufgabenblaetter.blatt5.aufg1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

class CorpusCount {

	List<Entry> words = new ArrayList<>();
	SortedSet<String> sortedWords = new TreeSet<>();
	
	public static void main(String[] args) throws IOException {
		new CorpusCount().run();
	}

	private void run() throws IOException {
		readFile("./src/aufgabenblaetter/blatt5/aufg1/files/text.txt");
		sort();
		write();
	}

	private void write() {
		for (String wd : sortedWords) {
			System.out.println(wd);
		}
	} 

	private void sort() {
		for (Entry word : words) {
			sortedWords.add(word.toString());
		}
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
		Entry tmpWord = new Entry (word);
		if (words.contains(tmpWord)) {
			int tmpId = words.indexOf(tmpWord);
			words.get(tmpId).setCount();
		} else {
			Entry newWord = new Entry (word, 0);
			words.add(newWord);
		}
		
	}

	
	/**
	 * Das ist eine sogenannte innere Klasse (inner class). So kann man sich eine
	 * weitere Java-Datei sparen, wenn man ein kleines Objekt (wie diesen Entry)
	 * erstellen möchte, das man nur in dieser Klasse braucht.
	 */
	class Entry {
		String word;
		int count;
		
		Entry (String word) {
			this.word = word;
		}
		
		Entry (String word, int count) {
			this.word = word;
			this.count = count;
		}
		
		public void setCount() {
			count++;
		}
		
		@Override
		public String toString() {
			return count + "  " + word;
		}
	}

}
