package se.mah.k3.pfi2.model;

import java.awt.Image;
import java.awt.Toolkit;


import java.util.Random;

import se.mah.k3.pfi2.view.GamePanel;

public class SunFlower extends Plant {

	private Image image;
	
	
	public SunFlower(int positionXIn, int positionYIn) {
		super(positionXIn, positionYIn);
		image = Toolkit.getDefaultToolkit().getImage(SunFlower.class.getResource("/se/mah/k3/pfi2/images/Sunflower1.png")); //added our Sunflower image to the game. Anton
	}

	@Override
	public void act() {
		Random random = new Random();
	setPositionX(random.nextInt(100)+1);						//A Sunflower, from what I can understand, remains on its position. Anton
	setPositionY(random.nextInt(100)+1);						//I had an idea of trying to randomize the positions when clicking the btn, not sure if this works. Anton
																
	//add new sun after specified time << This is left to do
	}

	@Override
	public void doYourThing() {
		Random random = new Random();
		setPositionX(random.nextInt(100)+1);						//A Sunflower, from what I can understand, remains on its position. Anton
		setPositionY(random.nextInt(100)+1);	
	}

	@Override
	public Image getImage() {
		return image; //Returns image. Anton
		
	}

}
