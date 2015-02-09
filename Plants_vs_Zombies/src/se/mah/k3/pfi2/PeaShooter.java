package se.mah.k3.pfi2;

public class PeaShooter extends Plant {

	public PeaShooter(int positionXIn, int positionYIn) {
		super(positionXIn, positionYIn);
	}



	@Override
	public void act() {
		setPositionX(getPositionX()+1);
		setPositionY(getPositionY()+1);
	}
	
}
