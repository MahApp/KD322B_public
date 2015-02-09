package se.mah.k3.pfi2;

public class PeaShooter extends Plant {
	
	public static int lastYPos = 0;
	int x;
	int y;
	
	
	public PeaShooter(int positionXIn, int positionYIn) {
		super(positionXIn, positionYIn);
		
		x = getPositionX();
		y = getPositionY();
		
		y += lastYPos + 10;
		
		lastYPos = y;
		
	}



	@Override
	public void act() {
		
		setPositionX(x);
		setPositionY(y);
	}
	
}
