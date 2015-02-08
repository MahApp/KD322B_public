package se.mah.k3.pfi2;

public class Walnut extends Plant {

	public Walnut(int positionXIn, int positionYIn) {
		super(positionXIn, positionYIn);

	}

	@Override
	public void act() {
		setPositionX(getPositionX()+1);
		this.setPositionY(getPositionY()+1);
		
	}

}
