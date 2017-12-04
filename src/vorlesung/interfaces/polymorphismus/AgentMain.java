package vorlesung.interfaces.polymorphismus;

public class AgentMain {

	public static void main(String[] args) {
		AgentI ag1 = new Adult(1);
		AgentI ag2 = new Dog(2);
		
		ag1.move();
		Adult adult1 = (Adult) ag1;
		adult1.speak();
		ag2.move();
		if (ag2 instanceof Adult) {
			Adult adult2 = (Adult) ag2;
			adult2.speak();
		}	
		
		System.out.println("......... ");
		
		AgentI[] agentArray = new AgentI[10];
//		agentArray[0] = ag1;
		for (int i=0; i<5; i++) {
			agentArray[i] = new Adult(i);
		}
		for (int i=5; i<=9; i++) {
			agentArray[i] = new Dog(i);
		}
		for (int i=0; i<10; i++) {
			agentArray[i].move();
			if (agentArray[i] instanceof CanBark) {
				((CanBark) agentArray[i]).bark();
			}
		}
	}

}
