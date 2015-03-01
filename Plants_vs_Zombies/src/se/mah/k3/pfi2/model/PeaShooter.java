package se.mah.k3.pfi2.model;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.Random;

public class PeaShooter extends Plant {

	private Image image;


	public PeaShooter(int positionXIn, int positionYIn) {
		super(positionXIn, positionYIn);
		
		//Generate random number dictating which row to put the Pea Shooter
		Random random = new Random();
		int low = 1;
		int high = 6;
		int row = random.nextInt(high-low) + low;
		
		this.setPositionX(270);
		this.setPositionY(row*100-10); //row * 100px - 10px

		//Load animated image
		this.image = Toolkit.getDefaultToolkit().getImage(Walnut.class.getResource("/se/mah/k3/pfi2/images/Peashooter.gif"));

	}



	@Override
	public void doYourThing() {
	}

	@Override
	public Image getImage() {
		return image;
	}

}
