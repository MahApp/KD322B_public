package se.mah.k3.pfi2.model;

import java.awt.Image;

public class Walnut extends Plant {

	public Walnut(int positionXIn, int positionYIn) {
		super(positionXIn, positionYIn);

	}

	@Override
	public void act() {
		setPositionX(getPositionX()+1);
		this.setPositionY(getPositionY()+1);
		
	}

	@Override
	public void doYourThing() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		return null;
	}

}
