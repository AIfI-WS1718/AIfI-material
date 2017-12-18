package vorlesungsMitschriften;

import java.util.ArrayList;

import collections.Agent;

public class Generics {

	public static void main(String[] args) {
		ArrayList<Agent> agents = new ArrayList<Agent>();
		for(int ii=0; ii<10; ii++){
			Agent agent = new Agent();
			agents.add(agent);
			agent.name = "name";
		}
	}

}