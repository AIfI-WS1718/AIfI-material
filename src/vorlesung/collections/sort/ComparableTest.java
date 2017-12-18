package vorlesung.collections.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest {

	public static void main(String[] args) {
		List<Agent> agents = new ArrayList<>();

		System.out.println("generate agents with random id/age ...");
		for (int ii = 0; ii < 10; ii++) {
			Agent ag = new Agent((int) (100000. * Math.random()), 100 * Math.random());
			agents.add(ag);
		}

		System.out.println("\ndemonstrate that id is in rnd sequence:");
		for (Agent ag : agents) {
			System.out.println(" agentId: " + ag.getId());
		}

		System.out.println("\nsort the agents ... ");
		Collections.sort(agents);

		System.out.println("\ndemonstrate that they are now sorted:");
		for (Agent ag : agents) {
			System.out.println(" agentId: " + ag.getId());
		}
	}

}
