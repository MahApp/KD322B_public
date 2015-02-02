package se.mah.k3.pfi2;

import java.util.ArrayList;

public class Controller {
	ArrayList<Zombie> zombies;
	ArrayList<Plant> plants;
	ArrayList<Sun> suns;
	
	GamePanel gamePanel;
	
	//ToDo: skapa Arrayer f�r Plants och Sun!!
	
	public Controller() {
		gamePanel = new GamePanel ();
		gamePanel.setVisible(true);
		ArrayList<Zombie> zombies = new ArrayList<Zombie>();
		zombies.add(new Zombie("Zombie3", 50, 99, "NormalZombie"));
		zombies.add(new Zombie("Zombie4", 70, 155, "SjukZombie"));
		zombies.add(new Zombie("Zombie5", 87, 62, "MrZombie"));
		zombies.add(new Zombie("Zombie6", 12, 13, "MrZombie"));
		//ToDo Loopa ut detta i GameInfo rutan i GamePanel i st�llet
		for (Zombie z : zombies) {
			System.out.println("Namn: "+z.getName());
		}
		ArrayList<Plant> plants = new ArrayList<Plant>();
		plants.add(new Plant("Plant1", 3, 2, "PeaShooter"));
		plants.add(new Plant("Plant2", 6, 9, "Sunflower"));
		plants.add(new Plant("Plant3", 11, 1, "Wallnut"));
		plants.add(new Plant("Plant4", 8, 7, "Cherry"));
		//ToDo fyll SunArray och PLantArray med instanser av Sun och Plant
		//ToDo Loopa ut Solar och Plantor i GameInfo rutan i GamePanel i st�llet

		ArrayList<Sun> suns = new ArrayList<Sun>();
		suns.add(new Sun("sun1", 200, 221, "Drop"));
		suns.add(new Sun("sun2", 676, 923, "Falling"));
		
		gamePanel.printZombies(zombies);
		
	}

}
