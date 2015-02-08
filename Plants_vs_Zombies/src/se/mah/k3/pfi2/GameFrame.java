package se.mah.k3.pfi2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;

import java.awt.FlowLayout;

import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GameFrame extends JFrame {

	private JPanel contentPane;
	private JTextArea textArea;
	private GamePanel gamepanel;
	private Controller controller;
	/**
	 * Create the frame.
	 */
	public GameFrame(Controller c) {
		this.controller = c;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 632, 780);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "GameInfo", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 402, 600, 193);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 21, 580, 161);
		panel.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		gamepanel = new GamePanel(controller);
		gamepanel.setLocation(10, 11);
		gamepanel.setSize(600, 391);
		gamepanel.setBackground(new Color(102, 204, 51));
		gamepanel.setBorder(null);
		contentPane.add(gamepanel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Controlls", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 594, 518, 136);
		//Alla knappar som skickar tillbaka ett anrop till Controllern för att skapa de olika objekten.
		contentPane.add(panel_1);
			JButton btnZombie = new JButton("Zombie");
			btnZombie.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					controller.addZombie();
				}
			});
			panel_1.add(btnZombie);
			
			JButton btnSun = new JButton("Sun");
			btnSun.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					controller.addSun();
				}
			});
			panel_1.add(btnSun);
			
			JButton btnMover = new JButton("Mover");
			btnMover.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					controller.addLawnMover();
				}
			});
			panel_1.add(btnMover);
			
			JPanel panel_2 = new JPanel();
			panel_2.setBorder(new TitledBorder(null, "Plants", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_1.add(panel_2);
			
			JButton btnPeaShooter = new JButton("PeaShooter");
			btnPeaShooter.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					controller.addPeaShooter();
				}
			});
			panel_2.add(btnPeaShooter);
			
			JButton btnSunflower = new JButton("SunFlower");
			btnSunflower.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					controller.addSunFlower();
				}
			});
			panel_2.add(btnSunflower);
			
			JButton btnCherry = new JButton("Cherry");
			btnCherry.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			panel_2.add(btnCherry);
			
			JButton btnWalnut = new JButton("Walnut");
			btnWalnut.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					controller.addWalnut();
				}
			});
			panel_2.add(btnWalnut);
			
			JButton btnNewButton_1 = new JButton("PotatoMine");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					controller.addPotatoMine();
				}
			});
			panel_2.add(btnNewButton_1);
			
			
			
	}
	
	public void appendToGameInfoPanel(String s){
		textArea.append(s);
	}
	
	public void clearGameInfoPanel(){
		textArea.setText("");
	}
	
	public void repaint(){
		gamepanel.render();
	}
}
