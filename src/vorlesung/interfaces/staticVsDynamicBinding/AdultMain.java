package vorlesung.interfaces.staticVsDynamicBinding;

public class AdultMain {

	void aMethod(AgentI ag) {
		System.out.println("Agent method");
	}
	
	void aMethod(AdultImpl ad) {
		System.out.println("Adult method");
	}
	
	public static void main(String[] args) {
		AgentI ag = new AdultImpl();
		// dynamic binding (Methode des Laufzeittyps)
		ag.aMethod();
		
		AdultMain myObject = new AdultMain();
		// static binding (Methode des Kompilierzeittyps)
		myObject.aMethod(ag);
	}

}
