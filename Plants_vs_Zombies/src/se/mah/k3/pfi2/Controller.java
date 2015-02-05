package se.mah.k3.pfi2;

import java.util.ArrayList;

public class Controller {
	private ArrayList<Zombie> zombies;
	private ArrayList<Plant> plants;
	private ArrayList<Sun> suns;
	
	GameFrame gameFrame;
	
	public Controller() {
		gameFrame = new GameFrame (this);
		gameFrame.setVisible(true);
		zombies = new ArrayList<Zombie>();
		plants = new ArrayList<Plant>();
		suns = new ArrayList<Sun>();	
		// We will need another thread were all the work is done 
		Thread t = new UpdateThread(this); //This creates a thread
		t.start(); //this starts a thread when ok with preparations etc
					//the method run() in the thread is called when the thred starts.
	}
	
	public ArrayList<Zombie> getZombies() {
		return zombies;
	}

	public ArrayList<Plant> getPlants() {
		return plants;
	}

	public ArrayList<Sun> getSuns() {
		return suns;
	}

	public void update(){
		updateZombies();
		updateSuns();
		updatePlants();
		gameFrame.clearGameInfoPanel();
		gameFrame.appendToGameInfoPanel("Number of Suns: "+suns.size()+"\n");
		gameFrame.appendToGameInfoPanel("Number of Zombies: "+zombies.size()+"\n");
		gameFrame.appendToGameInfoPanel("Number of Plants: "+plants.size()+"\n");
	}

	public void rePaint() {
		gameFrame.repaint();
	}

	private void updatePlants() {
		for (Plant plant : plants) {
			plant.setPositionX(plant.getPositionX()+1);
			plant.setPositionY(plant.getPositionY()+1);
		}
		
	}

	private void updateSuns() {
		for (Sun s : suns) {
			s.fall();
		}
	}

	private void updateZombies() {
		for (Zombie z : zombies) {
			z.walk();
		}
	}
	
	public void addZombie() {
		zombies.add(new Zombie("zzombie",20,20,"NightZombie"));
		
	}

	public void addSun() {
		suns.add(new Sun("sun1", 20, 20, "Drop"));
		
	}


	public void addPlant() {
		plants.add(new Plant("Plant2", 20, 30, "Sunflower"));
		
	}
}

