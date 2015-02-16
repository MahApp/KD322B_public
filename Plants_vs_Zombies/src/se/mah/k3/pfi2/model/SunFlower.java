package se.mah.k3.pfi2.model;

import java.awt.Image;

public class SunFlower extends Plant {

	public SunFlower(int positionXIn, int positionYIn) {
		super(positionXIn, positionYIn);
	}

	@Override
	public void act() {
	setPositionX(5);
	setPositionY(5);
	//sunflower doesn't move from original place
	//add new sun after specified time
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
