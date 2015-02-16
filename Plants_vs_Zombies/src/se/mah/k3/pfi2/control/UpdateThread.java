package se.mah.k3.pfi2.control;

public class UpdateThread extends Thread {
   private boolean running = true;
   private Controller controller;
   private final int timeBetweenRepaint = 10; //Millisecond  1000 is 1 sec
   public UpdateThread(Controller c) {
	   this.controller = c;  //Lets remember whom we belong to
   }

   @Override
   public void run() {
	   long timer = System.currentTimeMillis();
	   while (running) {
		   if (System.currentTimeMillis() - timer > timeBetweenRepaint) { 
			   controller.rePaint(); //Call this method to repaint
			   controller.update(); //Call this method and update positions etc
			   timer = timer + timeBetweenRepaint;
		   }
	   }
   }  
}