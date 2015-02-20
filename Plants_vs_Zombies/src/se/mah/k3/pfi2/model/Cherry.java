package se.mah.k3.pfi2.model;

import java.awt.Image;

import javax.swing.ImageIcon;

import java.awt.Toolkit;
import java.util.Random; // Import the random library

public class Cherry extends Plant {
	private Image image;
	int aliveTime=0;
	

	Random rand = new Random();
	Random rand2 = new Random();
	int randomPositionY = rand.nextInt((390 - 0)); // Generate a random number
	int randomPositionX = rand2.nextInt((500 - 0)); // between 0 & 391 and
													// assign it to
													// randomPositionY

	public Cherry(int positionXIn, int positionYIn) {
		super(positionXIn, positionYIn);
		this.setPositionY(0); // set positionY to 0 for cheery to spawn at the
								// top of the screen

		this.setPositionX(250 + this.randomPositionX);
		this.image = Toolkit.getDefaultToolkit().getImage(
				Cherry.class
						.getResource("/se/mah/k3/pfi2/images/cherrybombz.png")); // add
																					// custom
																					// image
																					// for
																					// cherry
																					// bomb!

System.out.println(randomPositionX);
	}

	@Override
	public Image getImage() {

		return image;
	}

	@Override
	public void act() {

	}

	@Override
	public void doYourThing() {
		

		if (this.getPositionY() < this.randomPositionY) {
			this.setPositionY(getPositionY() + 1);

		}

if (this.getPositionY()==randomPositionY){
aliveTime = aliveTime + 1;

	System.out.println(aliveTime);
		
	}
	if(aliveTime==1000){
this.image=null;	
}

	}

	}

