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
		setBounds(100, 100, 632, 700);
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
		panel_1.setBounds(10, 594, 518, 56);
		contentPane.add(panel_1);
			JButton btnAddZombie = new JButton("Add Zombie");
			panel_1.add(btnAddZombie);
			
			JButton btnAddSun = new JButton("Add Sun");
			panel_1.add(btnAddSun);
			
			JButton btnAddPlant = new JButton("Add Plant");
			panel_1.add(btnAddPlant);
			btnAddPlant.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					controller.addPlant();
				}
			});
			btnAddSun.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					controller.addSun();
				}
			});
			btnAddZombie.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					controller.addZombie();
				}
			});
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
