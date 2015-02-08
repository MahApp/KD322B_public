package se.mah.k3.pfi2;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

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
			for (Plant p : controller.getPlants()) {
				g.fillOval(p.getPositionX(), p.getPositionY(), 10, 10);
			}
			g.setColor(Color.GRAY);
			for (Zombie z : controller.getZombies()) {
				g.fillOval(z.getPositionX(), z.getPositionY(), 10, 10);
			}
			g.setColor(Color.YELLOW);
			for (Sun s : controller.getSuns()) {
				g.fillOval(s.getPositionX(), s.getPositionY(), 10, 10);
			}
			g.setColor(Color.BLUE);
			for (LawnMover lm : controller.getMovers()) {
				g.fillOval(lm.getPositionX(), lm.getPositionY(), 10, 10);
			}
		} catch (Exception e) {
			//Ok so what
		}
	}
	
	public void render() {
		this.repaint();
	}
}
