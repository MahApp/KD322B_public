package se.mah.k3.pfi2;

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
			   controller.update(); //Call this method and update positions etc
			   controller.rePaint(); //Call this method to repaint
			   timer = timer + timeBetweenRepaint;
		   }
	   }
   }  
}


//This is a better implementation but harder to understand......
//Better because it separates the updata from the rendering 
//Nicer because update times are displayed..
//@Override
//public void run() {
//
//long initialTime = System.nanoTime();
////final double timeU = 1000000000 / UPS;
////final double timeF = 1000000000 / FPS;
//final double timeU = 1000000000 / 60;
//final double timeF = 1000000000 / 60;
//double deltaU = 0, deltaF = 0;
//int frames = 0, ticks = 0;
//long timer = System.currentTimeMillis();
//boolean RENDER_TIME = true;
//
//   while (running) {
//
//       long currentTime = System.nanoTime();
//       deltaU += (currentTime - initialTime) / timeU;
//       deltaF += (currentTime - initialTime) / timeF;
//       initialTime = currentTime;
//
//       if (deltaU >= 1) {
//           //getInput();
//           //update();
//       	controller.update(); //Call this method and update positions etc
//           ticks++;
//           deltaU--;
//       }
//
//       if (deltaF >= 1) {
//           //render();        	
//			 controller.rePaint(); //Call this method to repaint
//           frames++;
//           deltaF--;
//       }
//
//       if (System.currentTimeMillis() - timer > 1000) {
//           if (RENDER_TIME) {
//               System.out.println(String.format("UPS: %s, FPS: %s", ticks, frames));
//           }
//           frames = 0;
//           ticks = 0;
//           timer += 1000;
//       }
//   }
//}