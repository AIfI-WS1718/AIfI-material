package collections;

import java.util.ArrayList;

public class FirstExample {

	public static void main(String[] args) {

		ArrayList<Agent> myList = new ArrayList<>();
		
		for (int i = 0; i<10; i++){
			Agent ag = new Agent();
			ag.name = "Agent Nummer"+i;
			myList.add(ag);
		}
		
		for(Agent myAgent : myList) {
			myAgent.doSomething();
		}
		
		Agent ag5 = myList.get(5);
		ag5.name = "Alter Agent";
		
		for (Agent myAgent : myList){
			System.out.println(myAgent.name);
		}
		System.out.println(myList.size());
		
		Agent ag3 = new Agent();
		ag3.name = "Neuer Agent";
		myList.set(3, ag3);
		
		for(Agent myAgent : myList){
			System.out.println(myAgent.name);
		}
		System.out.println(myList.size());
		
		Agent ag7 = new Agent();
		ag7.name = "neuer Agent Nummer 7";
		System.out.println(myList.contains(ag7));
		myList.remove(ag7);
		
		for(Agent myAgent : myList){
			System.out.println(myAgent.name);
		}
		System.out.println(myList.size());
		
		myList.clear();
		System.out.println("---");
		for(Agent myAgent : myList){
			System.out.println(myAgent.name);
		}
		System.out.println(myList.size());
	}
}
