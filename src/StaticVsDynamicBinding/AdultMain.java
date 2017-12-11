package StaticVsDynamicBinding;

public class AdultMain {
	
	void aMethod(AgentI ag){
		System.out.println("Agent method");
	}
	
	void aMethod(AdultImpl ad){
		System.out.println("Adult method");
	}

	public static void main(String[] args) {
		AgentI ag = new AdultImpl();
		ag.aMethod();
		
		AdultMain myObject = new AdultMain();
		myObject.aMethod(ag);
	}
}
