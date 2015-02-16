package se.mah.k3.pfi2.view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import se.mah.k3.pfi2.control.Controller;
import se.mah.k3.pfi2.control.GameItem;
import se.mah.k3.pfi2.model.LawnMover;
import se.mah.k3.pfi2.model.Plant;
import se.mah.k3.pfi2.model.Sun;
import se.mah.k3.pfi2.model.Zombie;

public class GamePanel extends JPanel {
	private int drawX = 0;
	private int drawY = 50;
	private Controller controller;

	
	public GamePanel(Controller c) {
		this.controller = c;
	}

	protected void paintComponent(Graphics g) {
		 g.setColor(getBackground());
         g.fillRect(0, 0, getWidth(), getHeight());
		
		//This try catch is to prevent windowbuilder from crashing 
	    try { 
	    	g.setColor(Color.RED);
			for (GameItem p : controller.getGameItems()) {
				g.fillOval(p.getPositionX(), p.getPositionY(), 10, 10);
			}
		} catch (Exception e) {
			//Ok so what
		}
	}
	
	public void render() {
		this.repaint();
	}
}
