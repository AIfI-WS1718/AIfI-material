package aufgabenblaetter.blatt4;

public class Galaxy {

	public static void main(String[] args) {
		GalaxyElement ele1 = new GalaxyElement();
		GalaxyElement ele2 = new GalaxyElement(10,43,"Teil der Galaxy II", 50.0);
		System.out.println(ele1.toString());
		ele1.groesse = 40.0;
		ele1.x = 37;
		ele1.y = (int) 'ß';
		ele1.name = "Nicht Teil der Galaxy";
		System.out.println(ele1.toString());
		
		System.out.println(ele2.toString());
		
		System.out.println("Gr"+ (char) 246 + (char) 223 + ": " + ele2.getGroesse());
		System.out.println("x-Postion: " + ele2.getX());
		System.out.println("y-Position: " + ele2.getY());
		System.out.println("Name: " + ele2.getName());
	}

}
