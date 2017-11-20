package uebung.ue5;
import java.awt.Color;

import gridworld.framework.actor.*;

public class GridUebung {

	public static void main(String[] args) {
			ActorWorld world = new ActorWorld();
			world.add(new Bug(Color.GREEN));
			for (int i=0; i<10;i++) {
			world.add(new Rock());
			}
			world.show();
	}

}
