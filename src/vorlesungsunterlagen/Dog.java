package vorlesungsunterlagen;

public class Dog implements AgentI, CanBark {
	
	private int id;
	Dog(int id){
		this.id = id;
	}
	
	@Override
	public int getId() {
		return id;
	}
	
	@Override
	public void move(){
		System.out.println(" Dog moves; id: " + id);
	}
	
	@Override
	public void bark() {
		System.out.println(" Dog barks; id: " + id);
	}
	
}
