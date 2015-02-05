package se.mah.k3.pfi2;

public class Plant {

	private String name;
	private int positionX;
	private int positionY;
	private String type;

	public Plant(String nameIn, int positionXIn, int positionYIn, String typeIn) {
		this.name = nameIn;
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
	
	
	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}

	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}

	public String getName(){
		return name;
	}

}