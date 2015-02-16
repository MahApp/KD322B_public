package se.mah.k3.pfi2.control;

import java.util.ArrayList;

import javax.swing.JTextArea;

import se.mah.k3.pfi2.model.Cherry;
import se.mah.k3.pfi2.model.LawnMover;
import se.mah.k3.pfi2.model.PeaShooter;
import se.mah.k3.pfi2.model.Plant;
import se.mah.k3.pfi2.model.PotatoMine;
import se.mah.k3.pfi2.model.Sun;
import se.mah.k3.pfi2.model.SunFlower;
import se.mah.k3.pfi2.model.Walnut;
import se.mah.k3.pfi2.model.Zombie;
import se.mah.k3.pfi2.model.Zombie.ZombieType;
import se.mah.k3.pfi2.view.GameFrame;
/** ALl info from http://plantsvszombies.wikia.com/wiki/Main_Page*/
public class Controller {
/*	private ArrayList<Zombie> zombies;
	private ArrayList<Plant> plants;
	private ArrayList<Sun> suns;
	private ArrayList<LawnMover> lawnMovers;*/
	private ArrayList<GameItem> gameItems;
	
	GameFrame gameFrame;
	
	public Controller() {
		gameFrame = new GameFrame (this);
		gameFrame.setVisible(true);
//		zombies = new ArrayList<Zombie>();
//		plants = new ArrayList<Plant>();
//		suns = new ArrayList<Sun>();	
//		lawnMovers = new ArrayList<LawnMover>();
		gameItems = new ArrayList<GameItem>();
		// We will need another thread were all the updating and repaintingwork is done 
		Thread t = new UpdateThread(this); //This creates a thread
		t.setName("UpdateThread");
		t.start(); //this starts a thread when ok with preparations etc
					//the method run() in the thread is called when the thred starts.
	}
	
//	public ArrayList<Zombie> getZombies() {
//		return zombies;
//	}
//
//	public ArrayList<Plant> getPlants() {
//		return plants;
//	}
//
//	public ArrayList<Sun> getSuns() {
//		return suns;
//	}
//	
//	public  ArrayList<LawnMover> getMovers() {
//		return lawnMovers;
//	}

	public ArrayList<GameItem> getGameItems (){
		return gameItems;
	}
	
	public void update(){
//		updateZombies();
//		updateSuns();
//		updatePlants();
//		updateMovers();
		updateGameItems();
		gameFrame.clearGameInfoPanel();
		gameFrame.appendToGameInfoPanel("Number of Game Items: "+gameItems.size()+"\n");
	}

	private void updateGameItems() {
		for (GameItem gameItem : gameItems) {
			gameItem.doYourThing();
			}
	}

	public void rePaint() {
		gameFrame.repaint();
	}

//	private void updatePlants() {
//		for (Plant plant : plants) {
//			plant.act();
//		}
//		
//	}
//	
//	private void updateMovers() {
//		for (LawnMover mover : lawnMovers) {
//			mover.isItTimeToAct();
//		}
//	}
//
//	private void updateSuns() {
//		for (Sun s : suns) {
//			s.fall();
//		}
//	}
//
//	private void updateZombies() {
//		for (Zombie z : zombies) {
//			z.walk();
//		}
//	}
	
	public void addZombie() {
		gameItems.add(new Zombie(20,20,ZombieType.CONEHEAD));
	}

	public void addSun() {
		gameItems.add(new Sun(20, 20));
		
	}
	
	public void addLawnMover() {
		gameItems.add(new LawnMover(100, 100));
	}


	public void addPotatoMine() {
		gameItems.add(new PotatoMine( 20, 30));
		
	}

	public void addWalnut() {
		gameItems.add(new Walnut(40, 30));
		
	}

	public void addPeaShooter() {
		gameItems.add(new PeaShooter(40, 60));
		
	}

	public void addSunFlower() {
		gameItems.add(new SunFlower(40, 100));
		
	}

	public void addCherry() {
		gameItems.add(new Cherry(100, 100));
		
	}
}

