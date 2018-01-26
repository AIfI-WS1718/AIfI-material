package aufgabenblaetter.blatt5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CorpusCount {
	Map<String, Entry> wordMap = new TreeMap<>();
	ArrayList<Entry> sortList = new ArrayList<>();
	
	public static void main(String[] args) throws IOException{
		new CorpusCount().run();
	}
	
	void run() throws IOException{
		readFile("~/backfisch.txt");
		sort();
		write();
	}
	
	void readFile(String filename) throws IOException{
//		FileReader fr = new FileReader(filename);
//		BufferedReader br = new BufferedReader(fr);
//		String line;
//		while ((line = br.readLine()) != null) {
//			String[] words = line.split(" +");
//			for(String word: words) {
//				countWord(word);
//			}
//		}
//		
		String line = "lorem ipsum dolor sit sit sit amet amet.";
		String[] words = line.split(" ");
		for(String word: words) {
			countWord(word);
		}
	}
	
	void countWord(String word) {
		if (wordMap.containsKey(word)){
			Entry thisEntry = wordMap.get(word);
			thisEntry.count++;
		}else {
			wordMap.put(word, new Entry(word));
		}
	}
	
	void sort() {
		for(Iterator<java.util.Map.Entry<String, Entry>> it = wordMap.entrySet().iterator(); it.hasNext();) {
			java.util.Map.Entry<String, Entry> e = it.next();
			sortList.add(e.getValue());
		}
		Collections.sort(sortList,new EntryComparator());
	}
	
	void write() {
		for (Entry e: sortList) {
			System.out.println(e.word + ": " + e.count);
		}
		
	}
	
	
}
