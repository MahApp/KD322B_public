package se.mah.k3.pfi2.control;

public class UpdateThread extends Thread {
	//Mostly taken from here
	//http://stackoverflow.com/questions/18283199/java-main-game-loop
   private Controller controller;
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
  
   public UpdateThread(Controller c) {
	   this.controller = c;  //Lets remember whom we belong to
   }
   
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
	      	  controller.update(); //Call this method and update positions etc
	          ticks++;
	          deltaU--;
	      }
	 
	      if (deltaF >= 1) { //Time to update GUI
	          //render();        	
	 			 controller.rePaint(); //Call this method to repaint
	          frames++;
	          deltaF--;
	      }
	 
	      if (System.currentTimeMillis() - timer > 1000) {
	          if (RENDER_TIME) {
	              System.out.println(String.format("UPS: %s, FPS: %s", ticks, frames));
	          }
	          frames = 0;
	          ticks = 0;
	          timer += 1000;
	      }
	  }
	}
}

