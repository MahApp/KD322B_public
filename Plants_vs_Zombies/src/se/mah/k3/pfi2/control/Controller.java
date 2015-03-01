package se.mah.k3.pfi2.control;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JTextArea;

import se.mah.k3.pfi2.model.Cherry;
import se.mah.k3.pfi2.model.LawnMover;
import se.mah.k3.pfi2.model.PeaShooter;
import se.mah.k3.pfi2.model.PotatoMine;
import se.mah.k3.pfi2.model.Sun;
import se.mah.k3.pfi2.model.SunFlower;
import se.mah.k3.pfi2.model.Walnut;
import se.mah.k3.pfi2.model.Zombie;
import se.mah.k3.pfi2.model.Zombie.ZombieType;
import se.mah.k3.pfi2.view.GameFrame;
/** ALl info from http://plantsvszombies.wikia.com/wiki/Main_Page*/
public class Controller {
	private ArrayList<GameItem> gameItems;
	
	GameFrame gameFrame;
	
	public Controller() {
		gameFrame = new GameFrame (this);
		gameFrame.setVisible(true);
		gameItems = new ArrayList<GameItem>();
		
		// We will need another thread were all the updating and repainting and updating is done 
		Thread t = new UpdateThread(); //This creates a thread
		t.setName("UpdateThread");
		t.start(); //this starts a thread when ok with preparations etc
					//the method run() in the thread is called when the thred starts.
	}

	public ArrayList<GameItem> getGameItems (){
		return gameItems;
	}
	
	public void update(){
		updateGameItems();
		gameFrame.clearGameInfoPanel();
		gameFrame.appendToGameInfoPanel("Number of Game Items: "+gameItems.size()+"\n");
	}

	private void updateGameItems() {
		//CLean out all items outside the area need tweeking with synchronized....
		//Use an iterator to remove it is 
		Iterator<GameItem> i = gameItems.iterator();
		while (i.hasNext()) {
		   GameItem gameItem = i.next(); // must be called before you can call i.remove()
		   if (gameItem.getPositionX()<200 || gameItem.getPositionY()<0||
					gameItem.getPositionX()>gameFrame.getPanelWidth().getWidth()||
					gameItem.getPositionY()>gameFrame.getPanelWidth().getHeight()){
					i.remove();
			}
		}
		for (GameItem gameItem : gameItems) {
			gameItem.doYourThing();
		}
	}

	public void rePaint() {
		gameFrame.repaint();
	}

	//Since we want to add all instances as their runtime classes this still has to be individual methods.
	public void addZombie() {
		//gameItems.add(new Zombie(1350,(int)(Math.random()*400+20),ZombieType.CONEHEAD));
		gameItems.add(new Zombie(1350,(int)(Math.random()*400+20),ZombieType.RANDOM));
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
	
	private class UpdateThread extends Thread {
		//Mostly taken from here
		//http://stackoverflow.com/questions/18283199/java-main-game-loop
	   private boolean running = true;
	   private final int updatesPerSecond = 60; //Updates the position in the logic
	   private final int framesPerSecond = 40; //Updates the visible part 
	   private long initialTime = System.nanoTime();  //Obs nanosec that means a lot of zeros....
	   private final double timeU = 1000000000 / updatesPerSecond; //This gives amount of nanosec for each update
	   private final double timeF = 1000000000 / framesPerSecond; //This gives amount of nanosec for each frameupdate
	   private double deltaU = 0, deltaF = 0;
	   private int frames = 0, ticks = 0;
	   private long timer = System.currentTimeMillis();
	   private boolean RENDER_TIME = true;
	   
	// This is a better implementation but harder to understand......
	// Better because it separates the update from the rendering 
	// Nicer because update times are displayed..
	 @Override
	 public void run() {
		  while (running) {
		 
		      long currentTime = System.nanoTime();
		      deltaU = deltaU + (currentTime - initialTime) / timeU; 
		      deltaF = deltaF + (currentTime - initialTime) / timeF;
		      initialTime = currentTime;
		 
		      if (deltaU >= 1) { //Time to Update Positions
		      	  update(); //Call this method and update positions etc
		          ticks++;
		          deltaU--;
		      }
		 
		      if (deltaF >= 1) { //Time to update GUI
		          //render();        	
		 			 rePaint(); //Call this method to repaint
		          frames++;
		          deltaF--;
		      }
		 
		      if (System.currentTimeMillis() - timer > 1000) {
		          if (RENDER_TIME) {
		              System.out.println(String.format("Updates per second: %s, Frames per second: %s", ticks, frames));
		          }
		          frames = 0;
		          ticks = 0;
		          timer += 1000;
		      }
		  }
		}
	}
}

