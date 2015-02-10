package se.mah.k3.pfi2;

import java.util.ArrayList;
import javax.swing.JTextArea;

import se.mah.k3.pfi2.Zombie.ZombieType;
/** ALl info from http://plantsvszombies.wikia.com/wiki/Main_Page*/
public class Controller {
	private ArrayList<Zombie> zombies;
	private ArrayList<Plant> plants;
	private ArrayList<Sun> suns;
	private ArrayList<LawnMover> lawnMovers;
	
	GameFrame gameFrame;
	
	public Controller() {
		gameFrame = new GameFrame (this);
		gameFrame.setVisible(true);
		zombies = new ArrayList<Zombie>();
		plants = new ArrayList<Plant>();
		suns = new ArrayList<Sun>();	
		lawnMovers = new ArrayList<LawnMover>();
		// We will need another thread were all the updating and repaintingwork is done 
		Thread t = new UpdateThread(this); //This creates a thread
		t.setName("UpdateThread");
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
	
	public  ArrayList<LawnMover> getMovers() {
		return lawnMovers;
	}

	public void update(){
		updateZombies();
		updateSuns();
		updatePlants();
		updateMovers();
		gameFrame.clearGameInfoPanel();
		gameFrame.appendToGameInfoPanel("Number of Suns: "+suns.size()+"\n");
		gameFrame.appendToGameInfoPanel("Number of Zombies: "+zombies.size()+"\n");
		gameFrame.appendToGameInfoPanel("Number of Plants: "+plants.size()+"\n");
		gameFrame.appendToGameInfoPanel("Number of Movers: "+lawnMovers.size()+"\n");
	}

	public void rePaint() {
		gameFrame.repaint();
	}

	private void updatePlants() {
		for (Plant plant : plants) {
			plant.act();
		}
		
	}
	
	private void updateMovers() {
		for (LawnMover mover : lawnMovers) {
			mover.isItTimeToAct();
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
		zombies.add(new Zombie(20,20,ZombieType.CONEHEAD));
	}

	public void addSun() {
		suns.add(new Sun(20, 20));
		
	}
	
	public void addLawnMover() {
		lawnMovers.add(new LawnMover(100, 100));
	}


	public void addPotatoMine() {
		plants.add(new PotatoMine( 20, 30));
		
	}

	public void addWalnut() {
		plants.add(new Walnut(40, 30));
		
	}

	public void addPeaShooter() {
		plants.add(new PeaShooter(40, 60));
		
	}

	public void addSunFlower() {
		plants.add(new SunFlower(40, 100));
		
	}

	public void addCherry() {
		plants.add(new Cherry(100, 100));
		
	}
}

