package se.mah.k3.pfi2.model;

import java.awt.Image;
import java.awt.Toolkit;

import se.mah.k3.pfi2.view.GameFrame;

public class PeaShooter extends Plant {
	
	public static int lastYPos = 0;
	private Image image;

	
	
	public PeaShooter(int positionXIn, int positionYIn) {
		super(positionXIn, positionYIn);
		image = Toolkit.getDefaultToolkit().getImage(PeaShooter.class.getResource("/se/mah/k3/pfi2/images/Peashooter1.png"));

		
	}



	@Override
	public void doYourThing() {
//		setPositionX(x);
//		setPositionY(y);
		
	}



	@Override
	public Image getImage() {
		return image;
	}



	@Override
	public void act() {
		// TODO Auto-generated method stub
		
	}
	
}
