package ue4;

public class Farmer {
	public static void feedCow(Cow cow) {
		if(cow.getHungry() == 1) {
			cow.toggleHungry();
		}
	}
}
