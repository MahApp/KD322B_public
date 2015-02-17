package se.mah.k3.pfi2.model;

import se.mah.k3.pfi2.control.GameItem;

public abstract class Plant implements GameItem {

	private int positionX;
	private int positionY;

	public Plant(int positionXIn, int positionYIn) {
		this.positionX = positionXIn;
		this.positionY = positionYIn;
	}

	@Override	
	public int getPositionX() {
		return positionX;
	}

	@Override
	public int getPositionY() {
		return positionY;
	}
	
	@Override
	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}

	@Override
	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}


	public abstract void act();

}