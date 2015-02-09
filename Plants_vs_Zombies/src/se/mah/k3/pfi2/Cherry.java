package se.mah.k3.pfi2;

public class Cherry extends Plant {

	public Cherry(int positionXIn, int positionYIn) {
		super(positionXIn, positionYIn);
///Test
	}
	
	@Override
	public void act() {
		setPositionX(getPositionX()+4);
		setPositionY(getPositionY()+5);
	}

}
