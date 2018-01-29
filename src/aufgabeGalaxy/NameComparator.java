package aufgabeGalaxy;

import java.util.Comparator;

public class NameComparator implements Comparator<GalaxyElement> {

	@Override
	public int compare(GalaxyElement galEl1, GalaxyElement galEl2) {
		return galEl1.getName().compareTo(galEl2.getName());
	}

}
