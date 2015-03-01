package se.mah.k3.pfi2.model;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.Random;

import se.mah.k3.pfi2.control.GameItem;

public class Sun implements GameItem {

	private Image image;
	private int positionX;
	private int positionY;
	Random rand = new Random();
	int r = rand.nextInt(950);
	int r2 = rand.nextInt(450) + 50;
	int expireTime = 0;

	public Sun(int positionXIn, int positionYIn) {

		this.positionX = positionXIn + r;
		this.positionY = positionYIn;

		this.image = Toolkit.getDefaultToolkit().getImage(
				Sun.class.getResource("/se/mah/k3/pfi2/images/SunNoBG.png"));

	}

	public int getPositionX() {

		return positionX;
	}

	public int getPositionY() {
		return positionY;
	}

	@Override
	public void doYourThing() {

		if (this.positionY < r2) {
			this.positionY = this.positionY + 2;

		}

		if (expireTime < 600) {
			expireTime = expireTime + 1;
			System.out.println(expireTime);
		} else if (expireTime >= 600) {
			setPositionX(-500);
			expireTime = 0;

		}

	}

	@Override
	public Image getImage() {

		// TODO Auto-generated method stub
		return image;
	}

	@Override
	public void setPositionX(int positionX) {
		// TODO Auto-generated method stub
		this.positionX = positionX;
	}

	@Override
	public void setPositionY(int positionY) {
		// TODO Auto-generated method stub
		this.positionY = positionY;

	}
}