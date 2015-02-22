package se.mah.k3.pfi2.model;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.Timer;
import java.util.Random;

import se.mah.k3.pfi2.control.Controller;
import se.mah.k3.pfi2.view.GamePanel;

import java.util.Timer;

public class SunFlower extends Plant {

	private Image image;
	private Sun sun;
	private int sunTime = 1;
	private int posX;
	private int posY;
	private Controller controller;
	
	public SunFlower(int positionXIn, int positionYIn) {
		super(positionXIn, positionYIn);
		posX = positionXIn;
		posY = positionYIn;
		image = Toolkit.getDefaultToolkit().getImage(SunFlower.class.getResource("/se/mah/k3/pfi2/images/Sunflower1.png")); //added our Sunflower image to the game. Anton
	}

	@Override
	public void act() {
					
	}

	@Override
	public void doYourThing() {
		
		sunTime ++;

		System.out.println(sunTime);
		if(sunTime==1000){
			//controller.addSun(); //nullpointer! We don't understand why we can't do this.
			//You don't have any reference to the controller you have only declared a variable named controller.
			//If you create an new one we would have two controllers and that is not good.
			//Instead create methods that measure the amount of sunlight the sunflower has collected.
			//So the controller can see that and also decrease tha amount if you bye something.
			//create sun here. 
		}else{
			
		}
		
	}

	@Override
	public Image getImage() {
		return image; //Returns image. Anton
		//Here you should return different images so the flower sways.
		
	}

}
