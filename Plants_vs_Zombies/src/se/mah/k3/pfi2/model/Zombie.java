package se.mah.k3.pfi2.model;

import java.awt.Image;
import java.util.Random;

import se.mah.k3.pfi2.control.GameItem;

public class Zombie implements GameItem {
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

	@Override
	public void doYourThing() {
		this.positionX = this.positionX +1;
		
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
