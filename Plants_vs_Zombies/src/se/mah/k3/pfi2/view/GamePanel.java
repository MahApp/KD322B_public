package se.mah.k3.pfi2.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import se.mah.k3.pfi2.control.Controller;
import se.mah.k3.pfi2.control.GameItem;
import se.mah.k3.pfi2.model.LawnMover;
import se.mah.k3.pfi2.model.PeaShooter;
import se.mah.k3.pfi2.model.Plant;
import se.mah.k3.pfi2.model.Sun;
import se.mah.k3.pfi2.model.Zombie;

import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class GamePanel extends JPanel {
	private int drawX = 0;
	private int drawY = 50;
	private Controller controller;

	
	public GamePanel(Controller c) {
		this.controller = c;
		setLayout(null);
		
//		JLabel lblNewLabel = new JLabel("New label");
//		lblNewLabel.setIcon(new ImageIcon(GamePanel.class.getResource("/se/mah/k3/pfi2/images/BackDay.jpg")));
//		lblNewLabel.setBounds(10, 11, 1400, 600);
//		add(lblNewLabel);
	}

	protected void paintComponent(Graphics g) {
		 //g.setColor(getBackground());
		 g.drawImage(Toolkit.getDefaultToolkit().getImage(GamePanel.class.getResource("/se/mah/k3/pfi2/images/BackDay.jpg")), 10, 11, null);
         //g.fillRect(0, 0, getWidth(), getHeight());
		
		//This try catch is to prevent windowbuilder from crashing 
	    try { 
	    	g.setColor(Color.RED);
			for (GameItem p : controller.getGameItems()) {
				if (p.getImage()!=null){
					g.drawImage(p.getImage(), p.getPositionX(), p.getPositionY(), null);
				}else{
					g.fillOval(p.getPositionX(), p.getPositionY(), 10, 10);
				}
			}
		} catch (Exception e) {
			//Ok so what
		}
	}
	
	public void render() {
		this.repaint();
	}
}
