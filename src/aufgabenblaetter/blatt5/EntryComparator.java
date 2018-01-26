package aufgabenblaetter.blatt5;

import java.util.Comparator;

public class EntryComparator implements Comparator<Entry> {
	@Override
	public int compare(Entry e1, Entry e2) {
		Integer i1 = e1.count;
		Integer i2 = e2.count;
		return i1.compareTo(i2);
	}
}
