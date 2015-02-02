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

public String getName(){
	return name;
}


}