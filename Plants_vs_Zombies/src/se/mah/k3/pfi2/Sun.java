package se.mah.k3.pfi2;

import java.util.Random;

public class Sun {

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

 
	public void fall(){
		
		if(this.positionY < r2){
		this.positionY = this.positionY + 2;
		}
	}
}