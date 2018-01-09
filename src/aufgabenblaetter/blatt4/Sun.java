package aufgabenblaetter.blatt4;
/*
 * Feedback gl 9.1.
 * Theoretisch fehlt hier der (zusaetzliche) Konstruktor, der nur einen Namen uebergeben
 * bekommt und den Rest auf Default-Werte setzt. Macht aber keinen grossen Unterschied.
 */
public final class Sun extends GalaxyElement {

		public Sun (int x, int y, String name, double groesse) {
			super(x, y, name, groesse);
		}
}
