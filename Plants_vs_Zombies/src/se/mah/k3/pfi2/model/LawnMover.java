package se.mah.k3.pfi2.model;

import java.awt.Image;

import se.mah.k3.pfi2.control.GameItem;

/**This is the lawnmover. It is the last defense against the hungry Zombies*/
public class LawnMover implements GameItem {

	private int positionX;
	private int positionY;
	private String name ="Urestanke";
	

	public LawnMover(int positionX, int positionY) {
		this.positionX = positionX;
		this.positionY = positionY;
	}



	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}
	
	
	public int getPositionY() {
		return this.positionY;
	}
	
	public int getPositionX() {
		return positionX;
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



	@Override
	public void setPositionX(int x) {
		// TODO Auto-generated method stub
		
	}

}

