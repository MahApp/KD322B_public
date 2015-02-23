package se.mah.k3.pfi2.model;

import java.awt.Image;
import java.awt.Toolkit;

public class PotatoMine extends Plant {

	private int move = 0;
	private boolean moving = false;
	private Image image;


		
	public PotatoMine(int positionXIn, int positionYIn) {
		super(positionXIn, positionYIn);
		
		image = Toolkit.getDefaultToolkit().getImage(PeaShooter.class.getResource("/se/mah/k3/pfi2/images/potatomine.png"));


	}

	@Override
	public void doYourThing() {
		getImage();
		setPositionX(getPositionX() + move);
		setPositionY(getPositionY());
		if(moving == true){
			move = 1;
		} else if(moving == false){
			move = -1;
		}
		
		if(super.getPositionX() >= 20){
			moving = false;
		} else if(super.getPositionX() <= 0){
			moving = true;
		}
		
	}

	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		return this.image;
	}
}
