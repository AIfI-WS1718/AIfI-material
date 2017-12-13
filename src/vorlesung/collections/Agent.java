package vorlesung.collections;

class Agent {

	String name;
	
	void doSomething() {
		System.out.println("Agent " + name + " does something...");
	}
	
	/**
	 * return true, when the two agents have the same name
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Agent) {
			Agent ag = (Agent) obj;
			return this.name.equals(ag.name);
		}
		return false;
	}
	
}
