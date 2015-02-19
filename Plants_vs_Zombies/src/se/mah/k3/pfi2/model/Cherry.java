package se.mah.k3.pfi2.model;

import java.awt.Image;

import javax.swing.ImageIcon;

import java.awt.Toolkit;
import java.util.Random; // Import the random library

public class Cherry extends Plant {
	private Image image;
	private int shake = 250;

	Random rand = new Random();
	int randomPositionY = rand.nextInt((390 - 0)); // Generate a random number
													// between 0 & 391 and
													// assign it to
													// randomPositionY

	public Cherry(int positionXIn, int positionYIn) {
		super(positionXIn, positionYIn);
		this.setPositionY(0); // set positionY to 0 for cheery to spawn at the
								// top of the screen
		this.setPositionX(250);
		image = Toolkit.getDefaultToolkit().getImage(
				Cherry.class
						.getResource("/se/mah/k3/pfi2/images/cherrybombz.png")); // add
																					// custom
																					// image
																					// for
																					// cherry
																					// bomb!

	}

	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		return image;
	}

	@Override
	public void act() {

		// if positionY is less than the random number in randomPositionY, then
		// add 2 to cherry's positionY until positionY is equal to the random
		// generated number in randomPositionY

	}

	@Override
	public void doYourThing() {
		if (this.getPositionY() < this.randomPositionY) {
			this.setPositionY(getPositionY() + 2);
			
}
	}
}
