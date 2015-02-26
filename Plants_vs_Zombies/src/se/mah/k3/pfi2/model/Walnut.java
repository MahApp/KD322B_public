package se.mah.k3.pfi2.model;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.Random;

public class Walnut extends Plant {
private Image image; 
Random rand = new Random();
Random rand2 = new Random();

//random position
int randomPositionY = rand.nextInt(450);
int randomPositionX = rand2.nextInt(900);

	public Walnut(int positionXIn, int positionYIn) {
		super(positionXIn, positionYIn);
		this.setPositionY(0);
		this.setPositionX(100);
		
this.setPositionX(this.randomPositionX);
this.setPositionY(this.randomPositionY);

//Load walnut image
		this.image = Toolkit.getDefaultToolkit().getImage(Walnut.class.getResource("/se/mah/k3/pfi2/images/walnut.png"));
	}

	@Override
	public void doYourThing() {
		setPositionX(getPositionX());
		this.setPositionY(getPositionY());
	}

	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		return image;
	}

}
