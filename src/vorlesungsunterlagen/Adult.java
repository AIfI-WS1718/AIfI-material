package vorlesungsunterlagen;

public class Adult implements AgentI {
	private int id;
	
	Adult(int id) {
		this.id = id;
	}
	
	public int getId(){
		return id;
	}
	
	public void move(){
		System.out.println(" Adult moves; id: " + id);
	}
	
	public void speak(){
		System.out.println(" Adult speaks; id: " +  id);
	}
}
