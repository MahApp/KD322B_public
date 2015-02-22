package se.mah.k3.pfi2.model;

import java.awt.Image;

public class PotatoMine extends Plant {

	private int move = 0;
	private boolean moving = false;


		
	public PotatoMine(int positionXIn, int positionYIn) {
		super(positionXIn, positionYIn);


	}

	@Override
	public void doYourThing() {
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
		return null;
	}
}
