package aufgabeGalaxy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Galaxy {
	
	private static GalaxyElement galaxy1 = new GalaxyElement(700, 600, 1000000000, "Andromeda");
	private static GalaxyElement galaxy2 = new GalaxyElement(500000000, "Centaurus");
	private static GalaxyElement galaxy3 = new GalaxyElement(1700, 2600, "Whirlpool ");
	private static GalaxyElement galaxy4 = new GalaxyElement("Milky Way");
	
	private static Sun sun1 = new Sun(1, 198, 781893458, "A'Koba");
	private static Sun sun2 = new Sun(560, 80, 1021893458, "Cassian Andor");
	private static Sun sun3 = new Sun(1300, 300, 999893458, "Sim Aloo");
	private static Sun sun4 = new Sun(1217, 2980, 1607893458, "Mas Amedda");
	
	private static Planet planet1 = new Planet("Daenerys Targaryen ", sun1, 56849, 6894086);
	private static Planet planet2 = new Planet("Jon Snow ", sun2, 49, 784086);
	private static Planet planet3 = new Planet("Tyrion Lannister ", sun3, 569, 1000086);
	private static Planet planet4 = new Planet("Khal Drogo ", sun4, 5684, 4086);
	
	private static SpaceShip spaceShip1 = new SpaceShip("Reginald Barclay", 350, 600);
	private static SpaceShip spaceShip2 = new SpaceShip("Bareil Antos", 1350, -300);
	private static SpaceShip spaceShip3 = new SpaceShip("B'Etor", -50, 60);
	private static SpaceShip spaceShip4 = new SpaceShip("Kimara Cretak", 3500, 1);
	private static SpaceShip spaceShip5 = new SpaceShip("Pavel Chekov", 0, -10);
	
	public static void main(String[] args) {
		

		System.out.println(galaxy1.toString());
		System.out.println(galaxy2.toString());
		System.out.println(galaxy3.toString());
		System.out.println(galaxy4.toString());
alsMap();
		
	}
	public static void alsMap() {
	
		Map<String, GalaxyElement> galaxyElementsMap = new TreeMap<>();
		galaxyElementsMap.put("A'Koba",sun1);
		galaxyElementsMap.put("Daenerys Targaryen ",planet1);
		galaxyElementsMap.put("Reginald Barclay",spaceShip1);
		
		for (GalaxyElement galEl : galaxyElementsMap.values()) { // kakoy tip soedineniya
			galaxyElementsMap.toString();
			System.out.println(galEl);
		}
		System.out.println("________________________");

		for (GalaxyElement galEl : galaxyElementsMap.values()) {
			if (galEl instanceof Movable) {
				for (int counter = 0; counter <= 5; counter++) {
					((Movable) galEl).move();
					System.out.println(galEl.toString());
				}
			}
		}
		System.out.println("________________________");
		List<Destroyable> lowerNull = new ArrayList<>();
		for (GalaxyElement galEl : galaxyElementsMap.values()) {
			if (galEl instanceof Destroyable) {
				Destroyable galEl1 = (Destroyable) galEl;
				galEl1.hit(Math.random() * 25);
				System.out.println(galEl1.toString());
				boolean isDestroyedResult = galEl1.isDestroyed();
				if (isDestroyedResult) {
					System.out.println("The energy of " + galEl.getName() + " is lower then 0.");
					lowerNull.add(galEl1);
					

				}

			}
		}
		System.out.println("________________________");
		System.out.println(galaxyElementsMap);
		for (Destroyable des : lowerNull) {
			galaxyElementsMap.remove(des);
		}
		System.out.println(galaxyElementsMap);
		
		
           	
	}     
		
		
	
	public static  void alsList() {
		List<GalaxyElement> galaxyElements = new ArrayList<>();
		
		galaxyElements.add(sun1);
		galaxyElements.add(sun2);
		galaxyElements.add(sun3);
		galaxyElements.add(sun4);
		galaxyElements.add(planet1);
		galaxyElements.add(planet2);
		galaxyElements.add(planet3);
		galaxyElements.add(planet4);
		galaxyElements.add(spaceShip1);
		galaxyElements.add(spaceShip2);
		galaxyElements.add(spaceShip3);
		galaxyElements.add(spaceShip4);
		galaxyElements.add(spaceShip5);

		for (GalaxyElement galEl : galaxyElements) { // kakoy tip soedineniya
			galaxyElements.toString();
			System.out.println(galEl);
		}

		System.out.println("________________________");

		for (GalaxyElement galEl : galaxyElements) {
			if (galEl instanceof Movable) {
				for (int counter = 0; counter <= 5; counter++) {
					((Movable) galEl).move();
					System.out.println(galEl.toString());
				}
			}
		}

		System.out.println("________________________");
		List<Destroyable> lowerNull = new ArrayList<>();
		for (GalaxyElement galEl : galaxyElements) {
			if (galEl instanceof Destroyable) {
				Destroyable galEl1 = (Destroyable) galEl;
				galEl1.hit(Math.random() * 25);
				System.out.println(galEl1.toString());
				boolean isDestroyedResult = galEl1.isDestroyed();
				if (isDestroyedResult) {
					System.out.println("The energy of " + galEl.getName() + " is lower then 0.");
					lowerNull.add(galEl1);
					// galaxyElements.remove(galEl);

				}

			}
		}
		System.out.println("________________________");
		System.out.println(galaxyElements);
		for (Destroyable des : lowerNull) {
			galaxyElements.remove(des);
		}
		System.out.println(galaxyElements);
		
		System.out.println("________________________");
		Collections.sort(galaxyElements);
		printList(galaxyElements);
		
		System.out.println("________________________");
		Collections.sort(galaxyElements, new NameComparator());
		printList(galaxyElements);
		
           	
	}     

	public static void printList(List<GalaxyElement> listGalaxyElements) {
		for(GalaxyElement element: listGalaxyElements) {
			System.out.println(element);
		}
		
	}
}
