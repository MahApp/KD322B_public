package se.mah.k3.pfi2.model;

import java.awt.Image;
import java.awt.Toolkit;

public class PotatoMine extends Plant {

	private int move = 0;
	private int aliveTime = 0;
	private boolean alive = true;
	private boolean moving = false;
	//private Image image;
	Image[] image = new Image[6];
	


		
	public PotatoMine(int positionXIn, int positionYIn) {
		super(positionXIn, positionYIn);
		setPositionX(450);
		setPositionY(100);
		
		
		image[0] = Toolkit.getDefaultToolkit().getImage(PeaShooter.class.getResource("/se/mah/k3/pfi2/images/potatomine1.png"));
		image[1] = Toolkit.getDefaultToolkit().getImage(PeaShooter.class.getResource("/se/mah/k3/pfi2/images/potatomine2.png"));
		image[2] = Toolkit.getDefaultToolkit().getImage(PeaShooter.class.getResource("/se/mah/k3/pfi2/images/potatomine3.png"));
		image[3] = Toolkit.getDefaultToolkit().getImage(PeaShooter.class.getResource("/se/mah/k3/pfi2/images/potatomine2.png"));
		image[4] = Toolkit.getDefaultToolkit().getImage(PeaShooter.class.getResource("/se/mah/k3/pfi2/images/exploded.png"));
		image[5] = Toolkit.getDefaultToolkit().getImage(PeaShooter.class.getResource("/se/mah/k3/pfi2/images/invisibility.png"));
	}

	@Override
	public void doYourThing() {
		aliveTime =aliveTime +1;
		if(aliveTime > 100){
			alive = false;
			setPositionX(320);
			setPositionY(50);
		}
				
		setPositionX(getPositionX() + move);
		setPositionY(getPositionY());
		if(moving == true){
			move = 1;
		} else if(moving == false){
			move = -1;
		}
		
		if(super.getPositionX() >= 435){
			moving = false;
		} else if(super.getPositionX() <= 433){
			moving = true;
		}
		
	}

	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		if(alive == true){
		return image[0];		
		} else if(alive == false && aliveTime < 120){
			return image[4];
		} else{
			return image[5];
		}
	}
}
