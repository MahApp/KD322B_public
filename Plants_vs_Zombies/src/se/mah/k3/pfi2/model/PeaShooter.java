package se.mah.k3.pfi2.model;

import java.awt.Image;

import javax.swing.ImageIcon;

import se.mah.k3.pfi2.view.GameFrame;

public class PeaShooter extends Plant {
	
	public static int lastYPos = 0;
	private Image image;
	int x;
	int y;
	
	
	public PeaShooter(int positionXIn, int positionYIn) {
		super(positionXIn, positionYIn);
		image = new ImageIcon(GameFrame.class.getResource("/se/mah/k3/pfi2/images/Peashooter1.png"));
		x = getPositionX();
		y = getPositionY();
		
		y += lastYPos + 10;
		
		lastYPos = y;
		
	}



	@Override
	public void act() {
		
		setPositionX(x);
		setPositionY(y);
	}



	@Override
	public void doYourThing() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public ImageIcon getImage() {
		// TODO Auto-generated method stub
		return new ImageIcon(GameFrame.class.getResource("/se/mah/k3/pfi2/images/Peashooter1.png"));
	}
	
}
