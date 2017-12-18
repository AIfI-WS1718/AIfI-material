package vorlesung.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FirstExample {

	public static void main(String[] args) {
		
		List<Agent> myAgentList = null;
		// this gives a null pointer exception because myList has not been initialized:
//		System.out.println("size: " + myList.size()); 
		
		myAgentList = new ArrayList<>();
//		myList = new LinkedList<>(); // just another implementation of the List Interface
		System.out.println("size: " + myAgentList.size());
		Agent ag0 = new Agent();
		ag0.name = "123";
		System.out.println("remove agent " + ag0.name + ": " + myAgentList.remove(ag0));
		
		System.out.println("fill list with 10 agents");
		for (int i=0; i<10; i++) {
			Agent ag = new Agent();
			ag.name = "name"+i;
			myAgentList.add(ag);
		}
		
		System.out.println("iterate over all elements of the list and call doSomething()");
		for (Agent myAgent : myAgentList) {
			myAgent.doSomething();
		}
		
		System.out.println("get fifth agent and change his name to 'hallo'");
		Agent ag5 = myAgentList.get(5);
		ag5.name = "hallo";
		
		System.out.println("the list now looks like this and has size " + myAgentList.size() + ": ");
		for (Agent myAgent : myAgentList) {
			System.out.println(myAgent.name);
		}
		
		System.out.println("remove fifth agent from the list");
		myAgentList.remove(5);
		
		System.out.println("the list now looks like this and has size " + myAgentList.size() + ": ");
		for (Agent myAgent : myAgentList) {
			System.out.println(myAgent.name);
		}
		
		System.out.println("set a new agent to position 3 in the list");
		Agent ag3 = new Agent();
		ag3.name = "neuerAgent";
		myAgentList.set(3, ag3);
		
		System.out.println("the list now looks like this and has size " + myAgentList.size() + ": ");
		for (Agent myAgent : myAgentList) {
			System.out.println(myAgent.name);
		}
		
		Agent ag7 = new Agent();
		ag7.name = "name7";
//		myList.add(ag7); // remove(...) removes the first element in the list that matches .equals(...)
		System.out.println("does the list contain agent " + ag7.name + "? " + myAgentList.contains(ag7));
		if (myAgentList.remove(ag7) == false) {
			System.out.println("nothing has been removed from the list");
		} else {
			System.out.println("agent " + ag7.name + " has been removed from the list");
		}
		
		System.out.println("the list now looks like this and has size " + myAgentList.size() + ": ");
		for (Agent myAgent : myAgentList) {
			System.out.println(myAgent.name);
		}
		
		System.out.println("clear the list, i.e. remove all entries.");
		myAgentList.clear();
		
		System.out.println("the list now looks like this and has size " + myAgentList.size() + ": ");
		for (Agent myAgent : myAgentList) {
			System.out.println(myAgent.name);
		}
	}

}
