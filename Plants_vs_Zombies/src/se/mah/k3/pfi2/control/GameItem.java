package se.mah.k3.pfi2.control;

import java.awt.Image;


//The heart of the interface class we force all classes implementing this interface to have their own 
//version of the methods.
public interface GameItem {
	public void doYourThing();
	public Image getImage();
	public int getPositionX();
	public int getPositionY();
	public void setPositionX(int x);
	public void setPositionY(int y);
}
