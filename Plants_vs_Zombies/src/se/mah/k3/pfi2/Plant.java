package se.mah.k3.pfi2;

public abstract class Plant {

	private int positionX;
	private int positionY;

	public Plant(int positionXIn, int positionYIn) {
		this.positionX = positionXIn;
		this.positionY = positionYIn;
	}

	public int getPositionX() {
		return positionX;
	}

	public int getPositionY() {
		return positionY;
	}
	
	
	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}

	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}


	public abstract void act();

}