package se.mah.k3.pfi2;

public class Sun {

	private String name;
	private int positionX;
	private int positionY;
	private String type;
	
	public Sun(String nameIn, int positionXIn, int positionYIn, String typeIn) {
		
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

	public String getName(){
		return name;
	}
	public void fall(){
		this.positionY = this.positionY + 2;
	}
}
