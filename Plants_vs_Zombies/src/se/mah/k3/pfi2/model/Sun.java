package se.mah.k3.pfi2.model;

import java.awt.Image;
import java.util.Random;

import se.mah.k3.pfi2.control.GameItem;

public class Sun implements GameItem{

	private int positionX;
	private int positionY;
	Random rand = new Random();
	int r = rand.nextInt(500);
	int r2 = rand.nextInt(350);
	public Sun(int positionXIn, int positionYIn) {
		
		this.positionX = positionXIn + r;
		this.positionY = positionYIn;
	}

	public int getPositionX() {
		
		return positionX;
	}

	public int getPositionY() {
		return positionY;
	}

 


	@Override
	public void doYourThing() {
		if(this.positionY < r2){
			this.positionY = this.positionY + 2;
			}
		
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

	@Override
	public void setPositionY(int y) {
		// TODO Auto-generated method stub
		
	}
}