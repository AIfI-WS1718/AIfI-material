package vorlesung.collections;

import java.util.ArrayList;
import java.util.List;

public class Generics {

	public static void main(String[] args) {
		// ohne Generics (Liste mit Objects)
		{
			List agents = new ArrayList();
			for (int ii = 0; ii < 10; ii++) {
				Agent agent = new Agent();
				agents.add(agent);
				agent.name = "name" + ii;
			}
			agents.add("Meier"); // Beliebige Objekte koennen hinzugefuegt werden
			Agent agent5 = (Agent) agents.get(5);

			for (Object oo : agents) {
				Agent agent = (Agent) oo; // Exception bei "Meier" (kann nicht gecastet werden)
				agent.doSomething();
			}
		}

		// mit Generics (Liste mit Agents)
		{
			List<Agent> agents = new ArrayList<>();
			for (int ii = 0; ii < 10; ii++) {
				Agent agent = new Agent();
				agents.add(agent);
				agent.name = "name" + ii;
			}
			// agents.add("Meier"); // compile error ("Meier" ist kein Agent)
			Agent agent5 = agents.get(5); // note: no cast

			for (Agent agent : agents) {
				// note: no cast
				agent.doSomething();
			}
		}
	}

}
