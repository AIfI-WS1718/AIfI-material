package vorlesung.collections.sort;

import java.util.Comparator;

public class MyAgentComparator implements Comparator<Agent> {

	@Override
	public int compare(Agent o1, Agent o2) {
		if (o1.getAge() > o2.getAge()) {
			return 1;
		} else if (o1.getAge() == o2.getAge()) {
			return 0;
		} else {
			return -1;
		}
	}

}
