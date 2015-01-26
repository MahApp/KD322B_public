package se.mah.k3.pfi2;

import java.util.ArrayList;

public class Controller {
	public Controller() {
		GamePanel gamePanel = new GamePanel ();
		gamePanel.setVisible(true);
		ArrayList<Zombie> zombies = new ArrayList<Zombie>();

		Zombie testZombie= new Zombie("Zombie1", 50, 100, "NormalZombie");
		Zombie testZombie2= new Zombie("Zombie2", 30, 120, "MrZombie");
		
		zombies.add(testZombie);
		zombies.add(testZombie2);
		zombies.add(new Zombie("Zombie3", 50, 100, "NormalZombie"));
		zombies.add(new Zombie("Zombie4", 50, 100, "SjukZombie"));
		zombies.add(new Zombie("Zombie5", 50, 100, "MrZombie"));
		zombies.add(new Zombie("Zombie6", 50, 100, "MrZombie"));
		for (Zombie zombie : zombies) {
			System.out.println("Namn: "+zombie.getName());
		}
		
	}

}
