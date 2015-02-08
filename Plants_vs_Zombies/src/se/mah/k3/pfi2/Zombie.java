package se.mah.k3.pfi2;

import java.util.Random;

public class Zombie {
	private int positionX;
	private int positionY;
	public enum ZombieType {NORMAL,FLAG,CONEHEAD}; 
	private ZombieType type;

	public Zombie(int positionXIn, int positionYIn, ZombieType typeIn) {		
		this.positionX = positionXIn;
		this.positionY = positionYIn;
		this.type = typeIn;
	}

	public int getPositionX() {
		return positionX;
	}

	public int getPositionY() {
		return positionY;
	}
	
	/**This makes the zoombie walk forward*/
	public void walk(){
		//HÄr kommer en switch på de olika ZombieTyperna
		switch (type) {
		case NORMAL:
			
			break;
		case FLAG:
			
			break;
		case CONEHEAD:
			
			break;
		default:
			break;
		}

		this.positionX = this.positionX +1;
	}

}
