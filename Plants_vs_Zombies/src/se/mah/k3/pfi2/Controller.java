package se.mah.k3.pfi2;

import java.util.ArrayList;

public class Controller {
	ArrayList<Zombie> zombies;
	
	//ToDo: skapa Arrayer för Plants och Sun!!
	
	public Controller() {
		GamePanel gamePanel = new GamePanel ();
		gamePanel.setVisible(true);
		ArrayList<Zombie> zombies = new ArrayList<Zombie>();
		zombies.add(new Zombie("Zombie3", 50, 99, "NormalZombie"));
		zombies.add(new Zombie("Zombie4", 70, 155, "SjukZombie"));
		zombies.add(new Zombie("Zombie5", 87, 62, "MrZombie"));
		zombies.add(new Zombie("Zombie6", 12, 13, "MrZombie"));
		//ToDo Loopa ut detta i GameInfo rutan i GamePanel i stället
		for (Zombie zombie : zombies) {
			System.out.println("Namn: "+zombie.getName());
		}
		//ToDo fyll SunArray och PLantArray med instanser av Sun och Plant
		//ToDo Loopa ut Solar och Plantor i GameInfo rutan i GamePanel i stället
		
	}

}
