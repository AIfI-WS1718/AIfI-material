package vorlesung.interfaces.polymorphismus;

public class Adult implements AgentI {

	private int id;
	
	public Adult(int id) {
		this.id = id;
	}
	
	@Override
	public int getId() {
		return id;
	}

	@Override
	public void move() {
		System.out.println("Adult moves. id " + id);
	}
	
	public void speak() {
		System.out.println("Adult speaks. id " + id);
	}

}
