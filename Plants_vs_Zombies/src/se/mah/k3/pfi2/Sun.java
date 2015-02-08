package se.mah.k3.pfi2;

public class Sun {

	private int positionX;
	private int positionY;
	
	public Sun(int positionXIn, int positionYIn) {
		
		this.positionX = positionXIn;
		this.positionY = positionYIn;
	}

	public int getPositionX() {
		return positionX;
	}

	public int getPositionY() {
		return positionY;
	}

 
	public void fall(){
		this.positionY = this.positionY + 2;
	}
}
