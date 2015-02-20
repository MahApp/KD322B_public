package se.mah.k3.pfi2.model;

import java.awt.Image;

import javax.swing.ImageIcon;

import java.awt.Toolkit;
import java.util.Random; // Import the random library

public class Cherry extends Plant {
	private Image image;
	private Image invisibility;
	private Image explosion;
	

	// counter for cherrybomb's lifetime.
	int aliveTime = 0;

	Random rand = new Random();
	Random rand2 = new Random();

	// Random numbers for x & y positions.
	int randomPositionY = rand.nextInt((390 - 0)); 
	int randomPositionX = rand2.nextInt((700 - 0));
													
													

	public Cherry(int positionXIn, int positionYIn) {
		super(positionXIn, positionYIn);
		this.setPositionY(0); // set positionY to 0 for cheery to spawn at the
								// top of the screen

		this.setPositionX(250 + this.randomPositionX);

		this.invisibility = Toolkit
				.getDefaultToolkit()
				.getImage(

				// Load invisibility image.
						Cherry.class
								.getResource("/se/mah/k3/pfi2/images/invisibility.gif"));

		// Load cherry bomb image
		this.image = Toolkit.getDefaultToolkit().getImage(

		Cherry.class.getResource("/se/mah/k3/pfi2/images/cherrybombz.png"));

		
		this.explosion = Toolkit.getDefaultToolkit().getImage(

		Cherry.class.getResource("/se/mah/k3/pfi2/images/explode.gif"));
		
		
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

		// Set position Y to it's current position +1 until it's equal to
		// randomPositionY.
		if (this.getPositionY() < this.randomPositionY) {
			this.setPositionY(getPositionY() + 1);

		}

		// When cherrybomb position is equal to randomposition Y it has landed.
		// Start counter "aliveTime" in order to remove it after x seconds.
		if (this.getPositionY() == randomPositionY) {
			aliveTime = aliveTime + 1;

		}

		// When aliveTime has counted to 1000, change cherrybomb image to
		// invisible (transparent) image.
		if (aliveTime == 1000) {
			this.image = (explosion);
			//this.image = (invisibility);

		}

	}

}
