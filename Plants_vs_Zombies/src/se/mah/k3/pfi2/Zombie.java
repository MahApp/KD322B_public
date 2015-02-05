package se.mah.k3.pfi2;

import java.util.Random;

public class Zombie {
	private String name;
	private int positionX;
	

	private int positionY;
	private String type;
	
	public Zombie(String nameIn, int positionXIn, int positionYIn, String typeIn) {		
		this.name = nameIn;
		this.positionX = positionXIn;
		this.positionY = positionYIn;
		this.type = typeIn;
	}
	
	public String getName(){
		return name;
	}
	public int getPositionX() {
		return positionX;
	}

	public int getPositionY() {
		return positionY;
	}
	
	/**This makes the zoombie walk forward*/
	public void walk(){
		// Här skall Zombien gå
		this.positionX = this.positionX +1;
	}

}
