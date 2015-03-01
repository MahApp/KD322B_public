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
	private long lastTime;

	private int ageInSeconds = 0;
	public int sunlight = 0;
	public SunFlower(int positionXIn, int positionYIn) {
		super(positionXIn, positionYIn);
		posX = positionXIn;
		posY = positionYIn;
		//updated the sunflower image to a gif with a transparent background
		image = Toolkit.getDefaultToolkit().getImage(SunFlower.class.getResource("/se/mah/k3/pfi2/images/sunflower_transparent.gif")); 

		lastTime = System.currentTimeMillis();
	}

	@Override
	public void doYourThing() {
		//Measuring age
		if (System.currentTimeMillis()-lastTime >= 1000){ //This is not exact since the Sunflower only is updated 40 times per sec...
			ageInSeconds = ageInSeconds + 1;  
			lastTime = System.currentTimeMillis();
			System.out.println("Sunflower age: " + ageInSeconds);
		}
		
		
		//increases the amount of sunlight by 25 every ten seconds (according to ageInSeconds)
		//but it iterates too many times so it makes too much sunlight... how to fix this?
		if(ageInSeconds % 10 == 0){
			sunlight += 25;
			ageInSeconds += 1; //quick fix...
			System.out.println("Amount of sunlight: " + sunlight);
		}
		
		
		//System.out.println(sunTime);
		//if(sunTime==1000){
			//controller.addSun(); //nullpointer! We don't understand why we can't do this.
			//You don't have any reference to the controller you have only declared a variable named controller.
			//If you create an new one we would have two controllers and that is not good.
			//Instead create methods that measure the amount of sunlight the sunflower has collected.
			//So the controller can see that and also decrease tha amount if you bye something.
			//create sun here. 
		
	}
	
	//a getter method so the controller can see the amount of sunlight the sunflower has created
	public int getAmountOfSunlight(){
		return sunlight;
	}

	@Override
	public Image getImage() {
		return image; //Returns image. Anton
		//Here you should return different images so the flower sways.
		
	}

}
