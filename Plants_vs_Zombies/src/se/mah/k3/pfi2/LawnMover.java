package se.mah.k3.pfi2;

/**This is the lawnmover. It is the last defense against the hungry Zombies*/
public class LawnMover {

	private int positionX;
	private int positionY;
	private String name ="Ures";
	private String action;
	

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



	public void isItTimeToAct() {
		positionX = positionX+1;
		positionY = positionY+2;
		
	}

}

