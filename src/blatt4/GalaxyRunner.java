package blatt4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class GalaxyRunner {
	public static void main (String[] args) {
		Sun sun = new Sun("Sonne");
		Planet planet = new Planet("Pluto", sun);
		
		List<GalaxyElement> elements = new ArrayList<>();
		elements.add(sun);
		elements.add(planet);
		
		Collections.sort(elements);
		Collections.sort(elements, new byName());
		
		for (GalaxyElement e : elements) {
			System.out.println(e.toString());
		}
		
		Map<String,GalaxyElement> elementsMap = new TreeMap<>();
		elementsMap.put(sun.getName(), sun);
		elementsMap.put(planet.getName(), planet);
		
	}
}
