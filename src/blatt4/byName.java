package blatt4;

import java.util.Comparator;

public class byName implements Comparator<GalaxyElement> {

	@Override
	public int compare(GalaxyElement o1, GalaxyElement o2) {
		return (o1.getName().compareTo(o2.getName()));
	}

}
